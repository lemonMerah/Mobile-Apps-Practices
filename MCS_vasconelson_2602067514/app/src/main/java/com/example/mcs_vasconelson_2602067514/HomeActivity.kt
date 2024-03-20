package com.example.mcs_vasconelson_2602067514

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.mcs_vasconelson_2602067514.R.id.transaction
import com.google.android.material.tabs.TabItem

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val toTransaction: TextView = findViewById(R.id.transaction)
        toTransaction.setOnClickListener {
            val pindah = Intent(this, transaction::class.java)
            startActivity(pindah)
        }

        val totransaction: TextView = findViewById(R.id.profile)
        toTransaction.setOnClickListener {
            val pindah2 = Intent(this, profile::class.java)
            startActivity(pindah2)
        }


    }
}