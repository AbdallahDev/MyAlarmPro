package com.example.user.myalarmpro

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

/**
 * Created by user on 12/7/2017.
 */

class AlarmReceiver : BroadcastReceiver() {
    override fun onReceive(p0: Context, p1: Intent) {

        if(p1.action.equals("com.test.alarm"))
        {
            Toast.makeText(p0,"Done",Toast.LENGTH_LONG).show()
        }

    }
}
