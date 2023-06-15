package com.example.tunefy

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MusicPlayerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music_player)

        val tunefyIcon: ImageView = findViewById(R.id.tunefyIcon)

        val intent = Intent(this, MainActivity::class.java)

        tunefyIcon.setOnClickListener {
            startActivity(intent)
        }

    }
}
