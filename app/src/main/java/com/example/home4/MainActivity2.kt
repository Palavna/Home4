package com.example.home4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val lol = findViewById<TextView>(R.id.bat11)
        val akk1text = findViewById<TextView>(R.id.gradus)
        val akk2text = findViewById<TextView>(R.id.pusto)
        val akk3text = findViewById<TextView>(R.id.bat10)
        val akk4text = findViewById<TextView>(R.id.bat12)

        lol.text = intent.getStringExtra("kolai")
        akk1text.text = intent.getStringExtra("inputtedText1") + "°"
        akk2text.text = intent.getStringExtra("inputtedText2")
        akk3text.text = intent.getStringExtra("inputtedText3")
        akk4text.text = intent.getStringExtra("inputtedText4")
    }
}