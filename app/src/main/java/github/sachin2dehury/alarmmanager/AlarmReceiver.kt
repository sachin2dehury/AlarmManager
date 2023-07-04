package github.sachin2dehury.alarmmanager

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class AlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val msg = intent?.getStringExtra("MY_ALARM_MSG") ?: return
        println("Alarm : $msg")
    }
}