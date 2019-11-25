package com.e.ak_profile.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.e.ak_profile.R
import com.e.ak_profile.model.ExperienceModel

class ExperienceAdapter(val ctx: Context?, val data:ArrayList<ExperienceModel>) :RecyclerView.Adapter<ExperienceAdapter.ViewHolder>() {

    class ViewHolder (itemview:View): RecyclerView.ViewHolder(itemview){

        val company_TV=itemview.findViewById<TextView>(R.id.companyname_TV)
        val duration_TV=itemview.findViewById<TextView>(R.id.duration_TV)
        val designation_TV=itemview.findViewById<TextView>(R.id.designation_TV)
        val description_TV=itemview.findViewById<TextView>(R.id.description_TV)
        val location_TV=itemview.findViewById<TextView>(R.id.location_TV)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ExperienceAdapter.ViewHolder {

        val lay=LayoutInflater.from(ctx).inflate(R.layout.experience_adapter,parent,false)
        return ViewHolder(lay)
    }

    override fun getItemCount(): Int {
    return data.size
    }

    override fun onBindViewHolder(holder: ExperienceAdapter.ViewHolder, position: Int) {

        Log.e("ADA",data[position].company)

        holder.company_TV.setText(data[position].company)
        holder.duration_TV.setText(data[position].duration)
        holder.designation_TV.setText(data[position].designation)
        holder.description_TV.setText(data[position].description)
        holder.location_TV.setText(data[position].location)

    }
}