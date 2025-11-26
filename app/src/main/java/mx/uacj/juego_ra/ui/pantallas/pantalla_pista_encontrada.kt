package mx.uacj.juego_ra.ui.pantallas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import mx.uacj.juego_ra.R
import mx.uacj.juego_ra.modelos.Pista
import mx.uacj.juego_ra.ui.theme.Juego_raTheme

@Composable
fun PistaEncontrada(){
    Column(modifier = Modifier.fillMaxSize()) {
        Text("Pista #1")
        Text("Nombre de la pista?")
        Text("Descripcion de la pista asd asd as da sdasda sd as da sd as da  wdjwaj dwj dja i" +
                "jdaowijdioawjdoiawjdiowad" +
                "dawoidjawoidj")

        Image(
            painter = painterResource(R.drawable.imagen_1),
            contentDescription = "Candado",
            modifier = Modifier
                .size(50.dp),
            contentScale = ContentScale.Crop // Ajusta la escala de la imagen
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PistaEncontrada()
}