package br.com.jean.devhub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.jean.devhub.ui.theme.DevHubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DevHubTheme {
                Surface {

                }
            }
        }
    }
}

@Composable
fun InfoPerfil() {
    Column(
        modifier = Modifier.width(250.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Imagem de perfil",
            modifier = Modifier.size(100.dp)
        )
        Text(text = "Jean Gabriel Ferreira")
        Text(text = "FerreirinhaJean")
        Text(text = "Descrição da BIO")
    }
}

@Preview(
    showBackground = true
)
@Composable
fun InforPerfilPreview() {
    InfoPerfil()
}

