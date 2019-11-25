package com.e.ak_profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.shrikanthravi.customnavigationdrawer2.data.MenuItem
import com.shrikanthravi.customnavigationdrawer2.widget.SNavigationDrawer

class MainActivity : AppCompatActivity() {

    var color: Int = 0;
    var fragment: Fragment? = null
    var fragmentmanager: FragmentManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val SNavigationDrawer = findViewById<SNavigationDrawer>(R.id.navigationDrawer)
        fragment = ExperienceFragment()
        fragmentmanager = supportFragmentManager

        val arraylist = ArrayList<MenuItem>()

        arraylist.add(MenuItem("Experience", R.drawable.ic_profile))
        arraylist.add(MenuItem("Projects", R.drawable.ic_profile))
        arraylist.add(MenuItem("Education", R.drawable.ic_profile))
        arraylist.add(MenuItem("Skills", R.drawable.ic_profile))
        arraylist.add(MenuItem("Profile", R.drawable.ic_profile))

        SNavigationDrawer.setMenuItemList(arraylist);

        val fragmenttransaction = supportFragmentManager.beginTransaction()
        fragmenttransaction.replace(R.id.frameLayout, fragment!!)
        fragmenttransaction.commit()

        SNavigationDrawer.setOnMenuItemClickListener {

            when (it) {

                0 -> fragment = ExperienceFragment()
                1 -> fragment = ProjectFragment()
                4 -> fragment=ProfileFragment()

            }
            
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frameLayout, fragment!!)
            fragmentTransaction.commit()

        }
    }
}



