package com.eltrend.american

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_contactus.*

class contactusActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contactus)
        cr1.setOnClickListener {
           startActivity(Intent(this@contactusActivity,MainActivity::class.java))
        }
        cr2.setOnClickListener {
            var i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse("https://www.messenger.com/t/100019467914124")
            startActivity(i)
        }
        cr3.setOnClickListener {
            var i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse("https://www.facebook.com/profile.php?id=100019467914124")
            startActivity(i)
        }

    }
}