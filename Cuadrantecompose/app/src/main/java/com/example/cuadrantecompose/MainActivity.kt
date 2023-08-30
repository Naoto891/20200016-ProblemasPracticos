package com.example.cuadrantecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantecompose.ui.theme.CuadrantecomposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadrantecomposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {

    Column(
        Modifier.fillMaxWidth()
    ){
        Row(
            Modifier
                .weight(1f)
        ){
            Carta(
                titulo ="Text composable",
                cuerpo = "Displays text and follows the recommended Material Design guidelines.",
                fondocolor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            Carta(
                titulo = "Image composable",
                cuerpo = "Creates a composable that lays out and draws a given Painter class object.",
                fondocolor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }

        Row(
            Modifier.weight(1f)
        ){
            Carta(
                titulo = "Row composable",
                cuerpo = "A layout composable that places its children in a horizontal sequence.",
                fondocolor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            Carta(
                titulo = "Column composable",
                cuerpo = "A layout composable that places its children in a vertical sequence.",
                fondocolor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }

}

@Composable
fun Carta(
    titulo: String,
    cuerpo: String,
    fondocolor : Color,
    modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(fondocolor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = titulo,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = cuerpo,
            textAlign = TextAlign.Justify
        )
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CuadrantecomposeTheme {
        Greeting()
    }
}