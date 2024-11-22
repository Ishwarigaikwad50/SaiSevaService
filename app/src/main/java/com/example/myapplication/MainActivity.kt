package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set up click listener for Map ImageView
        val imageView: ImageView = findViewById(R.id.img_map)
        imageView.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/wNTm8KygKfve73tx9"))
            startActivity(browserIntent)
        }

        // Set up click listener for Next ImageView
        val next: ImageView = findViewById(R.id.next)
        next.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }
    }
}
