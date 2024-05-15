package com.example.notessqlite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notessqlite.databinding.ActivityStartBinding // Import your binding class

class StartActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStartBinding // Declare binding variable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater) // Initialize binding
        setContentView(binding.root)

        // Set click listener for the button using view binding
        binding.startButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
