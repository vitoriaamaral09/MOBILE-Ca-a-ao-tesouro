package com.example.treasurehunt

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("pista1") { PistaScreen(navController, "Qual é o maior planeta do sistema solar?", "Jupiter", "pista2") }
        composable("pista2") { PistaScreen(navController, "Qual é a cor do céu em um dia claro?", "Azul", "pista3") }
        composable("pista3") { PistaScreen(navController, "Quantos continentes existem na Terra?", "7", "tesouro") }
        composable("tesouro") { TreasureScreen(navController) }
    }
}