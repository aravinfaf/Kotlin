package com.e.kotlintutorial

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(),View.OnClickListener{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

      val b: Bundle? =intent.extras
        val id= b?.get("intval")
        val name= b?.get("stringval")

        Toast.makeText(applicationContext,id.toString()+""+name,Toast.LENGTH_SHORT).show()

        val btn=findViewById<Button>(R.id.btn)
        val tv=findViewById<TextView>(R.id.tv)
        val et=findViewById<EditText>(R.id.et)

        btn.setOnClickListener(this)


        et.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                Toast.makeText(applicationContext,"executed before making any change over EditText",Toast.LENGTH_SHORT).show()
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                Toast.makeText(applicationContext,"executed while making any change over EditText",Toast.LENGTH_SHORT).show()
            }
            override fun afterTextChanged(p0: Editable?) {
                //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                Toast.makeText(applicationContext,"executed after change made over EditText",Toast.LENGTH_SHORT).show()
            }
        })
    }

    override fun onClick(p: View?) {

        if(p==btn){
            val value=et.text.toString()

            if(value.length==0){
                Toast.makeText(this,"Enter Text",Toast.LENGTH_SHORT).show()
            }
            else {
                tv.setText(value)

                val explicitintent=Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.co.in/"))
                startActivity(explicitintent)
            }
        }
    }
}
