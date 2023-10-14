package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listview.databinding.ActivityMain2Binding
import com.example.listview.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val price = intent.getStringExtra("price")
        val img = intent.getIntExtra("img", 0)

        binding.imgItemProduct.setImageResource(img)
        binding.txtNameItemProduct.text = name
        binding.txtPriceItemProduct.text=price

        binding.btnAct2Back.setOnClickListener {
            onBackPressed()
        }


    }

}
