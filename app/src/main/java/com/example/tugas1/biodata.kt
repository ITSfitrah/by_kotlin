package com.example.tugas1


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class biodata : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)
    }
    class biodata : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_biodata)
            val nama = findViewById<View>(R.id.input_nama) as EditText
            val nim = findViewById<View>(R.id.input_nim) as EditText
            val jurusan = findViewById<View>(R.id.input_jurusan) as EditText
            val angkatan = findViewById<View>(R.id.input_angkatan) as EditText
            val nama_t = findViewById<View>(R.id.output_nama) as TextView
            val nim_t = findViewById<View>(R.id.output_nim) as TextView
            val jurusan_t = findViewById<View>(R.id.output_jurusan) as TextView
            val angkatan_t = findViewById<View>(R.id.output_angkatan) as TextView
            val tampil = findViewById<View>(R.id.btn_tampil) as Button
            tampil.setOnClickListener {
                val nama1 = nama.text.toString()
                val nim1 = nim.text.toString()
                val jurusan1 = jurusan.text.toString()
                val angkatan1 = angkatan.text.toString()
                nama_t.text = nama1
                nim_t.text = nim1
                jurusan_t.text = jurusan1
                angkatan_t.text = angkatan1
            }
        }
    }
}