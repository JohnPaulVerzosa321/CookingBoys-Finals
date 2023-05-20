package com.labactivity.cookingboys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.cookingboys.databinding.ActivityTahongBinding

class tahong : AppCompatActivity() {
    private lateinit var binding: ActivityTahongBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTahongBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}