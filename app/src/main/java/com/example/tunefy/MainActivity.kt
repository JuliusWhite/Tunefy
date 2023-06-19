package com.example.tunefy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val forYouImage1: ImageView = findViewById(R.id.yourMusicImage1)
        val forYouImage2: ImageView = findViewById(R.id.yourMusicImage2)
        val forYouImage3: ImageView = findViewById(R.id.yourMusicImage3)
        val forYouImage4: ImageView = findViewById(R.id.yourMusicImage4)

        val intent = Intent(this, MusicPlayerActivity::class.java)

        forYouImage1.setOnClickListener {
            startActivity(intent)
        }
        forYouImage2.setOnClickListener {
            startActivity(intent)
        }
        forYouImage3.setOnClickListener {
            startActivity(intent)
        }
        forYouImage4.setOnClickListener {
            startActivity(intent)
        }
    }
}