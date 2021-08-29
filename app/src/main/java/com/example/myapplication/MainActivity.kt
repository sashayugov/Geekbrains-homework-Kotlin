package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    private val runners: List<Runner> = Example.runners

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initButtonClickListener()

        for (runner in runners) {
            println(runner.name)
        }

        for (i in 1..10) {
            println("RUN")
        }

        for (i in 0 until runners.size) {
            println(runners[i].pace)
        }
    }

    private fun initButtonClickListener() {
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            Toast.makeText(this, "It's alive", Toast.LENGTH_LONG).show()
            val textView: TextView = findViewById(R.id.textView)
            textView.text = "${Example.newCopy}"
        }
    }
}