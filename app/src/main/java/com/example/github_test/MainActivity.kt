package com.example.github_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.github_test.utils.Util

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(Util.TAG, "MainActivity :: onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(Util.TAG, "MainActivity :: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(Util.TAG, "MainActivity :: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(Util.TAG, "MainActivity :: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(Util.TAG, "MainActivity :: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(Util.TAG, "MainActivity :: onDestroy")
    }

    fun clickNext(view: View) {
        if (view.id == R.id.btnClick) {
            Intent(applicationContext, SecondActivity::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(this)
                finish()
            }
        }
    }
}