package com.example.cardviewjsonprekotl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ingresarAPP(view: View){
        val intent = Intent(this, MainActivity2::class.java)

        startActivity(intent)
    }
}