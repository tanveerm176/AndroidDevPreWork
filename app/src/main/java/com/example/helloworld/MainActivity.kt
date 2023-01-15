package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.helloButton)

        button.setOnClickListener {

            Log.v("button", "button was clicked")
            val toastMessage = R.string.toastText
            val duration = Toast.LENGTH_LONG

            Toast.makeText(this, toastMessage, duration).show()


        }

    }
}