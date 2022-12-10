package com.chanoktrue.stateviewmodel.views

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chanoktrue.stateviewmodel.ui.theme.StateViewModelTheme
import com.chanoktrue.stateviewmodel.viewModels.MyViewModel

class MainActivity : ComponentActivity() {

    private val myViewModel by viewModels<MyViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StateViewModelTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting(viewModel = myViewModel)
                }
            }
        }
    }
}

@Composable
fun Greeting(viewModel: MyViewModel) {

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        TextField(value = viewModel.email, onValueChange = {viewModel.onEmailChange(it)})
        
        Spacer(modifier = Modifier.height(10.dp))
        
        TextField(value = viewModel.password, onValueChange = {viewModel.onPasswordChange(it)})

    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

    StateViewModelTheme {
        Greeting(viewModel = MyViewModel())
    }
}