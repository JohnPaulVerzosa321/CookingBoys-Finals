package com.labactivity.cookingboys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.cookingboys.databinding.ActivityChopseuyBinding

class chopseuy : AppCompatActivity() {
    private lateinit var binding: ActivityChopseuyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChopseuyBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}