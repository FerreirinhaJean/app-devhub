package br.com.jean.devhub

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import br.com.jean.devhub.ui.theme.DevHubTheme
import coil.compose.AsyncImage
import coil.request.ImageRequest

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
    Column {
        val boxSize = remember {
            150.dp
        }

        val imageSize = remember {
            boxSize
        }


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Color(0xFF2d333b),
                    shape = RoundedCornerShape(bottomStart = 16.dp, bottomEnd = 16.dp)
                )
                .height(boxSize)
        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data("https://avatars.githubusercontent.com/u/59851490?v=4")
                    .crossfade(true)
                    .build(),
                contentDescription = "Imagem de perfil",
                placeholder = painterResource(id = R.drawable.ic_launcher_background),
                fallback = painterResource(id = R.drawable.ic_launcher_foreground),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .offset(y = imageSize / 2)
                    .size(imageSize)
                    .align(BottomCenter)
                    .clip(shape = CircleShape)
            )
        }
        Spacer(Modifier.height(imageSize / 2))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            horizontalAlignment = CenterHorizontally
        ) {
            Text(
                text = "Jean Gabriel Ferreira",
                modifier = Modifier.align(CenterHorizontally),
                fontSize = 32.sp
            )
            Text(
                text = "FerreirinhaJean",
                modifier = Modifier.align(CenterHorizontally),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Text(
            text = "Desenvolvedor de Software na empresa de tecnologia",
            modifier = Modifier
                .align(CenterHorizontally)
                .padding(start = 8.dp, end = 8.dp, bottom = 8.dp),
            textAlign = TextAlign.Center
        )
    }
}

@Preview(
    showBackground = true
)
@Composable
fun InforPerfilPreview() {
    InfoPerfil()
}

