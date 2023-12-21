package com.example.yourmom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var randomButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton = findViewById<Button>(R.id.myButton)
        val img1 = findViewById<ImageView>(R.id.img1)
        val img2 = findViewById<ImageView>(R.id.img2)
        val img3 = findViewById<ImageView>(R.id.img3)
        img1.visibility = View.VISIBLE
        img2.visibility = View.INVISIBLE
        img3.visibility = View.INVISIBLE

        myButton.setOnClickListener {
            val randomNumber = Random.nextInt(1, 4)
            /*Toast.makeText(this, "무작위 숫자: $randomNumber", Toast.LENGTH_SHORT).show()*/

            if (randomNumber == 1){
                img1.visibility = View.VISIBLE
            } else {
                img1.visibility = View.INVISIBLE
            }
            if (randomNumber == 2){
                img2.visibility = View.VISIBLE
            } else {
                img2.visibility = View.INVISIBLE
            }
            if (randomNumber == 3){
                img3.visibility = View.VISIBLE
            } else {
                img3.visibility = View.INVISIBLE
            }
        }
    }
}