package com.example.campsitecommanderapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    private lateinit var txtDetails: TextView
    private lateinit var btnBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_detail)

        txtDetails = findViewById(R.id.txtDetails)
        btnBack = findViewById(R.id.btnBack)

        showDetails()

        btnBack.setOnClickListener {
            finish()
        }
    }

    private fun showDetails() {

        var output = ""

        for(i in MainActivity.itemNames.indices) {

            output +=
                "Item: ${MainActivity.itemNames[i]}\n" +
                        "Category: ${MainActivity.categories[i]}\n" +
                        "Quantity: ${MainActivity.quantities[i]}\n" +
                        "Comment: ${MainActivity.comments[i]}\n\n"
        }

        txtDetails.text = output
    }
}