package com.labactivity.cookingboys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.cookingboys.databinding.ActivitySinigangBinding

class sinigang : AppCompatActivity() {
    private lateinit var  binding: ActivitySinigangBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySinigangBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}