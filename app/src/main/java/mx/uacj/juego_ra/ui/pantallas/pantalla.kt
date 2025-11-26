package mx.uacj.juego_ra.ui.pantallas

import android.icu.text.ListFormatter.Width
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.navigation.NavHostController
import dagger.hilt.android.lifecycle.HiltViewModel
import mx.uacj.juego_ra.R
import mx.uacj.juego_ra.view_models.ControladorGeneral
import mx.uacj.juego_ra.view_models.GestorUbicacion

@Composable
fun PantallaInicio (
    navegador: NavHostController,
    modificador: Modifier = Modifier,
    gestor_ubicacion: GestorUbicacion = hiltViewModel(),
    controlador_general: ControladorGeneral = hiltViewModel()


){
    val mainstay = FontFamily(
        Font(R.font.mainstay, FontWeight.Normal)
    )

    Column( horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modificador
            .background(Color.LightGray)
            .fillMaxSize())
    {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = modificador
                .fillMaxSize(0.9f),
        ) {

            Text(
                "Huellas Doradas",
                modifier = Modifier.padding(15.dp),
                color = Color.Red,
                fontSize = 40.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = mainstay


            )
            Text(
                "Ha ocurrido un gran robo en la joyeria de la " +
                        "ciudad y es tu trabajo como detective analizar" +
                        "los hechos y encontrar a los responsables",
                modifier = modificador.padding(top = 15.dp),
                textAlign = TextAlign.Center,
                color = Color.DarkGray
            )
            Text(
                "Revisa las pistas y notas, y revela el misterio detrás del crimen",
                modifier = modificador.padding(bottom = 15.dp),
                textAlign = TextAlign.Center,
                color = Color.DarkGray

            )
            Button(
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth(0.9f),
                colors = ButtonColors(
                    containerColor = Color.Red,
                    contentColor = Color.White,
                    disabledContainerColor = Color.Gray,
                    disabledContentColor = Color.DarkGray
                ),
                onClick = {
                    navegador.navigate("OpcionNavegacionPantallaPistas")


                }

            ) {
                Text(
                    "Empezar",
                    fontSize = 18.sp,
                    modifier = modificador
                )
            }

        }
    }

    }


