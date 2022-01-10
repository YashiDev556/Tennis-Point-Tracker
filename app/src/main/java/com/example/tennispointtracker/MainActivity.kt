package com.example.tennispointtracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

import com.example.tennispointtracker.MainMenu

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val matchTitle = findViewById<TextView>(R.id.matchTitle)

        if (intent != null) {
            if (intent.extras != null) {
                matchTitle.text = intent.extras!!.getString("MatchText")
            }
        }


        val mainMenuButton = findViewById<Button>(R.id.mainMenuButton)

        val mainMenuIntent = Intent(this, MainMenu::class.java)

        mainMenuButton.setOnClickListener {
            //goes back to main menu
            startActivity(mainMenuIntent)
        }

    }
}