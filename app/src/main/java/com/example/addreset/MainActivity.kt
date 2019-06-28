package com.example.addreset

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var count = 0
    fun reset (view : View) {
        count = 0
        theNumber.text = count.toString()
    }
    fun add (view:View){
        count++
        theNumber.text = count.toString()
    }

    fun sub (view:View) {
        count--
        theNumber.text = count.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         val theNumber = findViewById<TextView>(R.id.theNumber)
    }
}
