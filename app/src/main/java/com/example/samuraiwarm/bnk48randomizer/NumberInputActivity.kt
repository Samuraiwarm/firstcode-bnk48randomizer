package com.example.samuraiwarm.bnk48randomizer

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_number_input.*

class NumberInputActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_input)

        button.setOnClickListener {
            var checkedChoice = ""
            when(radioGroup.checkedRadioButtonId){
                radioButton.id -> checkedChoice = "allGen"
                radioButton2.id -> checkedChoice = "firstGen"
                radioButton3.id -> checkedChoice = "secondGen"
            }

            //to send data through activities, we use Intent
            //by referring this activity to the target activity
            //after referring, we putExtra the value, and tag them with the name

        }
    }
}
