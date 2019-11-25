package com.e.kotlintutorial.model

class RecyclerModel {

    var name:String =""
    var url:String = ""

    fun getname(): String {
        return name
    }

    fun setname(name: String){
        this.name=name
    }

    fun geturl():String{
        return url
    }

    fun seturl(url:String){
        this.url=url
    }
}