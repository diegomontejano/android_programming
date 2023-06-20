package com.example.android_programming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.app.NetworkManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // main view: res > layout > activity_main.xml
        setContentView(R.layout.activity_main)
        // run code
        runCode()
    }

    fun runCode() {
        val books = NetworkManager().parseJson()
        Log.d("DEBUG parseJson()", books.toString())
    }

}
