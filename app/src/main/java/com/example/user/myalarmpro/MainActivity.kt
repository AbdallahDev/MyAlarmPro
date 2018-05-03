package com.example.user.myalarmpro

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            var popup = TimeFragment()
            popup.show(fragmentManager, "Timer")
        }
    }

    fun setTime(h: Int, m: Int) {

        textView.text = h.toString() + ":" + m.toString()
        setAlarm(h, m)
    }

    fun setAlarm(h: Int, m: Int) {
        var cal = Calendar.getInstance()
        cal.set(Calendar.HOUR_OF_DAY, h)
        cal.set(Calendar.MINUTE, m)
        //cal.set(Calendar.SECOND, 0)

        var manager = getSystemService(Context.ALARM_SERVICE) as AlarmManager

        var i = Intent(this, AlarmReceiver::class.java)
        i.action = "com.test.alarm"
        var pi = PendingIntent.getBroadcast(this, 0, i, PendingIntent.FLAG_UPDATE_CURRENT)

        manager.setRepeating(AlarmManager.RTC_WAKEUP, cal.timeInMillis, AlarmManager.INTERVAL_DAY, pi)
    }

}
