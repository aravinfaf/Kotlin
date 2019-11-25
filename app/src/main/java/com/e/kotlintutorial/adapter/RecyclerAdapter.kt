package com.e.kotlintutorial.adapter

import android.app.Activity
import android.content.Context
import android.util.Log
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

public class RecyclerAdapter(ctx : Context, val data:ArrayList<RecyclerModel>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var inflater: LayoutInflater? = null
    var ctx:Context

    init {
        inflater= LayoutInflater.from(ctx)
        this.ctx=ctx
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val inflater=LayoutInflater.from(parent.context).inflate(R.layout.adapter_layout,parent,false);
        return  ViewHolder(inflater)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
       holder.tv.text= data.get(position).getname()
        Log.e("Name",data.get(position).getname())
        Glide
            .with(ctx)
            .load(data.get(position).geturl())
            .centerCrop()
            .placeholder(R.drawable.ic_launcher_background)
            .into(holder.iv);

        holder.iv.setOnClickListener(View.OnClickListener {
            Toast.makeText(ctx,data.get(position).getname(),Toast.LENGTH_SHORT).show()
        })

    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {

        val tv=v.findViewById<TextView>(R.id.tv)
        val iv=v.findViewById<ImageView>(R.id.iv)

    }

    }