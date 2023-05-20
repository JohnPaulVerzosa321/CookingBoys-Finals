package com.labactivity.cookingboys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.cookingboys.databinding.ActivityPaksiwBinding

class paksiw : AppCompatActivity() {
    private lateinit var binding: ActivityPaksiwBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaksiwBinding.inflate(layoutInflater)
        setContentView(binding.root)




    }
}