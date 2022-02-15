package com.eltrend.american

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.gms.ads.*
import kotlinx.android.synthetic.main.activity_exam_buttons.*


class examButtons : AppCompatActivity() {
    private lateinit var mInterstitialAd: InterstitialAd
    lateinit var mAdView : AdView

    companion object {

        var clicked = 3000000
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exam_buttons)

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
                startActivity(Intent(this@examButtons, examActivity::class.java))
           clicked =34

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
            startActivity(Intent(this@examButtons, examActivity::class.java))
           clicked =34
            }


        }
        cr2.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                   startActivity(Intent(this@examButtons, examActivity::class.java))
           clicked =35

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
               startActivity(Intent(this@examButtons, examActivity::class.java))
           clicked =35
            }



        }

        cr3.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@examButtons,examActivity::class.java))
           clicked =36

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@examButtons,examActivity::class.java))
           clicked =36
            }


        }
        cr4.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@examButtons,examActivity::class.java))
           clicked =37

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@examButtons,examActivity::class.java))
           clicked =37
            }


        }
      cr5.setOnClickListener {
          mInterstitialAd.adListener = object: AdListener() {
              override fun onAdClosed() {
                  // Code to be executed when the interstitial ad is closed.
                  mInterstitialAd.loadAd(AdRequest.Builder().build())
                   startActivity(Intent(this@examButtons,examActivity::class.java))
           clicked =38

              }
          }
          if (mInterstitialAd.isLoaded) {
              mInterstitialAd.show()
          } else {
              Log.d("TAG", "The interstitial wasn't loaded yet.")
               startActivity(Intent(this@examButtons,examActivity::class.java))
           clicked =38
          }


        }
       cr6.setOnClickListener {
           mInterstitialAd.adListener = object: AdListener() {
               override fun onAdClosed() {
                   // Code to be executed when the interstitial ad is closed.
                   mInterstitialAd.loadAd(AdRequest.Builder().build())
                   startActivity(Intent(this@examButtons,examActivity::class.java))
           clicked =39

               }
           }
           if (mInterstitialAd.isLoaded) {
               mInterstitialAd.show()
           } else {
               Log.d("TAG", "The interstitial wasn't loaded yet.")
               startActivity(Intent(this@examButtons,examActivity::class.java))
           clicked =39
           }


        }
        cr7.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                   startActivity(Intent(this@examButtons,examActivity::class.java))
           clicked =40

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
               startActivity(Intent(this@examButtons,examActivity::class.java))
           clicked =40
            }


        }
           cr8.setOnClickListener {
               mInterstitialAd.adListener = object: AdListener() {
                   override fun onAdClosed() {
                       // Code to be executed when the interstitial ad is closed.
                       mInterstitialAd.loadAd(AdRequest.Builder().build())
                        startActivity(Intent(this@examButtons,examActivity::class.java))
           clicked =41

                   }
               }
               if (mInterstitialAd.isLoaded) {
                   mInterstitialAd.show()
               } else {
                   Log.d("TAG", "The interstitial wasn't loaded yet.")
                    startActivity(Intent(this@examButtons,examActivity::class.java))
           clicked =41
               }


        }

    }
}