package com.mesum.taskmanager

import android.os.Bundle
import android.os.Message
import android.widget.AlphabetIndexer
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mesum.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                  //  Greeting("Android")
                    CreateTask()
                }
            }
        }
    }
}

@Composable
fun CreateTask(){

    Column(modifier = Modifier
        .wrapContentHeight(Alignment.CenterVertically)
        .wrapContentWidth(
            Alignment.CenterHorizontally
        )) {
        Image(painter = painterResource(id = R.drawable.ic_task_completed), contentDescription = null)

        Text(text = "All Task Completed", fontSize = 24.sp, modifier = Modifier.padding(top = 24.dp, bottom = 8.dp))
        
        Text(text = "Nice Work", fontSize = 16.sp, modifier = Modifier.wrapContentWidth(Alignment.CenterHorizontally))
        
    }


    
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TaskManagerTheme {
      //  Greeting("Android")
    }
}