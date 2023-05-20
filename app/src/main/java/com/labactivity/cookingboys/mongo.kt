package com.labactivity.cookingboys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.cookingboys.databinding.ActivityMongoBinding

class mongo : AppCompatActivity() {
    private lateinit var binding: ActivityMongoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMongoBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}