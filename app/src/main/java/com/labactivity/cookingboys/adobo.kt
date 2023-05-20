package com.labactivity.cookingboys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.cookingboys.databinding.ActivityAdoboBinding

class adobo : AppCompatActivity() {
    private lateinit var binding: ActivityAdoboBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdoboBinding.inflate(layoutInflater)
        setContentView(binding.root)





    }
}