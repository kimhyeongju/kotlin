package com.example.basic_3_dialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import kotlinx.android.synthetic.main.dialog_my.*
import java.text.SimpleDateFormat

class MyDialog(ctx : Context) : Dialog( ctx ) {
    open var dayString = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_my)

        dayString = SimpleDateFormat("yyyy-MM-dd").format(calendarView.date)
        txtSelectDate.text = dayString

        // 캘린더 control의 일정이 바뀔 경우 발생하는 이벤트핸들러 등록 및 구현
        calendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->
            dayString = "${year}-${month + 1}-${dayOfMonth}"
            txtSelectDate.text = dayString
        }

        btn_OK.setOnClickListener {
            dismiss()   // 다이얼로그 닫기
        }

        btn_Cancel.setOnClickListener {
            dayString = ""
            dismiss()
        }
    }
}