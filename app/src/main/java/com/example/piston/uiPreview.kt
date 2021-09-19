package com.example.piston

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.piston.data.getList
import com.example.piston.data.myList


object data {
    lateinit var myList: List<ScreenContent>

    @Composable
    fun getList(): List<ScreenContent> {
        myList = listOf(
            ScreenContent(
                1,
                R.drawable.logo,
                "Item #1",
                "this is the first article related to the traffic"
            ),
            ScreenContent(
                2,
                R.drawable.logo,
                "Item #2",
                "this is the second article related to the traffic"
            ),
            ScreenContent(
                3,
                R.drawable.logo,
                "Item #3",
                "this is the third article related to the traffic"
            ),
            ScreenContent(
                4,
                R.drawable.logo,
                "Item #4",
                "this is the second article related to the traffic"
            ),
            ScreenContent(
                5,
                R.drawable.logo,
                "Item #5",
                "this is the second article related to the traffic"
            ),
            ScreenContent(
                6,
                R.drawable.logo,
                "Item #6",
                "this is the second article related to the traffic"
            ),
            ScreenContent(
                7,
                R.drawable.logo,
                "Item #7",
                "this is the second article related to the traffic"
            ),
            ScreenContent(
                8,
                R.drawable.logo,
                "Item #8",
                "this is the second article related to the traffic"
            ),
        )
        return myList
    }
}

@Composable
fun ui_content(image: Int, title: String, body: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 10.dp),
            .background(color = Color.Blue),
            .shadow(5.dp),
        shape = RoundedCornerShape(30.dp)

    ) {
        Surface(color = Color.Gray) {

            Row(modifier = Modifier.fillMaxWidth()) {
                Image(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .height(180.dp)
                        .fillMaxWidth(0.4F),
                    imageVector = ImageVector.vectorResource(id = image),
                    contentDescription = ""
                )
                Spacer(
                    modifier = Modifier
                        .width(10.dp)
                        .height(180.dp)
                )
                Column {
                    Text(
                        modifier = Modifier
                            .layoutId("text_title")
                            .fillMaxWidth(1.0F)
                            .height(30.dp),
                        text = title,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp

                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        modifier = Modifier
                            .layoutId("text_title")
                            .fillMaxWidth(1.0F)
                            .height(140.dp), text = body,
                        textAlign = TextAlign.Center,
                        fontSize = 15.sp
                    )
                }
            }
        }
    }
}

@Composable
fun ui_content2(image: Int, title: String, body: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 10.dp),
            .shadow(5.dp),
            .background(color = Color.Blue),
            
        shape = RoundedCornerShape(30.dp)

    ) {
        Surface(color = Color.Gray) {

            Row(modifier = Modifier.fillMaxWidth()) {

                Column {
                    Text(
                        modifier = Modifier
                            .layoutId("text_title")
                            .fillMaxWidth(0.6F)
                            .height(30.dp),
                        text = title,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp

                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        modifier = Modifier
                            .layoutId("text_title")
                            .fillMaxWidth(0.6F)
                            .height(140.dp), text = body,
                        textAlign = TextAlign.Center,
                        fontSize = 15.sp
                    )
                }
                Spacer(
                    modifier = Modifier
                        .width(10.dp)
                        .height(180.dp)
                )
                Image(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .height(180.dp)
                        .fillMaxWidth(1.0F),
                    imageVector = ImageVector.vectorResource(id = image),
                    contentDescription = ""
                )
            }
        }
    }
}





