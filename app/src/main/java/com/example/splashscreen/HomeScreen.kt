package com.example.splashscreen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

class HomeScreen : AppCompatActivity() {


    private lateinit var italianButton: Button
    private lateinit var spanishButton: Button
    private lateinit var frenchButton: Button
    private lateinit var englishButton: Button
    private lateinit var welcomeTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        italianButton = findViewById(R.id.italianButton)
        spanishButton = findViewById(R.id.spanishButton)
        frenchButton = findViewById(R.id.frenchButton)
        englishButton = findViewById(R.id.englishButton)
        welcomeTextView = findViewById(R.id.textViewWelcome)

        italianButton.setOnClickListener {
            welcomeTextView.setText(R.string.hello_world_italian)
        }

        spanishButton.setOnClickListener {
            welcomeTextView.setText(R.string.hello_world_spanish)
        }

        frenchButton.setOnClickListener {
            welcomeTextView.setText(R.string.hello_world_french)
        }

        englishButton.setOnClickListener {
            welcomeTextView.setText(R.string.hello_world)
        }
    }
}


