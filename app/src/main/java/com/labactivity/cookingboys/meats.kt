package com.labactivity.cookingboys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.cookingboys.databinding.ActivityMeatsBinding

class meats : AppCompatActivity() {
    private lateinit var binding: ActivityMeatsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMeatsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnadobo.setOnClickListener(){
            val intent = Intent(this,adobo::class.java)
            startActivity(intent)
        }

        binding.btnbeefsteak.setOnClickListener(){
            val intent = Intent(this,beef::class.java)
            startActivity(intent)
        }

        binding.btnsinigang.setOnClickListener(){
            val intent = Intent(this,sinigang::class.java)
            startActivity(intent)
        }


    }
}