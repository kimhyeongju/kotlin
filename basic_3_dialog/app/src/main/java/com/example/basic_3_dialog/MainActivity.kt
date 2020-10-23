package com.example.basic_3_dialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.text.InputType
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import org.jetbrains.anko.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAlert.setOnClickListener {
            simpleAlertDialog()
//            ankoAlertDialog()

        btnCustom.setOnClickListener {
            val  dlg = MyDialog(this)
            dlg.setOnDismissListener {
                if(dlg.dayString != "")
                    LongToast("${dlg.dayString}입니다.")
//                Toast.makeText(this, "${dlg.dayString}입니다.",
//                    Toast.LENGTH_LONG).show()
            }
            dlg.show()
        }
        }
    }

    private fun ankoAlertDialog() {
        alert("Hi, I'm hengzhu", "Have you tried turning it off and on again?") {
            yesButton { toast("Oh…") }
            noButton {}
        }.show()
    }

    private fun simpleAlertDialog() {
        val builder = AlertDialog.Builder(this)

        builder.setTitle("타이틀입니다")

        val input = EditText(this)
        input.inputType = InputType.TYPE_CLASS_TEXT
        builder.setView(input)
        builder.setIcon(R.mipmap.ic_launcher_round)

        builder.setMessage("메시지입니다")

        builder.setPositiveButton("OK", { dialog, which -> title = input.text.toString() })

        builder.setNegativeButton("Cancel", { dialog, which -> dialog.cancel()} )

        builder.setCancelable(false)        // 뒤로가기 버튼 눌러도 안 닫힘

//        builder.show()      // builder로 실행시키면 바깥에 터치하면 화면 닫힘
        val dialog = builder.create()       // 바깥 터치로 안 닫힘
        dialog.setCanceledOnTouchOutside(false)
        dialog.show()
    }
}
