package com.labactivity.cookingboys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.cookingboys.databinding.ActivityPakbetBinding

class pakbet : AppCompatActivity() {
    private lateinit var binding: ActivityPakbetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPakbetBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}