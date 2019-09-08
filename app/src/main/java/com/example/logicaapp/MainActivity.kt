package com.example.logicaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkBTN.setOnClickListener {
            onCheck()
        }
    }




    private fun onCheck() {

        val answer1 = ans1.text.toString()
        val answer2 = ans2.text.toString()
        val answer3 = ans3.text.toString()
        val answer4 = ans4.text.toString()

        if(answer1 == "T" && answer2 == "F" && answer3 == "F" && answer4 == "F") {
            onAnswerCorrect()
        }else {
            onAnswerIncorrect()
        }

    }

    private fun onAnswerCorrect() {
        Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_SHORT).show()
    }


    private fun onAnswerIncorrect() {
        Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_SHORT).show()
    }






}
