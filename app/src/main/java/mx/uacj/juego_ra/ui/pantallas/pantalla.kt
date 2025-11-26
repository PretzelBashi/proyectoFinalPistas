package mx.uacj.juego_ra.ui.pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.Typeface
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.res.FontResourcesParserCompat
import androidx.core.content.res.ResourcesCompat
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.navigation.NavHostController
import mx.uacj.juego_ra.view_models.ControladorGeneral
import mx.uacj.juego_ra.view_models.GestorUbicacion

@Composable
fun PantallaInicio(navegador: NavHostController,
                   modificador: Modifier = Modifier,

                   gestor_ubicacion: GestorUbicacion = hiltViewModel(),
                   controlador_general: ControladorGeneral = hiltViewModel()
) {

    Column( horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modificador
            .background(Color.LightGray)
            .fillMaxSize())
    {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modificador.background(Color.Gray)) {

            Text("Huellas Doradas",
                modifier = Modifier.padding(15.dp),
                color = Color.Red,
                fontSize = 40.sp,
                fontWeight = FontWeight(600)



            )
            Text(
                "Ha ocurrido un gran robo en la joyeria de la " +
                        "ciudad y es tu trabajo como detective analizar" +
                        "los hechos y encontrar a los responsables"
            )
            Text(
                "Revisa las pistas y notas, y revela el misterio detrás del crimen"
            )
            Button(onClick = {
                navegador.navigate("SelectorPantallaPista")

            }

            ) {
                Text(
                    "Empezar"
                )
            }

        }


    }
}


