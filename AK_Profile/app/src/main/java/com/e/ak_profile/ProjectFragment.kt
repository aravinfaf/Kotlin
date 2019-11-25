package com.e.ak_profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

class ProjectFragment : Fragment() {

    lateinit var recyclerView:RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view =inflater.inflate(R.layout.fragment_projects,container,false)
        recyclerView=view.findViewById(R.id.projects_RV)

        projectsdata()

        return view
    }

    private fun projectsdata() {



    }
}