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

        //obtain button and image vals by ID
        val button = findViewById<Button>(R.id.helloButton)
        val img = findViewById<ImageView>(R.id.catImageView)

        //init var to track number of clicks
        var clickCount = 0

        button.setOnClickListener {

            //increment clickcount on every click
            clickCount+=1

            //display first Toast message
            if(clickCount==1){
                Log.v("button", "button was clicked!")

                val toastMessage1 = R.string.toastText1
                val duration = Toast.LENGTH_LONG
                Toast.makeText(this, toastMessage1, duration).show()

                button.setText(R.string.buttonText2)
            }

            //display cat coding image with new Toast message and change button text
            else if(clickCount==2){
                img.setImageResource(R.drawable.cat_coding)

                val toastMessage2 = R.string.toastText2
                val duration = Toast.LENGTH_LONG
                Toast.makeText(this, toastMessage2, duration).show()

                button.setText(R.string.buttonText3)
            }

            //change button text, display final Toast, and revert to original drawable
            else {
                img.setImageResource(R.drawable.cat_eating)

                val toastMessage3 = R.string.toastText3
                val duration = Toast.LENGTH_LONG
                Toast.makeText(this, toastMessage3, duration).show()

                button.setText(R.string.helloStr)

            }
        }


    }
}