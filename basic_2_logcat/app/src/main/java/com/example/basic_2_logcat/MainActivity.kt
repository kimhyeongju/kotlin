package com.example.basic_2_logcat

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import java.lang.reflect.Executable

class MainActivity : AppCompatActivity()
    var TAG = "MainActivity"
    var nCount : Int = 0
    val nMaxCount : Int = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogcatTest.setOnClickListener {
            Log.d(javaClass.name, "${nCount++} clicked")
            try{
                val nResult = nMaxCount / (nMaxCount - nCount)
                Log.d("MyLog", "nMaxcount / (nMaxCount - nCount) is ${nResult}")
            } catch ( e : Exception ){
                Log.e("MyLog", "${nCount} : ${e.toString()}")
            }
        }
    }
}