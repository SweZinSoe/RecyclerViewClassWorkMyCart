package com.szs.recyclerviewclassworktwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.szs.recyclerviewclassworktwo.model.MyCart
import kotlinx.android.synthetic.main.cart_item.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_myCart)
        val itemArray = ArrayList<MyCart>()

        itemArray.add(MyCart("Fine Grain Sugar", "Price - \$20.00", "1kg", R.drawable.sugarone))
        itemArray.add(MyCart("Peanuts","Price - \$20.00", "2kg", R.drawable.peanutsone))
        itemArray.add(MyCart("Dawat Rice", "Price - \$80.00", "3kg", R.drawable.riceone))

        val adapter = CartAdapter(itemArray)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter


    }
}
