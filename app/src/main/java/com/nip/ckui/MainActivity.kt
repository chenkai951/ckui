package com.nip.ckui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nip.testapi.TestApi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TestApi().getTestHello(this)
    }
}