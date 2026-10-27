package com.example.safepass2026

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.safepass2026.ui.theme.SafePass2026Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            SafePass2026Theme {
                ConfigScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ConfigScreen() {

    Scaffold(

        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "SafePass 2026 - Identidad",
                        style = MaterialTheme.typography.titleLarge
                    )
                },

                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor =
                    MaterialTheme.colorScheme.primaryContainer,

                    titleContentColor =
                    MaterialTheme.colorScheme.onPrimaryContainer
                )
            )
        },

        // DESAFÍO EXTRA
        floatingActionButton = {

            FloatingActionButton(
                onClick = {
                    // Acción de prueba
                },

                containerColor =
                MaterialTheme.colorScheme.secondaryContainer,

                contentColor =
                MaterialTheme.colorScheme.onSecondaryContainer
            ) {

                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Agregar"
                )
            }
        }

    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp)
        ) {

            Text(
                text = "Bienvenido al futuro de la seguridad móvil.",
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}