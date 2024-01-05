package com.example.kamaalcafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kamaalcafe.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    //creating a key to link two pages
    companion object {
        const val KEY = "com.example.kamaalcafe.KEY"
     }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val orderList = binding.order1.text.toString() + " " +
                    binding.order2.text.toString()+ " " +
                    binding.order3.text.toString() + " " +
                    binding.order4.text.toString()


            intent = Intent(this, Order::class.java)
            intent.putExtra(KEY, orderList)
            startActivity(intent)
        }
    }
}