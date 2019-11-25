package com.e.kotlintutorial.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.e.kotlintutorial.R
import com.e.kotlintutorial.model.RecyclerModel

class Adapter(ctx:Context,val data:ArrayList<RecyclerModel>):RecyclerView.Adapter<Adapter.ViewHolder>() {

    var layoutInflater:LayoutInflater?=null
    var ctx:Context

    init {
        layoutInflater= LayoutInflater.from(ctx)
        this.ctx=ctx
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view=LayoutInflater.from(ctx).inflate(R.layout.adapter_layout,parent,false)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        if(holder is ViewHolder){

            holder.tv.setText(data.get(position).getname())
            Glide.with(ctx).load(data.get(position).geturl()).placeholder(R.drawable.ic_launcher_background).into(holder.iv)

            holder.iv.setOnClickListener(View.OnClickListener {

                Toast.makeText(ctx,data.get(position).getname(),Toast.LENGTH_LONG).show()

            })

        }
    }

    class ViewHolder (itemview:View):RecyclerView.ViewHolder(itemview){

        val tv=itemview.findViewById<TextView>(R.id.tv)
        val iv=itemview.findViewById<ImageView>(R.id.iv)

    }
}