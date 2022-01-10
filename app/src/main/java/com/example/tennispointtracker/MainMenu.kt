package com.example.tennispointtracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainmenu) //sets the view to the main menu


        var contentView = "main_menu"

        val titleText = findViewById<TextView>(R.id.titleText)


        val matchNameField = findViewById<EditText>(R.id.matchNameField)
        val matchText = matchNameField.text.toString()



        val nextButton = findViewById<Button>(R.id.nextButton)

        val yourNameField = findViewById<EditText>(R.id.yourNameField)
        val opponentNameField = findViewById<EditText>(R.id.opponentNameField)


        nextButton.setOnClickListener {
            
        }










    }






}