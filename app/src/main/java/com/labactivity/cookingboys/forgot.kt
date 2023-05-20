package com.labactivity.cookingboys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.cookingboys.databinding.ActivityForgotBinding
import com.labactivity.cookingboys.databinding.ActivityMainBinding

class forgot : AppCompatActivity() {
    private lateinit var binding: ActivityForgotBinding
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding = ActivityForgotBinding.inflate(layoutInflater)
        setContentView(binding.root)

         binding.btnok.setOnClickListener(){
             val intent = Intent(this,MainActivity::class.java)
             startActivity(intent)
         }

    }
}