package es.uva.inf5g.psm.myleague

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StandingsScreen(
    onTeamClick: (Int) -> Unit,
    onBack: () -> Unit,
    code: String
) {
    Scaffold(
        topBar = { LeagueTopBar(
            title = "Clasificación $code",
            onBack = onBack
        )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            Text("Elige un equipo")
            Button(
                onClick = { onTeamClick(81) }
            ) {
                Text("F.C. Barcelona")
            }
        }
    }
}