package com.example.textview__button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    lateinit var txv  : TextView
    lateinit var txv2 : TextView
    lateinit var txv3 : TextView
    lateinit var txv4 : TextView


    lateinit var btn  :  Button
    lateinit var btn2 :  Button
    lateinit var btn3 :  Button
    lateinit var btn4 :  Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txv =  findViewById(R.id.tv)
        txv2 = findViewById(R.id.tv2)
        txv3 = findViewById(R.id.tv3)
        txv4 = findViewById(R.id.tv4)


        btn = findViewById(R.id.button)
        btn2 = findViewById(R.id.button2)
        btn3 = findViewById(R.id.button3)
        btn4 = findViewById(R.id.button4)


        btn.setOnClickListener {
            txv.text = "Hi \uD83D\uDC4B, I'm Md.Sakender Saikot"
        }

        btn2.setOnClickListener {
            txv2.text = "Baneswar,Rajshahi"
        }

        btn3.setOnClickListener {
            txv3.text  = "Varendra Universuty \nDept of CSE"
        }

        btn4.setOnClickListener {
            txv4.text = "Sleeping"
        }

    }
}