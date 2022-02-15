package com.eltrend.american

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {
    private lateinit var mInterstitialAd: InterstitialAd
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        MobileAds.initialize(this,"ca-app-pub-6572711285388576~9413494046")
        mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.adUnitId = "ca-app-pub-6572711285388576/5119343042"
        mInterstitialAd.loadAd(AdRequest.Builder().build())


        val cm= baseContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = cm.activeNetworkInfo
        if (networkInfo!= null && networkInfo.isConnected){

            if (networkInfo.type == ConnectivityManager.TYPE_WIFI){
                Toast.makeText(baseContext,"Connected Via WIFI Network", Toast.LENGTH_LONG).show()
            }

            if (networkInfo.type == ConnectivityManager.TYPE_MOBILE){
                Toast.makeText(baseContext,"Connected Via MOBILE Network", Toast.LENGTH_LONG).show()
            }
        }else{
            Toast.makeText(baseContext,"No internet Connection", Toast.LENGTH_LONG).show()
            this.finish()
        }
        crmm.setOnClickListener {
     mInterstitialAd.adListener = object: AdListener() {
         override fun onAdClosed() {
           // Code to be executed when the interstitial ad is closed.
             mInterstitialAd.loadAd(AdRequest.Builder().build())
             startActivity(Intent(this@Main2Activity,nine::class.java))

         }
     }
     if (mInterstitialAd.isLoaded) {
         mInterstitialAd.show()
     } else {
         Log.d("TAG", "The interstitial wasn't loaded yet.")
         startActivity(Intent(this@Main2Activity,nine::class.java))
     }
 }

        cr1.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main2Activity,placementestActivity::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main2Activity,placementestActivity::class.java))
            }
        }

        cr2.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                  startActivity(Intent(this@Main2Activity,Main3Activity::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
              startActivity(Intent(this@Main2Activity,Main3Activity::class.java))
            }



        }
        cr3.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                     startActivity(Intent(this@Main2Activity,examButtons::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                 startActivity(Intent(this@Main2Activity,examButtons::class.java))
            }



        }
        cr4.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main2Activity,fifth::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main2Activity,fifth::class.java))
            }



        }

        cr6.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                  startActivity(Intent(this@Main2Activity,contactusActivity::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
              startActivity(Intent(this@Main2Activity,contactusActivity::class.java))
            }



        }
        cr7.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main2Activity,videosActivity::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main2Activity,videosActivity::class.java))
            }



        }
        cr8.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                  startActivity(Intent(this@Main2Activity,levelBooks::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
              startActivity(Intent(this@Main2Activity,levelBooks::class.java))
            }



        }
    }
}