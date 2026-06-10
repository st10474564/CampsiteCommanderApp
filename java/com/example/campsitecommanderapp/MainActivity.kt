package com.example.campsitecommanderapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var edtItem: EditText
    private lateinit var edtCategory: EditText
    private lateinit var edtQuantity: EditText
    private lateinit var edtComment: EditText

    private lateinit var txtTotal: TextView

    private lateinit var btnAdd: Button
    private lateinit var btnView: Button

    companion object {

        val itemNames = ArrayList<String>()
        val categories = ArrayList<String>()
        val quantities = ArrayList<Int>()
        val comments = ArrayList<String>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        edtItem = findViewById(R.id.edtItem)
        edtCategory = findViewById(R.id.edtCategory)
        edtQuantity = findViewById(R.id.edtQuantity)
        edtComment = findViewById(R.id.edtComment)

        txtTotal = findViewById(R.id.txtTotal)

        btnAdd = findViewById(R.id.btnAdd)
        btnView = findViewById(R.id.btnView)

        loadSampleData()

        calculateTotal()

        btnAdd.setOnClickListener {

            addGear()
        }

        btnView.setOnClickListener {

            startActivity(
                Intent(this, DetailActivity::class.java)
            )
        }
    }

    private fun loadSampleData() {

        if(itemNames.isEmpty()) {

            itemNames.add("Tent")
            categories.add("Shelter")
            quantities.add(1)
            comments.add("4-person waterproof")

            itemNames.add("Marshmallows")
            categories.add("Food")
            quantities.add(3)
            comments.add("For Smores")

            itemNames.add("Flashlight")
            categories.add("Safety")
            quantities.add(2)
            comments.add("Check batteries")
        }
    }

    @SuppressLint("SetTextI18n")
    private fun calculateTotal() {

        var total = 0

        for(qty in quantities) {
            total += qty
        }

        txtTotal.text = "Total Items Packed: $total"
    }

    private fun addGear() {

        val item = edtItem.text.toString()
        val category = edtCategory.text.toString()
        val quantity = edtQuantity.text.toString()
        val comment = edtComment.text.toString()

        if(item.isEmpty() ||
            category.isEmpty() ||
            quantity.isEmpty() ||
            comment.isEmpty()) {

            Toast.makeText(
                this,
                "Please fill all fields",
                Toast.LENGTH_SHORT
            ).show()

            return
        }

        itemNames.add(item)
        categories.add(category)
        quantities.add(quantity.toInt())
        comments.add(comment)

        Log.d("APP", "New gear added")

        calculateTotal()

        Toast.makeText(
            this,
            "Gear Added",
            Toast.LENGTH_SHORT
        ).show()

        edtItem.text.clear()
        edtCategory.text.clear()
        edtQuantity.text.clear()
        edtComment.text.clear()
    }
}