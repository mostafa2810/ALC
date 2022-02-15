package com.eltrend.american

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    val REQUEST_PHONE_CALL=1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cr1.setOnClickListener {
            if (ActivityCompat.checkSelfPermission(this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CALL_PHONE),REQUEST_PHONE_CALL)
            }else{
                startCall()
            }

        }
        cr2.setOnClickListener {
            if (ActivityCompat.checkSelfPermission(this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CALL_PHONE),REQUEST_PHONE_CALL)
            }else{
                startCall2()
            }

        }


    }

    private fun startCall() {
        val callIntent=Intent(Intent.ACTION_CALL)
        callIntent.data= Uri.parse("tel:01009664456")
        startActivity(callIntent)
    }
    private fun startCall2() {
        val callIntent=Intent(Intent.ACTION_CALL)
        callIntent.data= Uri.parse("tel:01024686688")
        startActivity(callIntent)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
       if (requestCode == REQUEST_PHONE_CALL)startCall()
    }
}