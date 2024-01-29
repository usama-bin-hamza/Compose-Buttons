package com.usama.composebuttons

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.usama.composebuttons.ui.theme.ComposeButtonsTheme
import javax.crypto.KeyGenerator

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

                       TextField()
                   }
               }
            }
        }
    }
}


@Composable
fun TextField() {

    var filledText by remember{
        mutableStateOf("")
    }

    androidx.compose.material3.TextField(
        value = filledText,
        onValueChange = { filledText = it },
        textStyle = LocalTextStyle.current.copy(
            textAlign = TextAlign.Right
        ),
        label = {
            Text(text = "Enter Your Weight")
        },

//        placeholder = {
//            Text(text = "Weight")
//        },

        leadingIcon = {
            Icon(imageVector = Icons.Default.Person, contentDescription = "Icon")
        },

        trailingIcon = {
            Icon(imageVector = Icons.Default.Person, contentDescription = "Icon")
        },

        suffix = {
            Text(text = "KG")
        },

        supportingText = {
                         Text(text = "Required")
        },

        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Decimal,
            imeAction = ImeAction.Next
        ),

        keyboardActions = KeyboardActions(
            onNext = {
                print("Pressed the onNext")
            }
        ),
    )

    Spacer(modifier = Modifier.height(30.dp))

    var outLinedText by remember{
        mutableStateOf("")
    }

    androidx.compose.material3.OutlinedTextField(
        value = outLinedText,
        onValueChange = { outLinedText = it },
        textStyle = LocalTextStyle.current.copy(
            textAlign = TextAlign.Right
        ),
        label = {
            Text(text = "Enter Your Weight")
        },

//        placeholder = {
//            Text(text = "Weight")
//        },

        leadingIcon = {
            Icon(imageVector = Icons.Default.Person, contentDescription = "Icon")
        },

//        trailingIcon = {
//            Icon(imageVector = Icons.Default.Person, contentDescription = "Icon")
//        },

        isError = false,

        suffix = {
            Text(text = "KG")
        },

        supportingText = {
            Text(text = "Required")
        },

        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Decimal,
            imeAction = ImeAction.Next
        ),

        keyboardActions = KeyboardActions(
            onNext = {
                print("Pressed the onNext")
            }
        ),
    )
    
    
}