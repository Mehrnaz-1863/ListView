package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val data = arrayOf(
        DataProduct(1, "leather bag", "500,000T", R.drawable.bag_1),
        DataProduct(2, "leather gloves", "400,000T", R.drawable.images_6),
        DataProduct(3, "smart phone", "10,000,000T", R.drawable.images_2),
        DataProduct(4, "smart watch", "2,000,000T", R.drawable.images_3),
        DataProduct(5, "flash-memory", "300,000T", R.drawable.images_5),
        DataProduct(6, "backpack", "900,000T", R.drawable.images_4),
        DataProduct(6, "exercise mat", "500,000T", R.drawable.images_7),
        DataProduct(6, "volleyball ball", "1,5000,000T", R.drawable.images_8),
        DataProduct(6, "badminton racket", "2,000,000T", R.drawable.images_9),
        DataProduct(6, "ping pong racket", "600,000T", R.drawable.images_10),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = ProductAdapter(this, data)
        binding.listView.adapter = adapter


    }
}


//   defaulAdapter
//        val content= arrayOf("Android","Google","Ios","Windows","Apple","Microsoft")
//        val adapter= ArrayAdapter(
//            this,
//            android.R.layout.simple_list_item_1,
//            content)
//
//        binding.listView.adapter=adapter
//        binding.listView.setOnItemClickListener { parent, view, Index, id ->
//
//            Toast.makeText(this,content[Index],Toast.LENGTH_SHORT).show()