package mx.uacj.juego_ra.ui.atomos

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.navigation.NavHostController
import mx.uacj.juego_ra.R
import mx.uacj.juego_ra.modelos.Pista
import mx.uacj.juego_ra.ui.pantallas.PistaEncontrada
import mx.uacj.juego_ra.ui.theme.Juego_raTheme
import mx.uacj.juego_ra.view_models.ControladorGeneral

@Composable
fun PistaSeleccionar(pista: Pista, temperatura: Int, navegador: NavHostController,controlador_general: ControladorGeneral = hiltViewModel()){
    var pista_encontrada by remember { mutableStateOf(false) }
    Row(
        modifier = Modifier
            .padding(bottom = 5.dp, start = 1.dp, end = 1.dp)
            .fillMaxWidth()
            .border(1.dp, Color.Gray)
            .padding(top = 14.dp, start = 10.dp, end = 10.dp, bottom = 14.dp)
            .clickable {
                if(pista.completada == 1 || temperatura == 4 || temperatura == 6 || temperatura == 7) {
                    if (temperatura == 6 || temperatura == 7){
                        navegador.navigate("PantallaTesoroEncontrado")
                    } else {
                        navegador.navigate("PantallaPistaSelector")
                    }
                    controlador_general.seleccionar_pista(pista)
                }
            },
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(pista.nombre, style = TextStyle(fontSize = 26.sp, fontWeight = FontWeight.Bold), modifier = Modifier.padding(bottom = 6.dp))

            if (pista.completada == 1) {
                if (temperatura == 7){
                    Text("Tesoro encontrado", style = TextStyle(fontSize = 15.sp))
                } else {
                    Text("Ver descripcion completa", style = TextStyle(fontSize = 15.sp))
                }
            } else {
                when (temperatura) {
                    0 -> Text("Bloqueada, sigue investigando", style = TextStyle(fontSize = 15.sp))
                    1 -> Text("Estas un poco cerca...", style = TextStyle(fontSize = 15.sp))
                    2 -> Text("Algo te dice que estas bastante cerca...", style = TextStyle(fontSize = 15.sp))
                    3 -> Text("Estas en el lugar correcto...", style = TextStyle(fontSize = 15.sp))
                    4 -> {
                        Text("Puedes ver un sobre frente a ti...")
                    }
                    5 -> Text("Aqui no hay nada", style = TextStyle(fontSize = 15.sp))
                    6 -> Text("El tesoro esta frente a tus ojos", style = TextStyle(fontSize = 15.sp))
                }

            }
        }

        Image(
            painter = painterResource(id = if (pista.completada == 1) R.drawable.candado_abierto else R.drawable.candado_cerrado),
            contentDescription = "Candado",
            modifier = Modifier
                .size(50.dp),
            contentScale = ContentScale.Crop // Ajusta la escala de la imagen
        )
    }
}

