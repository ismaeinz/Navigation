package com.example.navigation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun A(navController: NavController) {
    var name by rememberSaveable { mutableStateOf("") }
    var age by rememberSaveable { mutableStateOf("") }


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Screen A")

//
        Card {
            Row(modifier = Modifier.fillMaxWidth()) {
                OutlinedTextField(
                    value = name,
                    onValueChange = { name = it },
                    modifier = Modifier.weight(.5f),
                    placeholder = { Text("name") },

                    )
                OutlinedTextField(
                    value = age,
                    onValueChange = { age = it },
                    modifier = Modifier.weight(.5f),
                    placeholder = { Text("age") },

                    )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(onClick = { navController.navigate("B?name=$name&age=$age") }) {
                Text(text = "Pass")
            }
        }

//

//        Spacer(modifier = Modifier.width(10.dp))
//        Button(onClick = { navController.navigate("B") }) {
//            Text(text = "Go To B")
//        }
//        Button(onClick = { navController.navigate("C") }) {
//            Text(text = "Go To C")
//        }
    }
}