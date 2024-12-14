package com.example.rentacar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rentacar.ui.theme.AnaTema
import com.example.rentacar.ui.theme.AnaTemaLight
import com.example.rentacar.ui.theme.ButtonTema
import com.example.rentacar.ui.theme.ButtonTemoLight
import com.example.rentacar.ui.theme.RentACarTheme
import com.example.rentacar.ui.theme.TextTema
import com.example.rentacar.ui.theme.poppins

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RentACarTheme {
                OnboardingScreen()
            }
        }
    }
}

@Composable
fun OnboardingScreen(darkTheme: Boolean = isSystemInDarkTheme()) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                if (darkTheme) AnaTema else AnaTemaLight
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(R.drawable.araba2),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .size(550.dp)
                    .height(300.dp)
                    .clip(RoundedCornerShape(16.dp))
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = stringResource(R.string.Title),
                color = TextTema,
                fontSize = 24.sp,
                fontFamily = poppins,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = stringResource(R.string.Subtitle),
                color = TextTema,
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(32.dp))
            Button(
                onClick = { /* TODO: Navigate to next screen */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (darkTheme) ButtonTema else ButtonTemoLight,
                    contentColor = TextTema
                )
            ) {
                Text(
                    text = stringResource(R.string.ButtonText),
                    fontFamily = poppins,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Preview(showBackground = true, locale = "tr")
@Composable
fun OnboardingScreenPreview() {
    RentACarTheme {
        OnboardingScreen()
    }
    }