package mx.uacj.juego_ra.ui.pantallas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.navigation.NavHostController
import mx.uacj.juego_ra.R
import mx.uacj.juego_ra.ui.organismos.DetectorAgitamiento
import mx.uacj.juego_ra.view_models.ControladorGeneral

@Composable
fun TesoroEncontrado(navegador: NavHostController,
                    controlador_general: ControladorGeneral = hiltViewModel()){
    var abierto by remember { mutableStateOf(false) }

    DetectorAgitamiento(meta_de_agitadas = 5, al_llegar_a_la_meta = {
        abierto = true
        controlador_general.pista_actual.value!!.completada = 1
    })

    if (!abierto && controlador_general.pista_actual.value!!.completada == 0){
        Column(modifier = Modifier
            .fillMaxSize()
            .background(Color((0xFFd9d757)))
            .padding(top = 40.dp)) {
            Text("${controlador_general.pista_actual.value!!.completada}")
            Image(
                painter = painterResource(R.drawable.sobre),
                contentDescription = "Candado",
                modifier = Modifier
                    .size(300.dp)
                    .rotate(-10f)
                    .align(Alignment.CenterHorizontally),
                contentScale = ContentScale.Crop // Ajusta la escala de la imagen
            )
        }
    } else {
        Column(modifier = Modifier
            .fillMaxSize()
            .background(Color((0xFFd9d757)))
            .padding(top = 40.dp)) {
            Text("Pista #${controlador_general.pista_actual.value!!.id}", style = TextStyle(fontSize = 18.sp, color = Color((0xFFcccccc))) , modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(bottom = 5.dp))
            Text("${controlador_general.pista_actual.value!!.nombre}", style = TextStyle(fontSize = 24.sp, color = Color.White, fontWeight = FontWeight.ExtraBold) , modifier = Modifier
                .align(Alignment.CenterHorizontally))
            Text("${controlador_general.pista_actual.value!!.nombreUbicacion}", style = TextStyle(fontSize = 18.sp, color = Color.White) , modifier = Modifier
                .align(Alignment.End)
                .padding(bottom = 10.dp, end = 30.dp, top = 10.dp))
            Text("${controlador_general.pista_actual.value!!.cuerpo.texto}", style = TextStyle(fontSize = 18.sp, color = Color.White, textAlign = TextAlign.Justify) , modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(30.dp))

            Image(
                painter = painterResource(R.drawable.sobre),
                contentDescription = "Candado",
                modifier = Modifier
                    .size(300.dp)
                    .rotate(-10f)
                    .align(Alignment.CenterHorizontally),
                contentScale = ContentScale.Crop // Ajusta la escala de la imagen
            )

        }
    }
}

