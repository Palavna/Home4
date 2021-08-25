package com.example.home4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val knopka = findViewById<Button>(R.id.btn)
        val yana = findViewById<EditText>(R.id.bat1)
        val editText2 = findViewById<EditText>(R.id.bat2)
        val editText3 = findViewById<EditText>(R.id.bat3)
        val editText4 = findViewById<EditText>(R.id.bat4)
        val editText5 = findViewById<EditText>(R.id.bat5)

        knopka.setOnClickListener {
            val text = yana.text.toString()
            val text1 = editText2.text.toString()
            val text2 = editText3.text.toString()
            val text3 = editText4.text.toString()
            val text4 = editText5.text.toString()


            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("kolai", text)
            intent.putExtra("inputtedText1", text1)
            intent.putExtra("inputtedText2", text2)
            intent.putExtra("inputtedText3", text3)
            intent.putExtra("inputtedText4", text4)




            startActivity(intent)
        }
    }
}