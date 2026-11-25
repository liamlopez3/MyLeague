package es.uva.inf5g.psm.myleague

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import es.uva.inf5g.psm.myleague.ui.theme.MyLeagueTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyLeagueTheme {
                    MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "competitions"
    ) {
        composable("competitions") {
            CompetitionsScreen(
                onCompetitionClick = { code ->
                    navController.navigate("standings/$code")
                }
            )
        }
        composable("standings/{code}") {
            StandingsScreen(
                onBack = { navController.popBackStack() },
                onTeamClick = { teamId ->
                    navController.navigate("team/$teamId")
                },
                code = it.arguments?.getString("code") ?: ""
            )
        }
        composable("team/{teamId}") {
            val teamId = it.arguments?.getString("teamId")?.toIntOrNull() ?: 0
            TeamScreen(
                teamId = teamId,
                onBack = { navController.popBackStack() }
            )
        }
    }
}
