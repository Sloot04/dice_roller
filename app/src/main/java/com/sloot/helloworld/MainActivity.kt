package com.sloot.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById<Button>(R.id.roll_button)
        val countUpButton: Button = findViewById<Button>(R.id.count_up_button)
        val restButton: Button = findViewById<Button>(R.id.reset_button)


        rollButton.setOnClickListener { rollDice() }
        countUpButton.setOnClickListener { countUp() }
        restButton.setOnClickListener { rest() }


    }

    private fun rollDice() {
        // Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        val randomInt = (1..6).random()
        val resultText: TextView = findViewById<TextView>(R.id.result_text)

        resultText.text = randomInt.toString()
    }

    private fun countUp() {
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
    }
}