package com.example.basic_1_edittext

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtName.setOnFocusChangeListener { v, hasFocus ->
            val edt = v as EditText     // 형변환 v: view

            val color = if (hasFocus) {
                color.TRANSPARENT
            } else {
                Color.LTGRAY
            }
            edt.setBackgroundColor(color)
        }

        edtPassWD.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                txtViewPassWd.text = s
            }
        })
    }
}