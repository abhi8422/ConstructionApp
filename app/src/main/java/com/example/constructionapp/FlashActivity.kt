package com.example.constructionapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.lang.Exception
import java.util.*

class FlashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flash)
        val time= object: Thread() {
            override fun run() = try {
                    Thread.sleep(3000)
                    val intent=Intent(baseContext,MainActivity::class.java)
                startActivity(intent)
                } catch (e:Exception){
                    e.printStackTrace()
                }
        }
        time.start()
    }
}
