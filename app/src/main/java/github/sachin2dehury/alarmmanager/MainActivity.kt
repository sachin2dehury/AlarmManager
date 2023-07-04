package github.sachin2dehury.alarmmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import github.sachin2dehury.alarmmanager.ui.theme.AlarmManagerTheme
import java.time.LocalDateTime

class MainActivity : ComponentActivity() {

    private val alarmScheduler: AlarmScheduler by lazy {
        AlarmSchedulerImpl(applicationContext)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val alarmItem = AlarmItem(
            LocalDateTime.now().plusSeconds(10L),
            "Hi Preeti"
        )

        setContent {
            AlarmManagerTheme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Button(onClick = {
                        alarmScheduler.schedule(alarmItem)
                    }) {
                        Text(text = "Start")
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(onClick = {
                        alarmScheduler.cancel(alarmItem)
                    }) {
                        Text(text = "Stop")
                    }
                }
            }
        }
    }
}