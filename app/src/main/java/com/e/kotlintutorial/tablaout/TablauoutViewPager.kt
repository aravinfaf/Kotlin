package com.e.kotlintutorial.tablaout

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import butterknife.ButterKnife
import com.e.kotlintutorial.R
import com.google.android.material.tabs.TabLayout

class TablauoutViewPager : AppCompatActivity(){

     var tabLayout:TabLayout?=null
     var fragment:Fragment?=null
     var fragmentmanager:FragmentManager?=null
     var fragmenttransaction:FragmentTransaction?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tab)
        ButterKnife.bind(this)

        tabLayout=findViewById<TabLayout>(R.id.tablayout)

        fragment=JavaFragment()
        fragmentmanager=supportFragmentManager
        fragmenttransaction=fragmentmanager!!.beginTransaction()
        fragmenttransaction!!.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
        fragmenttransaction!!.replace(R.id.framelayout, fragment!!)
        fragmenttransaction!!.commit()

       tabLayout!!.addOnTabSelectedListener(object:TabLayout.OnTabSelectedListener{
           override fun onTabUnselected(p0: TabLayout.Tab?) {
           }

           override fun onTabReselected(p0: TabLayout.Tab?) {
           }

           override fun onTabSelected(p0: TabLayout.Tab) {

               Toast.makeText(applicationContext,""+p0.position,Toast.LENGTH_SHORT).show()

               when(p0!!.position){
                   0-> fragment=JavaFragment()
                   1->fragment=AndroidFragment()
                   2->fragment=PhpFragment()
               }

               val fm=supportFragmentManager
               val ft=fm.beginTransaction()
               ft.replace(R.id.framelayout,fragment!!)
               ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
               ft.commit()

           }
       })


    }
}