package com.eltrend.american

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.gms.ads.*
import kotlinx.android.synthetic.main.activity_level_books.*

class levelBooks : AppCompatActivity() {
    private lateinit var mInterstitialAd: InterstitialAd
    lateinit var mAdView : AdView
    companion object {

        var clicked = 21000
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level_books)
        MobileAds.initialize(this,"ca-app-pub-6572711285388576~9413494046")
        mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.adUnitId = "ca-app-pub-6572711285388576/5119343042"
        mInterstitialAd.loadAd(AdRequest.Builder().build())
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
        cr1.setOnClickListener {
               mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                      startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=1

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                  startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=1
            }


        }
          cr2.setOnClickListener {
                 mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                     startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=2

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                 startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=2
            }


        }
          cr3.setOnClickListener {
                 mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                   startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=3

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
               startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=3
            }


        }
          cr4.setOnClickListener {
                 mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                      startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=4

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                  startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=4
            }


        }
          cr5.setOnClickListener {
                 mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                 startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=5

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
             startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=5
            }


        }
          cr6.setOnClickListener {
                 mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                      startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=6

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                  startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=6
            }


        }
          cr7.setOnClickListener {
                 mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=7

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=7
            }


        }
          cr8.setOnClickListener {
                 mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                   startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=8

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
               startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=8
            }


        }
          cr9.setOnClickListener {
                 mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                   startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=9

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
               startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=9
            }


        }
          cr10.setOnClickListener {
                 mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                   startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=10

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
               startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=10
            }


        }
          cr11.setOnClickListener {
                 mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                   startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=11

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
               startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=11
            }


        }
          cr12.setOnClickListener {
                 mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=12

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=12
            }


        }
          cr13.setOnClickListener {
                 mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                     startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=13

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                 startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=13
            }


        }
          cr14.setOnClickListener {
                 mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                     startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=14

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                 startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=14
            }


        }
          cr15.setOnClickListener {
                 mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                     startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=15

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                 startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=15
            }


        }
          cr16.setOnClickListener {
                 mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=16

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@levelBooks, bookUrl::class.java))
            clicked=16
            }


        }



    }
}