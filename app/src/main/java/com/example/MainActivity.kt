package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui.theme.AndroidstudyphoneTheme

class MainActivity : ComponentActivity() {
    // 应用入口
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 通过可组合函数定义布局
        setContent {
            AndroidstudyphoneTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

// 拥有Composable注解，可以用于setContent函数或者其他可组合的函数
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // Surface容器有color参数
    Surface(color = MaterialTheme.colorScheme.background) {
        Text(
            text = "Hi, my name is $name!",
            modifier = Modifier.padding(24.dp)
        )
    }

}

// 使用Preview注解可以看见当前应用的外观
// showBackground参数设置为true的话会有白色的背景
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    AndroidstudyphoneTheme {
        Greeting("YanQi")
    }
}