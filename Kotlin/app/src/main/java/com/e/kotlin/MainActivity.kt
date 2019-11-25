package com.e.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val a= Array(3,{i->i*2})


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv=findViewById<TextView>(R.id.tv)
        tv.setText("Aravind").toString()

        val v1=100
        val v2:Long=v1.toLong()
        tv.setText(v2.toString())

        val v3:Int=v2.toInt()
        tv.setText(v3.toString())




        tv.setOnClickListener(){

            val num=11

           var provide= when(num){

                in 1..12-> "hello"
                in 2..7->"AK"
                in 3..11->"Raj"
                4,8,13->"Welcome"
                else -> "Invalid"

            }

            Toast.makeText(applicationContext,"Hello $provide".plus(num),Toast.LENGTH_LONG).show()

        }

    }
}
