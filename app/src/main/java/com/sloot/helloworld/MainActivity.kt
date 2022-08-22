package com.sloot.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var diceImage: ImageView
    private lateinit var diceImageTwo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById<Button>(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        diceImage = findViewById(R.id.dice_image)
        diceImageTwo = findViewById(R.id.dice_image_2)

        // val countUpButton: Button = findViewById<Button>(R.id.count_up_button)
        // val restButton: Button = findViewById<Button>(R.id.reset_button)
        // countUpButton.setOnClickListener { countUp() }
        // restButton.setOnClickListener { rest() }
    }

    private fun getRandomImage(): Int {
        val drawableResource = when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        return drawableResource
    }

    private fun rollDice() {
        // Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()

        diceImage.setImageResource(getRandomImage())
        diceImageTwo.setImageResource(getRandomImage())


    }

    /* private fun countUp() {
         val resultText: TextView = findViewById<TextView>(R.id.result_text)

         if (resultText.text.toString() == "Hello World!") {
             resultText.text = "1"
         } else if (resultText.text.toString() == "6") {
             return
         } else {
             resultText.text = (resultText.text.toString().toInt() + 1).toString()
         }
     }

     private fun rest() {
         val resultText: TextView = findViewById<TextView>(R.id.result_text)
         resultText.text = "0"
     } */
}