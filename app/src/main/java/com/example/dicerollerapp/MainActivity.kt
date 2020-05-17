package com.example.dicerollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.text.isDigitsOnly


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roll_button: Button=findViewById(R.id.roll_button)
        roll_button.setOnClickListener{rollDice()}
        val reset:Button=findViewById(R.id.reset)
        reset.setOnClickListener{ reset()}
       // val countUpButton:Button=findViewById(R.id.r) //FOR DICE ROLLER CHALLENGE
        //countUpButton.setOnClickListener{ count()} //FOR DICE ROLLER CHALLENGE

    }
    fun reset(){
        val resultText:TextView=findViewById(R.id.result_text)
        resultText.text="0"
        Toast.makeText(this,"Reset button clicked",Toast.LENGTH_SHORT).show()

    }

    fun rollDice()
    {
        val resultText:TextView=findViewById(R.id.result_text)
        val rand:String=((1..6).random()).toString()
        resultText.setText(rand)
        Toast.makeText(this,"Button clicked",Toast.LENGTH_SHORT).show()
    }
    /*FOR DICE ROLLER CHALLENGE
    fun count()
    {
        val resultText:TextView=findViewById(R.id.result_text)
        val num:String=resultText.text.toString()
        if(num.equals("Hello World!"))
            resultText.text="1"
        else if(num.equals("6"))
            resultText.text="6"
        else
            resultText.text=(num.toInt()+1).toString()

       Toast.makeText(this,"count button pressed",Toast.LENGTH_SHORT).show()
    }*/
}
