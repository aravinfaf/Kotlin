package com.e.kotlintutorial.tablaout

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class TabAdapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager){

    var tabNames: ArrayList<String>? = null
    var fragments : ArrayList<Fragment>? = null

    init {
        tabNames=ArrayList()
        fragments= ArrayList()
    }

    fun Add(fragment:Fragment,title:String){
        tabNames!!.add(title)
        fragments!!.add(fragment)
    }

    override fun getItem(position: Int): Fragment {

    return fragments!!.get(position)
    }

    override fun getCount(): Int {

        return tabNames!!.size
    }
    override fun getPageTitle(position: Int): CharSequence? {
        return tabNames!!.get(position)
    }
}