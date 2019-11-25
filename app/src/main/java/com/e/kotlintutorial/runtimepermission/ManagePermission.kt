package com.e.kotlintutorial.runtimepermission

import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class ManagePermission(val context: Context,val list: List<String>,val code:Int) {

    fun checkPermission(){

        if(isPermissionGranted()!= PackageManager.PERMISSION_GRANTED){
           requestPermission()
        }else{
            context.toast("Permission Granted.")
        }
    }

    fun isPermissionGranted():Int{

        var counter=0

        for(permission in list)
        {
            counter+=ContextCompat.checkSelfPermission(context,permission)
        }
        return counter
    }

    fun deniedPermission():String{

        for (permission in list){
            if(ContextCompat.checkSelfPermission(context,permission)==PackageManager.PERMISSION_GRANTED)
                return permission
        }

        return ""
    }

    fun requestPermission(){
        val permission=deniedPermission()
        if(ActivityCompat.shouldShowRequestPermissionRationale(context as Activity,permission)){
                context.toast("Granted")
        }else{
            ActivityCompat.requestPermissions(context,list.toTypedArray(),code)
        }
    }

    fun processPermissionResult(requestcode : Int ,permissions:Array<String> ,grantResult: IntArray):Boolean{

        var result=0
        if(grantResult.isEmpty()){
            for(item in grantResult){
                result+=item
            }

        }
        if(result==PackageManager.PERMISSION_GRANTED) return true
        return false
    }
}