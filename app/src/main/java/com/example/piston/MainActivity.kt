package com.example.piston

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.piston.data.myList

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            listView()
        }
    }


    @Preview(showBackground = true)
    @Composable
    fun preview() {
        listView()
    }

    @Composable
    fun listView() {
        data.getList()
        LazyColumn() {
            items(myList) { index ->
                if (index.id%2 == 1) {
                    if (index.id == myList.size) {
                        ui_content(index.itemImage, index.itemTitle, index.itemBody, 10.dp)
                    } else {
                        ui_content(index.itemImage, index.itemTitle, index.itemBody, 0.dp)
                    }
                }
                else {
                    if (index.id == myList.size) {
                        ui_content2(index.itemImage, index.itemTitle, index.itemBody, 10.dp)
                    } else {
                        ui_content2(index.itemImage, index.itemTitle, index.itemBody, 0.dp)
                    }
                }
            }

        }
    }
}








