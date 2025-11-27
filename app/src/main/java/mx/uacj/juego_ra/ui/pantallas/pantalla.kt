package mx.uacj.juego_ra.ui.pantallas

import android.icu.text.ListFormatter.Width
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.isSystemInDarkTheme
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
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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
    val bebasneue = FontFamily(
        Font(R.font.bebasneue, FontWeight.Normal)
    )
    val belgianoserif = FontFamily(
        Font(R.font.belgianoserif, FontWeight.Normal)
    )

    Image(
        painter = painterResource(R.drawable.huellas),
        contentDescription = "Fondo",
        contentScale = ContentScale.FillBounds,
        modifier = modificador
    )



    Column( horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = modificador
            .fillMaxSize()
            .background(Color.hsl(.167f, .1f, .0f,.6f)))
    {
        Column( horizontalAlignment = Alignment.End,
            modifier = modificador.fillMaxWidth(.9f)
                .fillMaxHeight(.06f)) {
            Image(
                painter = painterResource(R.drawable.tuerca),
                contentDescription = "Una lupa.",
                contentScale = ContentScale.FillHeight,
                colorFilter = ColorFilter.tint(Color.Red),
            )
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = modificador
                .fillMaxWidth(.9f)
                .fillMaxHeight(.8f)
                .padding(top = 70.dp)
        ) {

            Text(
                "Huellas de Oro",
                modifier = Modifier.padding(vertical = 15.dp),
                color = Color.White,
                fontSize = 40.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = mainstay


            )
            Text(
                text = "Ha ocurrido un gran robo en la joyeria de la " +
                        "ciudad, parece que los culpables se ocultaron dentro " +
                        "de la universidad.\n\n" +
                        "Revisa las pistas y notas, y revela el misterio detrás del crimen",
                textAlign = TextAlign.Center,
                color = Color.White,
                fontFamily = belgianoserif,
                fontSize = 16.sp,
                fontWeight = FontWeight(600)
            )
            Button(
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .fillMaxHeight(0.3f)
                    .padding(vertical = 10.dp),
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
                    fontSize = 22.sp,
                    fontFamily = bebasneue,

                    )
            }

            Image(
                painter = painterResource(R.drawable.lupa),
                contentDescription = "Una lupa.",
                contentScale = ContentScale.FillHeight,
                colorFilter = ColorFilter.tint(Color.White),
                modifier = Modifier
                    .fillMaxSize(0.2f)
            )

        }
    }

}