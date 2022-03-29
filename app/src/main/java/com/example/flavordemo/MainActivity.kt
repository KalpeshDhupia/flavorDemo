package com.example.flavordemo

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        getData(BuildConfig.text)

        Glide.with(this).load(BuildConfig.path).into(findViewById(R.id.viewImage))
    }

    private fun getData(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}