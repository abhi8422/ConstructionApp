package com.example.constructionapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class RoadDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_road_details)
        val spinner:Spinner=findViewById(R.id.spinner)
        ArrayAdapter.createFromResource(this, R.array.material_array,android.R.layout.simple_spinner_item).also { arrayAdapter ->
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter=arrayAdapter
        }

    }
}
