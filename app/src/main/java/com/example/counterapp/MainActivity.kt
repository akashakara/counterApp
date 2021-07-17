package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
     var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            count ++
            textAreaA.text=count.toString()
        }
        buttonB.setOnClickListener{
             count --
            textAreaA.text=count.toString()
            textAreaA.textColors.defaultColor
        }
    }
}
