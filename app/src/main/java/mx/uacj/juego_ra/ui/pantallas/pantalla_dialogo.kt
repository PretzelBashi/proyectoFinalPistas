package mx.uacj.juego_ra.ui.pantallas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mx.uacj.juego_ra.R
import mx.uacj.juego_ra.ui.theme.Juego_raTheme

@Composable
fun pantalla_dialogo () {
    Box(modifier = Modifier.fillMaxSize())
    {
        Image(
            painter = painterResource(R.drawable.dialogo_placeholder),
            contentDescription = "Una imagen de un arbol cuyas hojas son alas de mariposa. Muy bonita foto, lastima que si lees esto es porque no puedes ver.",
            contentScale = ContentScale.FillHeight,
            modifier = Modifier.size(280.dp,650.dp).align(Alignment.BottomEnd)
        )

        Text("Dialogo texto aasda  wd aslkdja wdjaowijd aowdjaoiwjdoiawj", fontSize = 17.sp, modifier = Modifier
            .align(Alignment.BottomEnd)
            .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
            .fillMaxWidth()
            .height(140.dp)
            .background(Color.Blue.copy(alpha = 0.3f))
            .padding(15.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDialogo() {
    pantalla_dialogo()
}