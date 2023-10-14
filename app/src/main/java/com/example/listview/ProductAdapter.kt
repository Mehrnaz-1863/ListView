package com.example.listview

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.listview.databinding.ListItemBinding

class ProductAdapter(
    private val context: Activity,
    private val data: Array<DataProduct>,

    ) : ArrayAdapter<DataProduct>(
    context,
    R.layout.list_item,
    data
) {

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val binding = ListItemBinding.inflate(context.layoutInflater)
        binding.txtName.text = data[position].name
        binding.txtPrice.text = data[position].price
        binding.imageView.setImageResource(data[position].imgAddress)

        binding.btnShow.setOnClickListener {
            // Toast.makeText(context,data[position].name,Toast.LENGTH_SHORT).show()
            val intent = Intent(context, MainActivity2::class.java)

            intent.putExtra("name", data[position].name)
            intent.putExtra("price", data[position].price)
            intent.putExtra("img", data[position].imgAddress)
            context.startActivity(intent)
        }
        return binding.root
    }

}