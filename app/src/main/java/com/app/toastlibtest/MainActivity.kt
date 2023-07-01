package com.app.toastlibtest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.app.toastlibtest.ui.theme.ToastLibTestTheme
import com.app.toastly.Toaster

class MainActivity : ComponentActivity() {
    private lateinit var toaster: Toaster

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        toaster = Toaster()
        setContent {
            ToastLibTestTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android", Modifier, toaster)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier, toaster: Toaster) {
    val context = LocalContext.current
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
    Button(onClick = { toaster.showToast(context, "This is toastely library") }) {

    }

}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    ToastLibTestTheme {
//        Greeting("Android",Modifier, toaster)
//    }
//}