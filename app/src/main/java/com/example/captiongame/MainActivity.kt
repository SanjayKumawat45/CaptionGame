package com.example.captiongame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.captiongame.ui.theme.CaptionGameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CaptionGameTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CaptainGame()

                }


            }
        }
    }
}





@Composable
fun CaptainGame(){
    val treasureFound = remember { mutableStateOf(0) }
    val direction = remember { mutableStateOf("North") }
    val health = remember { mutableStateOf(100) }


    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally ) {
        Text("Treasure Found: ${treasureFound.value}")
        Text("Current Direction: ${direction.value}")
        Text("Health: ${health.value}")
        Button(onClick = {
            direction.value = "East"
            if (Random.nextBoolean()){
                treasureFound.value +=1
                if (health.value<100){
                    health.value += 5
                }
            }
            if (Random.nextBoolean()){
                health.value -= 5
            }

        }) {
            Text("Sail East")
        }

        Button(onClick = {
            direction.value = "West"
            if (Random.nextBoolean()){
                treasureFound.value +=1
                if (health.value<100){
                    health.value += 5
                }
            }
            if (Random.nextBoolean()){
                health.value -= 5
            }

        }) {
            Text("Sail West")
        }

        Button(onClick = {
            direction.value = "North"
            if (Random.nextBoolean()){
                treasureFound.value +=1
                if (health.value<100){
                    health.value += 5
                }
            }
            if (Random.nextBoolean()){
                health.value -= 5
            }

        }) {
            Text("Sail North")
        }

        Button(onClick = {
            direction.value = "South"
            if (Random.nextBoolean()){
                treasureFound.value +=1
                if (health.value<100){
                    health.value += 5
                }
            }
            if (Random.nextBoolean()){
                health.value -= 5
            }

        }) {
            Text("Sail South")
        }
    }

}

