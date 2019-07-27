package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnRoller.setOnClickListener{
//            Toast.makeText(this, "Hello Kotlin running!", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    } // closing brace of

    private fun rollDice(){
//        var resultText = txtDisplay.text.toString()
        val intNum:Int = Random.nextInt(6) + 1
        val dice = dice_image
//        txtDisplay.text = intNum.toString()

        val selectedImage = when(intNum){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        dice_image.setImageResource(selectedImage)
        Toast.makeText(this, "Top Dice value: $intNum", Toast.LENGTH_LONG).show()


    }
}
