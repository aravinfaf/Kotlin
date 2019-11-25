package com.e.kotlin.operator

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.e.kotlin.R

class Operator : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var a = 5
        var b = 6
        var flag=true

        val max = if (a > b) {

                print("a is greater "+a)
        } else {
                print("b is greater ".plus(b))
        }

        print("Greater values is :$max")

        //Arithmetic Operator(+,-,*,/,%)

        a+=b
        print("a+b=$a")//11
        Log.e("a+=b",a.toString());

        a=a-b
        print("a-b=$a")//-1
        Log.e("a-=b",a.toString());

        a*=b
        print("a*b=$a")//30
        Log.e("a*=b",a.toString());

        a/=b
        print("a/b=$a")//0
        Log.e("a/=b",a.toString());

        a%=b
        print("a%b=$a")//5
        Log.e("a%=b",a.toString());


        //Unary Operator(+,-,++,==,!)

        print("++a".plus(++a))
        print("--a".plus(--a))
        print("!flag".plus(!flag))

        //Logical Operator(&&,||,!)

    }
}