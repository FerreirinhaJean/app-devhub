package br.com.jean.devhub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.jean.devhub.ui.theme.DevHubTheme
import br.com.jean.devhub.ui.theme.Shapes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DevHubTheme {
                Surface {
                    InfoPerfil()
                }
            }
        }
    }
}

@Composable
fun InfoPerfil() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Box(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(bottomStart = 15.dp, bottomEnd = 15.dp))
                .background(Color.DarkGray)
                .fillMaxWidth()
                .height(150.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Imagem de perfil",
            modifier = Modifier
                .size(150.dp)
                .offset(y = (-75).dp)
                .clip(shape = CircleShape)
                .align(alignment = CenterHorizontally)
        )
        Column(
            modifier = Modifier
                .align(CenterHorizontally),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Jean Gabriel Ferreira",
                modifier = Modifier.align(CenterHorizontally),
                fontSize = 24.sp
            )
            Text(
                text = "FerreirinhaJean",
                modifier = Modifier.align(CenterHorizontally),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Desenvolvedor de Software na empresa de tecnologia",
                modifier = Modifier
                    .align(CenterHorizontally)
                    .padding(top = 8.dp),
                textAlign = TextAlign.Center
            )
        }
    }
}


@Preview(
    showBackground = true
)
@Composable
fun InforPerfilPreview() {
    InfoPerfil()
}

