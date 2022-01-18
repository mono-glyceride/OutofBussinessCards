package com.example.gurise.outofbussinesscards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gurise.outofbussinesscards.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

    }
}