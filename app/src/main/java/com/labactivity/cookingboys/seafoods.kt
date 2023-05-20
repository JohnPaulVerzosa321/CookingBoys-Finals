package com.labactivity.cookingboys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.cookingboys.databinding.ActivitySeafoodsBinding

class seafoods : AppCompatActivity() {
    private lateinit var binding: ActivitySeafoodsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySeafoodsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnpaksiw.setOnClickListener(){
            val intent = Intent(this,paksiw::class.java)
            startActivity(intent)
        }

        binding.btnhipon.setOnClickListener(){
            val intent = Intent(this,hipon::class.java)
            startActivity(intent)
        }

        binding.btntahong.setOnClickListener(){
            val intent = Intent(this,tahong::class.java)
            startActivity(intent)
        }








    }
}