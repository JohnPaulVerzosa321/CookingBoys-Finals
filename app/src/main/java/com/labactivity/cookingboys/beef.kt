package com.labactivity.cookingboys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.cookingboys.databinding.ActivityBeefBinding

class beef : AppCompatActivity() {
    private lateinit var binding: ActivityBeefBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBeefBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}