package com.example.treasurehunt

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { navController.navigate("pista1") }) {
            Text("Iniciar caça ao tesouro")
        }
    }
}

@Composable
fun PistaScreen(navController: NavController, pista: String, resposta: String, nextScreen: String) {
    var userAnswer by remember { mutableStateOf("") }
    var errorMessage by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = pista, style = MaterialTheme.typography.titleLarge)
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = userAnswer,
            onValueChange = { userAnswer = it },
            label = { Text("Resposta") }
        )
        Spacer(modifier = Modifier.height(16.dp))
        Row {
            Button(onClick = { navController.popBackStack() }) { Text("Voltar") }
            Spacer(modifier = Modifier.width(16.dp))
            Button(onClick = {
                if (userAnswer.equals(resposta, ignoreCase = true)) {
                    navController.navigate(nextScreen)
                } else {
                    errorMessage = "Resposta incorreta, tente novamente!"
                }
            }) {
                Text("Próxima Pista")
            }
        }
        if (errorMessage.isNotEmpty()) {
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = errorMessage, color = MaterialTheme.colorScheme.error)
        }
    }
}

@Composable
fun TreasureScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Parabéns! Você encontrou o tesouro!", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("home") }) {
            Text("Voltar à Tela Inicial")
        }
    }
}