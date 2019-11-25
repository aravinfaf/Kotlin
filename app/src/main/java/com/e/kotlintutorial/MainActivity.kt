package com.e.kotlintutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import butterknife.BindView

class MainActivity : AppCompatActivity() {

    val id:Int =7;
    val name:String="Aravind";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv=findViewById<TextView>(R.id.tv)
        tv.setText("Aravind")


        tv.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"You Clicked TextView",Toast.LENGTH_LONG).show()
        })

        val buttonintent=findViewById<Button>(R.id.intent)
        buttonintent.setOnClickListener(View.OnClickListener {
            val gosecondactivity=Intent(applicationContext,SecondActivity::class.java)

            gosecondactivity.putExtra("intval",id)
            gosecondactivity.putExtra("stringval",name)

            startActivity(gosecondactivity)
        })
    }
}
