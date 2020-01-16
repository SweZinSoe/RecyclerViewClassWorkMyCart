package com.szs.recyclerviewclassworktwo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.szs.recyclerviewclassworktwo.model.MyCart
import org.w3c.dom.Text

class CartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val itemName = itemView.findViewById<TextView>(R.id.txt_itemName)
    val price = itemView.findViewById<TextView>(R.id.txt_price)
    val kilogram = itemView.findViewById<TextView>(R.id.txt_weight)
    val image = itemView.findViewById<ImageView>(R.id.img_item)
    val btnDecrease = itemView.findViewById<Button>(R.id.btn_decrease)
    val btnIncrease = itemView.findViewById<Button>(R.id.btn_increase)
}

class CartAdapter(val listArray: ArrayList<MyCart>) : RecyclerView.Adapter<CartViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cart_item, parent, false)
        return CartViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listArray.size
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        holder.itemName.text = listArray[position].myItems
        holder.price.text = listArray[position].price.toString()

        holder.btnDecrease.setOnClickListener {
            var count: Int = holder.kilogram.text.toString().toInt()
            count--
            if (count >= 0)
                holder.kilogram.text = count.toString()
        }

        holder.btnIncrease.setOnClickListener {
            var count: Int = holder.kilogram.text.toString().toInt()
            count++
            holder.kilogram.text = count.toString()
        }

        holder.image.setImageResource(listArray[position].image)
    }

}