package com.example.constructionapp

import android.app.DatePickerDialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_road.*
import java.util.*

class RoadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_road)
        val c=Calendar.getInstance()
        val year=c.get(Calendar.YEAR)
        val month=c.get(Calendar.MONTH)
        val day=c.get(Calendar.DAY_OF_MONTH)
        textView.setOnClickListener {
            val datePicker=DatePickerDialog(this,DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                textView.setText(" "+dayOfMonth+" "+month+" "+year)
            },year,month,day)
            datePicker.show()
        }
        Button.setOnClickListener(View.OnClickListener {
            val i:Intent
            i= Intent(this,RoadDetails::class.java)
            startActivity(i)
        })

    }
}
