package com.labactivity.cookingboys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.cookingboys.databinding.ActivityHiponBinding

class hipon : AppCompatActivity() {
    private lateinit var binding: ActivityHiponBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHiponBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}