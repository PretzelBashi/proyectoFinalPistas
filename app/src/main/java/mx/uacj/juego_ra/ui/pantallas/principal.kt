package mx.uacj.juego_ra.ui.pantallas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.navigation.NavHostController
import mx.uacj.juego_ra.repositorios.estaticos.RepositoriosPistas
import mx.uacj.juego_ra.ui.atomos.PistaSeleccionar
import mx.uacj.juego_ra.ui.organismos.DetectorAgitamiento
import mx.uacj.juego_ra.view_models.ControladorGeneral
import mx.uacj.juego_ra.view_models.GestorUbicacion

@Composable
fun Principal(
            navegador: NavHostController,
            modificador: Modifier = Modifier,
            gestor_ubicacion: GestorUbicacion = hiltViewModel(),
            controlador_general: ControladorGeneral = hiltViewModel()
){

    var mostrar_pantalla_generica by remember { mutableStateOf(true) }
    var pista_actual by remember { mutableStateOf(0)}
    var dificultad by remember { mutableStateOf(2) }

    var mostrar_informacion_relacionada_con_las_agitadas by remember { mutableStateOf(false) }
    var RepositorioDificultad by remember { mutableStateOf(RepositoriosPistas)}
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
                .padding(top = 70.dp, bottom = 40.dp)
                .fillMaxWidth())

        var contador = 0
        var temperatura = 0


        for(pista in RepositoriosPistas.nivelesPistas[dificultad]){
            if(pista.completada == 1){
                pista_actual = contador+1
            }
            contador++
        }

        contador = 0
        for(pista in RepositoriosPistas.nivelesPistas[dificultad]){
            if (pista.id == contador){
                /*Text("${contador}")
Text("${pista_actual}")*/
                if(ubicacion.value == null){
                    break
                }

                var distancia_a_la_pista = ubicacion.value.distanceTo(pista.ubicacion)
                //Text("La distancia a la pista es: ${distancia_a_la_pista}")

                if (pista_actual == contador) {
                    temperatura = 5
                }
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
                            Text("Aqui es")
                            temperatura = 4

                            if (RepositoriosPistas.nivelesPistas[dificultad].count() == contador+1 && pista.completada == 0){
                                temperatura = 6
                            }
                        }
                    }
                }
                if (RepositoriosPistas.nivelesPistas[dificultad].count() == contador+1 && pista.completada == 1){
                    temperatura = 7
                }


                PistaSeleccionar(pista, temperatura, navegador)
                contador++
                temperatura = 0
            }


        }
    }

    /*if(mostrar_pantalla_generica){
        Column(modificador) {
            Text("NO te encuentras cercas de alguna pista por el momento ")
            Text("Por favor sigue explorando  ")
        }

    }*/

}
