package com.eltrend.american

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.gms.ads.*
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {
    private lateinit var mInterstitialAd: InterstitialAd
    lateinit var mAdView : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
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
                    startActivity(Intent(this@Main3Activity, level1Audios::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main3Activity, level1Audios::class.java))
            }



        }
      cr2.setOnClickListener {
             mInterstitialAd.adListener = object: AdListener() {
              override fun onAdClosed() {
                  // Code to be executed when the interstitial ad is closed.
                  mInterstitialAd.loadAd(AdRequest.Builder().build())
                 startActivity(Intent(this@Main3Activity,level1U2Audios::class.java))

              }
          }
          if (mInterstitialAd.isLoaded) {
              mInterstitialAd.show()
          } else {
              Log.d("TAG", "The interstitial wasn't loaded yet.")
             startActivity(Intent(this@Main3Activity,level1U2Audios::class.java))
          }

      }
      cr3.setOnClickListener {
             mInterstitialAd.adListener = object: AdListener() {
              override fun onAdClosed() {
                  // Code to be executed when the interstitial ad is closed.
                  mInterstitialAd.loadAd(AdRequest.Builder().build())
                 startActivity(Intent(this@Main3Activity, level1U3Audios::class.java))

              }
          }
          if (mInterstitialAd.isLoaded) {
              mInterstitialAd.show()
          } else {
              Log.d("TAG", "The interstitial wasn't loaded yet.")
             startActivity(Intent(this@Main3Activity, level1U3Audios::class.java))
          }

      }
      cr4.setOnClickListener {
             mInterstitialAd.adListener = object: AdListener() {
              override fun onAdClosed() {
                  // Code to be executed when the interstitial ad is closed.
                  mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main3Activity, level1U4Audios::class.java))

              }
          }
          if (mInterstitialAd.isLoaded) {
              mInterstitialAd.show()
          } else {
              Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main3Activity, level1U4Audios::class.java))
          }

      }
     cr5.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
              override fun onAdClosed() {
                  // Code to be executed when the interstitial ad is closed.
                  mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main3Activity, level2U5Audios::class.java))

              }
          }
          if (mInterstitialAd.isLoaded) {
              mInterstitialAd.show()
          } else {
              Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main3Activity, level2U5Audios::class.java))
          }

      }
      cr6.setOnClickListener {
             mInterstitialAd.adListener = object: AdListener() {
              override fun onAdClosed() {
                  // Code to be executed when the interstitial ad is closed.
                  mInterstitialAd.loadAd(AdRequest.Builder().build())
                 startActivity(Intent(this@Main3Activity, level2U6Audios::class.java))

              }
          }
          if (mInterstitialAd.isLoaded) {
              mInterstitialAd.show()
          } else {
              Log.d("TAG", "The interstitial wasn't loaded yet.")
             startActivity(Intent(this@Main3Activity, level2U6Audios::class.java))
          }

      }
      cr7.setOnClickListener {
             mInterstitialAd.adListener = object: AdListener() {
              override fun onAdClosed() {
                  // Code to be executed when the interstitial ad is closed.
                  mInterstitialAd.loadAd(AdRequest.Builder().build())
                startActivity(Intent(this@Main3Activity, level2U7Audios::class.java))

              }
          }
          if (mInterstitialAd.isLoaded) {
              mInterstitialAd.show()
          } else {
              Log.d("TAG", "The interstitial wasn't loaded yet.")
            startActivity(Intent(this@Main3Activity, level2U7Audios::class.java))
          }
      }
      cr8.setOnClickListener {
             mInterstitialAd.adListener = object: AdListener() {
              override fun onAdClosed() {
                  // Code to be executed when the interstitial ad is closed.
                  mInterstitialAd.loadAd(AdRequest.Builder().build())
                 startActivity(Intent(this@Main3Activity, level2U8Audios::class.java))

              }
          }
          if (mInterstitialAd.isLoaded) {
              mInterstitialAd.show()
          } else {
              Log.d("TAG", "The interstitial wasn't loaded yet.")
             startActivity(Intent(this@Main3Activity, level2U8Audios::class.java))
          }



      }

        cr9.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main3Activity, level3U9Audios::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main3Activity, level3U9Audios::class.java))
            }



        }
        cr10.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main3Activity, level3U10Audios::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main3Activity, level3U10Audios::class.java))
            }



        }
        cr11.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main3Activity, level3U11Audios::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main3Activity, level3U11Audios::class.java))
            }



        }
        cr12.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main3Activity, level3U12Audios::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main3Activity, level3U12Audios::class.java))
            }



        }
        cr13.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main3Activity, level4U13Audios::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main3Activity, level4U13Audios::class.java))
            }



        }
        cr14.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main3Activity, level4U14Audios::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main3Activity, level4U14Audios::class.java))
            }



        }
        cr15.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main3Activity, level4U15Audios::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main3Activity, level4U15Audios::class.java))
            }



        }
        cr16.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main3Activity, level4U16Audios::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main3Activity, level4U16Audios::class.java))
            }



        }
        cr17.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main3Activity, level5U1Audios::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main3Activity, level5U1Audios::class.java))
            }



        }
        cr18.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main3Activity, level5U2Audios::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main3Activity, level5U2Audios::class.java))
            }



        }
        cr19.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main3Activity, level5U3Audios::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main3Activity, level5U3Audios::class.java))
            }



        }
        cr20.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main3Activity, level5U4Audios::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main3Activity, level5U4Audios::class.java))
            }



        }
        cr21.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main3Activity, level6U5Audios::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main3Activity, level6U5Audios::class.java))
            }



        }
        cr22.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main3Activity, level6U6Audios::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main3Activity, level6U6Audios::class.java))
            }



        }
        cr23.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main3Activity, level6U7Audios::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main3Activity, level6U7Audios::class.java))
            }



        }
        cr24.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main3Activity, level6U8Audios::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main3Activity, level6U8Audios::class.java))
            }



        }
        cr25.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main3Activity, level7U9Audios::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main3Activity, level7U9Audios::class.java))
            }



        }
        cr26.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main3Activity, level7U10Audios::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main3Activity, level7U10Audios::class.java))
            }



        }
        cr27.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main3Activity, level7U11Audios::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main3Activity, level7U11Audios::class.java))
            }



        }
        cr28.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main3Activity, level7U12Audios::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main3Activity, level7U12Audios::class.java))
            }



        }
        cr29.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main3Activity, level8U13Audios::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main3Activity, level8U13Audios::class.java))
            }



        }
        cr30.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main3Activity, level8U14Audios::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main3Activity, level8U14Audios::class.java))
            }



        }
        cr31.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main3Activity, level8U15Audios::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main3Activity, level8U15Audios::class.java))
            }



        }
        cr32.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main3Activity, level8U16Audios::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main3Activity, level8U16Audios::class.java))
            }
        }

    }
}

