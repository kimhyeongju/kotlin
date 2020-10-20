package com.example.basic_1_button

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ID값으로 Control 변수를 사용
        var btn2 = findViewById<Button>(R.id.btn2)
        btn2.setOnClickListener {
            btn2.apply{
                text = "Click!"
                setTextColor(Color.parseColor("#333333"))
                setBackgroundColor(Color.parseColor("#FFFF33"))
            }
        }

    }
}

