package edu.ucne.registroocupaciones

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType

import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.ucne.registroocupaciones.ui.theme.RegistroOcupacionesTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column() {
                Registro()
            }
        }
    }
}


@Composable
fun Registro() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Organizado()
    }
}

@Preview(showSystemUi = true)
@Composable
fun Organizado() { // Dar espacios entre cada funcion
    Column(modifier = Modifier) {
        Spacer(modifier = Modifier.padding(20.dp))
        Text(
            text = "Registro de ocupaciones", fontSize = 30.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.padding(18.dp))
        Descripcion(Modifier.align(Alignment.CenterHorizontally))

        Spacer(modifier = Modifier.padding(5.dp))
        Salario(Modifier.align(Alignment.CenterHorizontally))

        Spacer(modifier = Modifier.padding(9.dp))
        Boton(Modifier.align(Alignment.CenterHorizontally))
    }
}


@Composable
fun Descripcion(modifier: Modifier) { // Descripcion
    TextField(
        value = "", onValueChange = { },
        modifier = Modifier
            .border(
                BorderStroke(2.dp, androidx.compose.ui.graphics.Color.Gray),
                RoundedCornerShape(10)
            )
            .fillMaxWidth().height(60.dp)
            .padding(4.dp).width(40.dp),
            placeholder = { Text(text = "Descripción", fontSize = 15.sp) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            singleLine = true,
            maxLines = 1,
            colors = TextFieldDefaults.textFieldColors(
            textColor = androidx.compose.ui.graphics.Color.Transparent,
            backgroundColor = androidx.compose.ui.graphics.Color.Transparent,
            focusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent,
            unfocusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent
        )
    )
}

@Composable
fun Salario(modifier: Modifier) { // Salario
    TextField(
        value = "", onValueChange = { },
        modifier = Modifier
            .border(
                BorderStroke(2.dp, androidx.compose.ui.graphics.Color.Gray),
                RoundedCornerShape(10)
            )
            .height(60.dp).padding(4.dp)
            .fillMaxSize().width(40.dp),
            placeholder = { Text(text = "Salario", fontSize = 15.sp) },
            shape = RoundedCornerShape(10),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
            singleLine = true,
            maxLines = 1,
            colors = TextFieldDefaults.textFieldColors(
            textColor = androidx.compose.ui.graphics.Color.Transparent,
            backgroundColor = androidx.compose.ui.graphics.Color.Transparent,
            focusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent,
            unfocusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent
        )
    )
}

@Composable
fun Boton(modifier: Modifier) { // Boton guardar
    Button(
        onClick = { },
        modifier = Modifier
            .height(60.dp).padding(5.dp)
            .fillMaxSize().width(40.dp),
            shape = RoundedCornerShape(40),
            colors = ButtonDefaults.buttonColors(
            backgroundColor = androidx.compose.ui.graphics.Color.Yellow,
            contentColor = androidx.compose.ui.graphics.Color.Black,
            disabledContentColor = androidx.compose.ui.graphics.Color.White,
        ),
    ) {
        Image(

            painter = painterResource(id = R.drawable.guardar), // Imagen(icono) guardar
            contentDescription = "Header",
            modifier = modifier
        )
        Text(text = " Guardar", modifier = modifier, fontSize = 18.sp)
    }
}
