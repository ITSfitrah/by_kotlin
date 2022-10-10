package com.example.tugas1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
        }

        fun biodata(view: View?) {
            val a = Intent(
                this@MainActivity,
                biodata::class.java
            )
            startActivity(a)
        }
        fun Segitiga(view: View?) {
            val a = Intent(
                this@MainActivity,
                segitiga::class.java
            )
            startActivity(a)
        }

    }
}