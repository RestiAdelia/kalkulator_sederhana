package com.resti.kalkulator_sederhana

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btntambah : Button
    private lateinit var btnkurang: Button
    private lateinit var btnbagi : Button
    private lateinit var etbil1 :EditText
    private lateinit var etbil2 : EditText
    private lateinit var hasill :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        etbil1 = findViewById(R.id.etbil1)
        etbil2 = findViewById(R.id.etbil2)
        btnkurang = findViewById(R.id.btnkurang)
        btntambah = findViewById(R.id.btntambah)
        btnbagi = findViewById(R.id.btnbagi)
         hasill= findViewById(R.id.hasil)
        btnkurang.setOnClickListener {
            val hasil = etbil1.text.toString().toInt() - etbil2.text.toString().toInt()
            hasill.text = "Hasil pengurangan:" +hasil
        }
        btntambah.setOnClickListener {
            val hasil = etbil1.text.toString().toInt() + etbil2.text.toString().toInt()
            hasill.text = "Hasil penjumlahan:" +hasil
        }
        btnbagi.setOnClickListener {
            val hasil = etbil1.text.toString().toInt() / etbil2.text.toString().toInt()
            hasill.text = "Hasil pembagian:" +hasil
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}