package mx.uacj.juego_ra.ui.pantallas

import android.location.Location
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.navigation.NavHostController
import mx.uacj.juego_ra.modelos.Informacion
import mx.uacj.juego_ra.modelos.InformacionInteractiva
import mx.uacj.juego_ra.modelos.TiposDePistas
import mx.uacj.juego_ra.repositorios.estaticos.RepositorioPruebas
import mx.uacj.juego_ra.ui.atomos.PistaSeleccionar
import mx.uacj.juego_ra.ui.organismos.DetectorAgitamiento
import mx.uacj.juego_ra.ui.organismos.InformacionInteractivaVista
import mx.uacj.juego_ra.ui.organismos.InformacionVista
import mx.uacj.juego_ra.view_models.ControladorGeneral
import mx.uacj.juego_ra.view_models.GestorUbicacion
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun Principal(
            navegador: NavHostController,
            modificador: Modifier = Modifier,
            gestor_ubicacion: GestorUbicacion = hiltViewModel(),
            controlador_general: ControladorGeneral = hiltViewModel()
){

    var mostrar_pantalla_generica by remember { mutableStateOf(true) }
    var mostrar_pista_cercana by remember { mutableStateOf(false) }
    var pista_actual by remember { mutableStateOf(0)}

    var mostrar_informacion_relacionada_con_las_agitadas by remember { mutableStateOf(false) }

    var ubicacion = gestor_ubicacion.ubicacion_actual

    Column(modificador) {
        DetectorAgitamiento(meta_de_agitadas = 20, al_llegar_a_la_meta = {
            mostrar_informacion_relacionada_con_las_agitadas = true
        })
        if(mostrar_informacion_relacionada_con_las_agitadas){
            Text("Ya me sarandeastes demasiado")
        }
        /*Text("Ubicacion actual: ${ubicacion.value}")*/
        Text("Selecciona una de las pistas", style = TextStyle(fontSize = 18.sp, color = Color.Red, fontStyle = FontStyle.Italic, textAlign = TextAlign.Center),
            modifier = Modifier
                .padding(top = 60.dp, bottom = 60.dp)
                .fillMaxWidth())

        var contador = 0
        var temperatura = 0

        for(pista in RepositorioPruebas.pistas){

            if(pista.completada == 1){
                pista_actual = contador+1
            }
            contador++
        }

        contador = 0
        for(pista in RepositorioPruebas.pistas){

            /*Text("${contador}")
            Text("${pista_actual}")*/
            if(ubicacion.value == null){
                break
            }

            var distancia_a_la_pista = ubicacion.value.distanceTo(pista.ubicacion)
            //Text("La distancia a la pista es: ${distancia_a_la_pista}")

            if(distancia_a_la_pista < pista.distancia_maxima){
                mostrar_pantalla_generica = false
                var nivel_de_distancia = (distancia_a_la_pista * 100) / (pista.distancia_maxima - pista.distancia_minima)

                if (pista_actual == contador){
                    if(nivel_de_distancia > 75){
                        Text("Frio")
                        temperatura = 1
                    }

                    else if (nivel_de_distancia > 50){
                        Text("Medio")
                        temperatura = 2
                    }

                    else if(nivel_de_distancia > 25){
                        Text("Caliente")
                        temperatura = 3
                    }
                    /*else if(nivel_de_distancia < 20 && !mostrar_pista_cercana){
                        Row(modifier = Modifier.fillMaxWidth().clickable {
                            mostrar_pista_cercana = true
                        }){
                            Text("Capturar pista cercana")
                        }
                    }*/
                    else if(distancia_a_la_pista < pista.distancia_minima) {
                        temperatura = 4
                    }

                }

            }
            PistaSeleccionar(pista, temperatura)
            contador++
            temperatura = 0
        }
    }

    /*if(mostrar_pantalla_generica){
        Column(modificador) {
            Text("NO te encuentras cercas de alguna pista por el momento ")
            Text("Por favor sigue explorando  ")
        }

    }*/

}
