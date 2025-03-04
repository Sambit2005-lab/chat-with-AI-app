package com.example.chatgptapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.chatgptapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.chat1.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this,chat::class.java))
        })

        binding.image1.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this,image::class.java))
        })



    }
}