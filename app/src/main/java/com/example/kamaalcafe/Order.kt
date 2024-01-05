package com.example.kamaalcafe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kamaalcafe.databinding.ActivityOrderBinding
import java.security.Key

class Order : AppCompatActivity() {
    private lateinit var binding: ActivityOrderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ordersOfCustomers = intent.getStringExtra(MainActivity.KEY)

        binding.textView.text = "Order Placed " + ordersOfCustomers.toString()
    }
}