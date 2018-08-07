package com.purple3.singlescreenapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //private var address : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //address = findViewById(R.id.tv_address)
        tv_address.setText("Address: \n  555 W Ave \n Sunyval \n CA - 94088")
        tv_contactInfo.setText("Contact Us: Ram \n Email - ramk@moves.com \n Phone - +91-9876543210 \n Mon-Sun : 8:00 AM - 9:00 PM \n Website: www.google.com")
    }
}
