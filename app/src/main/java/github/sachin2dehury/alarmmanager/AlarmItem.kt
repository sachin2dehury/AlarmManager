package github.sachin2dehury.alarmmanager

import java.time.LocalDateTime

data class AlarmItem(
    val time: LocalDateTime,
    val msg: String?
)