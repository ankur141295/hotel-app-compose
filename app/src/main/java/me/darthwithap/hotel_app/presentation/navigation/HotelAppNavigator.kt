package me.darthwithap.hotel_app.presentation.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun HotelAppNavigator(
  startDestination: String,
  modifier: Modifier = Modifier
) {
  val navController = rememberNavController()
  Scaffold(
    modifier = modifier,
    topBar = {}
  ) { scaffoldPadding ->
    NavHost(
      modifier = Modifier.padding(scaffoldPadding),
      navController = navController,
      startDestination = startDestination
    ) {
      composable(Routes.AuthScreen) {
        // Todo()
      }
      composable(Routes.HomeScreen) {
        // Todo()
      }
    }
  }
}