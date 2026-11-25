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
fun CompetitionsScreen(onCompetitionClick: (String) -> Unit) {
    Scaffold(
        topBar = { LeagueTopBar(title = "Competiciones") }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            Text("Elige una liga")
            Button(
                onClick = { onCompetitionClick("PD") }
            ) {
                Text("LaLiga")
            }
        }
    }
}