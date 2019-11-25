package com.e.kotlintutorial.tablaout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.e.kotlintutorial.R
import kotlinx.android.synthetic.main.tab.*
import kotlinx.android.synthetic.main.tavviewpager.*
import kotlinx.android.synthetic.main.tavviewpager.tablayout

class TabViewPager : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tavviewpager)

        val pageradapter=TabAdapter(supportFragmentManager)

        pageradapter.Add(JavaFragment(),"Java")
        pageradapter.Add(AndroidFragment(),"Android")
        pageradapter.Add(PhpFragment(),"Php")
        viewpager.adapter=pageradapter
        tablayout.setupWithViewPager(viewpager)
    }
}