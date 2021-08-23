package com.example.pokedex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LoginActiviy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_activiy)
        supportActionBar!!.hide()
    }
}