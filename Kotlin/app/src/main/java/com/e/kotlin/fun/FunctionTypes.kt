package com.e.kotlin.`fun`

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.e.kotlin.R

class FunctionTypes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        call(0,'a')
    }

    fun call(num:Int =5,char: Char='a',num2:Int=3){

        Toast.makeText(applicationContext,"Number = ".plus(num)+"\n"+"Char = "+char,Toast.LENGTH_LONG).show()
        Log.e("funCall","Number = ".plus(num)+"\n"+"Char = "+char+"\n Num2 = "+num2);
    }
}