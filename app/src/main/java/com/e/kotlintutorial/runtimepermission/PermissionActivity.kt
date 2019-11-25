package com.e.kotlintutorial.runtimepermission

import android.Manifest
import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.e.kotlintutorial.R

class PermissionActivity : AppCompatActivity() {

    private val REQ_CODE=123
    lateinit var btn:Button
    lateinit var managePermission:ManagePermission

    val list= listOf<String>( Manifest.permission.CAMERA,
        Manifest.permission.READ_CONTACTS,
        Manifest.permission.READ_EXTERNAL_STORAGE,
        Manifest.permission.SEND_SMS,
        Manifest.permission.READ_CALENDAR)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_permission)

        managePermission= ManagePermission(this, list,REQ_CODE)

        btn=findViewById(R.id.btn)

        btn.setOnClickListener(View.OnClickListener {
            managePermission.checkPermission()
        })
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        when (requestCode) {

            REQ_CODE -> {

                val isPermissionGranted =
                managePermission.processPermissionResult(requestCode, permissions, grantResults)

            if (isPermissionGranted) {
                toast("Permission Granted")
            } else {
                toast("Permission Denied")
            }

                return
        }
        }
    }
}

 fun Context.toast(message:String){
    Toast.makeText(applicationContext,message,Toast.LENGTH_SHORT).show()
}