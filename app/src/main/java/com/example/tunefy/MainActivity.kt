package com.example.tunefy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val forYouImage1: ImageView = findViewById(R.id.forYouImage1)
        val forYouImage2: ImageView = findViewById(R.id.forYouImage2)
        val forYouImage3: ImageView = findViewById(R.id.forYouImage3)
        val forYouImage4: ImageView = findViewById(R.id.forYouImage4)

        forYouImage1.setOnClickListener {
            val intent = Intent(this@MainActivity, MusicPlayerActivity::class.java)
            startActivity(intent)
        }
        forYouImage2.setOnClickListener {
            val intent = Intent(this@MainActivity, MusicPlayerActivity::class.java)
            startActivity(intent)
        }
        forYouImage3.setOnClickListener {
            val intent = Intent(this@MainActivity, MusicPlayerActivity::class.java)
            startActivity(intent)
        }
        forYouImage4.setOnClickListener {
            val intent = Intent(this@MainActivity, MusicPlayerActivity::class.java)
            startActivity(intent)
        }
    }
}