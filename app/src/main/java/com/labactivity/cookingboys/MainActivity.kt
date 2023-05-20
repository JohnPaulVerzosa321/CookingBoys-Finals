package com.labactivity.cookingboys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.labactivity.cookingboys.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnforgot.setOnClickListener(){
            val intent =  Intent(this,forgot::class.java)
            startActivity(intent)
            this.finish()

        }

        binding.btnsign.setOnClickListener(){
            val intent =  Intent(this,forgot::class.java)
            startActivity(intent)
            this.finish()
        }




        binding.btnlogin.setOnClickListener(){
            val username = binding.txtUser.text.toString()
           val password = binding.txtPass.text.toString()

            if(username == "admin" && password == "admin123"){
                val intent = Intent (this,categoryHome::class.java)
                startActivity(intent)
                this.finish()

           }
            else if (username == "" || password == "" ) {
                Toast.makeText(this, "Please Enter Username and Password", Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this, "Invalid Username or Password",Toast.LENGTH_LONG).show()

            }
        }




    }



}