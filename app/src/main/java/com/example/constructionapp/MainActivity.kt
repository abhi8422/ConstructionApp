package com.example.constructionapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.RoadId).setOnClickListener(this)
        findViewById<View>(R.id.JcbId).setOnClickListener(this)
        findViewById<View>(R.id.DrainageId).setOnClickListener(this)
        findViewById<View>(R.id.ManholeId).setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        val i: Intent
        if (v != null) {
            when (v.id) {
                R.id.RoadId -> {
                    i = Intent(this, RoadActivity::class.java)
                    startActivity(i)
                }
            }

        }
    }
}
