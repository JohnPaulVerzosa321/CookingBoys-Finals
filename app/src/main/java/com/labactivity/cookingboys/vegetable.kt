package com.labactivity.cookingboys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.cookingboys.databinding.ActivityVegetableBinding

class vegetable : AppCompatActivity() {
    private lateinit var binding: ActivityVegetableBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVegetableBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnchopseuy.setOnClickListener(){
            val intent = Intent(this,chopseuy::class.java)
            startActivity(intent)
        }

        binding.btnpakbet.setOnClickListener(){
            val intent = Intent(this,pakbet::class.java)
            startActivity(intent)
        }

        binding.btnmongo.setOnClickListener(){
            val intent = Intent(this,mongo::class.java)
            startActivity(intent)
        }


    }
}