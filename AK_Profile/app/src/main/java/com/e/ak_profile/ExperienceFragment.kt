package com.e.ak_profile

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.e.ak_profile.adapter.ExperienceAdapter
import kotlinx.android.synthetic.main.fragment_experience.*
import com.e.ak_profile.model.ExperienceModel as Ex

class ExperienceFragment:Fragment() {

    var recyclerView:RecyclerView?=null
    lateinit var data:ArrayList<com.e.ak_profile.model.ExperienceModel>
    var adapter:ExperienceAdapter?=null
    lateinit var call:RelativeLayout
    lateinit var mail:RelativeLayout

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view=inflater.inflate(R.layout.fragment_experience,container,false)
        recyclerView=view.findViewById(R.id.experienceinfo_RL)
        call=view.findViewById(R.id.contact_RL)
        mail=view.findViewById(R.id.mail_RL)

        experiencedata()

        call.setOnClickListener(View.OnClickListener {

            val intent=Intent(Intent.ACTION_CALL,Uri.fromParts("tel",contactno_TV.text.toString(),null))
            startActivity(intent)
        })

        mail.setOnClickListener(View.OnClickListener {

            val intent=Intent(Intent.ACTION_VIEW)
            val data:Uri= Uri.parse("mailto:"+mail_TV.text.toString()+"?subject=Job&body=Say Something..")
            intent.setData(data)
            startActivity(intent)
        })

        return view
    }

    private fun experiencedata() {

        data= ArrayList()
        data!!.add(Ex( "KG Information and Systems","Coimbatore,TamilNadu","July'2019 - Till Present","Android Application Developer",getString(R.string.desc_kg)));
        data!!.add(Ex("Indus Novateur Softech Pvt Ltd","Coimbatore,TamilNadu","Oct'2018 - July'2019","Android Application Developer",getString(R.string.desc_indus)));
        data!!.add(Ex("Open Source Academy","Coimbatore,TamilNadu","Feb'2016 - Sep'2018","Android Application Developer",getString(R.string.osa)));

        Log.e("DATA",data[2].company)

        recyclerView?.layoutManager =LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        adapter= ExperienceAdapter(context, data)
        recyclerView?.adapter =adapter
    }


}