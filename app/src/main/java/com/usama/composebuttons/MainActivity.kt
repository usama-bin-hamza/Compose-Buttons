package com.usama.composebuttons

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.usama.composebuttons.ui.theme.ComposeButtonsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeButtonsTheme {
               Surface(
                   modifier = Modifier
                       .fillMaxSize()
                       .background(color = MaterialTheme.colorScheme.background),
               ) {
                   Column(
                       modifier = Modifier
                           .fillMaxSize(),
                       verticalArrangement = Arrangement.Center,
                       horizontalAlignment = Alignment.CenterHorizontally
                   ) {
                       Button(onClick = { /*TODO*/ }) {
                           Text(text = "Subscribe")
                       }

                       Spacer(modifier = Modifier.padding(top = 8.dp))

                       ElevatedButton(onClick = { /*TODO*/ }) {
                           Icon(
                               imageVector = Icons.Default.Add,
                               contentDescription = "Add to cart",
                               modifier = Modifier
//                                   .padding(end = 8.dp)
                                   .size(18.dp)
                           )
                           Spacer(modifier = Modifier.width(8.dp))
                           Text(text = "Add to cart")
                       }

                       Spacer(modifier = Modifier.padding(top = 8.dp))

                       FilledTonalButton(onClick = { /*TODO*/ }) {
                           Text(text = "Open in Browser")
                       }

                       Spacer(modifier = Modifier.padding(top = 8.dp))

                       OutlinedButton(onClick = { /*TODO*/ }) {
                           Text(text = "Back")
                       }

                       Spacer(modifier = Modifier.padding(top = 8.dp))
                       
                       TextButton(onClick = { /*TODO*/ }) {
                           Text(text = "Learn More")
                       }
                   }
               }
            }
        }
    }
}
