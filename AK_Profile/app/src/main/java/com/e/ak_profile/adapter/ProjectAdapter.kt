package com.e.ak_profile.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.e.ak_profile.R
import com.e.ak_profile.model.ProjectModel

class ProjectAdapter(var ctx:Context,val data:ArrayList<ProjectModel>):RecyclerView.Adapter<ProjectAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val layout=LayoutInflater.from(ctx).inflate(R.layout.project_adapter,parent,false)
        return ViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


    }

    class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {

        val name_TV=itemView.findViewById<TextView>(R.id.name_TV)
        val name_TV=itemView.findViewById<TextView>(R.id.name_TV)
        val name_TV=itemView.findViewById<TextView>(R.id.name_TV)
    }
}