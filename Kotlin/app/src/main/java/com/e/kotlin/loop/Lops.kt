package com.e.kotlin.loop

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.e.kotlin.R

class Lops :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //For Loop

        val a= arrayOf(1,2,3,4)
        for(i in 0..3 ){
            Log.e("Inc $i",a[i].toString())
        }

        for(i in 3 downTo 0){
            Log.e("Dec $i",a[i].toString())
        }

        for(i in 3 downTo 0 step 2){
            Log.e("Step $i",a[i].toString())
        }

        //Break
        var b=5

        for(i in 0..b){
            Log.e("ForLoop_BREAK",i.toString())
            if(i==5){
                break
            }
        }

        //Continue

        for(i in 0..b){
            Log.e("ForLoop_CONTINUE",i.toString())

            if(i%2==0){
                continue
            }
            Log.e("CONT","After Continue")
        }
    }
}