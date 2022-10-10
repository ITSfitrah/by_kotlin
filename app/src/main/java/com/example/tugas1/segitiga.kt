package com.example.tugas1


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class segitiga : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segitiga)
    }
    class Segitiga : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_segitiga)
            val alas = findViewById<View>(R.id.input_alas) as EditText
            val tinggi = findViewById<View>(R.id.input_tinggi) as EditText
            val hasil = findViewById<View>(R.id.output_luas) as TextView
            val tampil = findViewById<View>(R.id.btn_proses) as Button
            tampil.setOnClickListener {
                val tinggi1: Double
                val alas1: Double
                alas1 = alas.text.toString().toDouble()
                tinggi1 = tinggi.text.toString().toDouble()
                val rumus = 0.5 * alas1 * tinggi1
                hasil.text = java.lang.Double.toString(rumus)
            }
        }
    }


}