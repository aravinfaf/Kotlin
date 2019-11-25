package com.e.kotlintutorial.tablaout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.e.kotlintutorial.R

class JavaFragment:Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val view=inflater.inflate(R.layout.fragment_java,container,false)

        return view
    }
}