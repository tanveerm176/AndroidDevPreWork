package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.helloButton)
        val img = findViewById<ImageView>(R.id.catImageView)
        var clickCount = 0

        button.setOnClickListener {
            clickCount+=1
            if(clickCount==1){
                Log.v("button", "button was clicked!")

                val toastMessage1 = R.string.toastText1
                val duration = Toast.LENGTH_LONG
                Toast.makeText(this, toastMessage1, duration).show()

                button.setText(R.string.buttonText2)
//                clickCount+=1
            }

            if(clickCount==2){
                img.setImageResource(R.drawable.cat_coding)

                val toastMessage2 = R.string.toastText2
                val duration = Toast.LENGTH_LONG
                Toast.makeText(this, toastMessage2, duration).show()
            }
        }


    }
}