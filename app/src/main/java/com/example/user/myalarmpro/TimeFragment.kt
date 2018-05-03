package com.example.user.myalarmpro


import android.app.DialogFragment
import android.os.Bundle
import android.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.fragment_time.view.*


/**
 * A simple [Fragment] subclass.
 */
class TimeFragment : DialogFragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {


        var v= inflater!!.inflate(R.layout.fragment_time, container, false)

        v.btn.setOnClickListener {

           var ma=activity as MainActivity
           ma.setTime(v.timePicker.currentHour,v.timePicker.currentMinute)
            this.dismiss()
        }

        return v
    }

}// Required empty public constructor
