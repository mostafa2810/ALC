package com.eltrend.american

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebView
import android.webkit.WebViewClient
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_exam.*


class examActivity : AppCompatActivity() {
    private lateinit var mInterstitialAd: InterstitialAd
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exam)
        MobileAds.initialize(this,"ca-app-pub-6572711285388576~9413494046")
        mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.adUnitId = "ca-app-pub-6572711285388576/5119343042"
        mInterstitialAd.loadAd(AdRequest.Builder().build())
        val myWebView: WebView =findViewById(R.id.myURL)
        myWebView.webViewClient=object : WebViewClient(){
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        myWebView.settings.javaScriptEnabled=true
        myWebView.settings.allowContentAccess=true
        myWebView.settings.domStorageEnabled=true
        myWebView.settings.useWideViewPort=true
        myWebView.settings.setAppCacheEnabled(true)
      when
      {
          examButtons.clicked==34-> myURL.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSf0GeDomPWrf5r7hZQbQdZCWSvKtNUUNyvumIpewgrgFziw9g/viewform")
          examButtons.clicked==35-> myURL.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSef1wTtToYe0sV-Sic2iGyGgaoUc8Ndh_tJlyHLG3a4CS_uVg/viewform")
          examButtons.clicked==36-> myURL.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSdacMpePQDG4_T6sNZ37z0gYVhRJ7LfqSI5VeOjSdiuAGpY4g/viewform")
          examButtons.clicked==37-> myURL.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSdd1nljGVeLoePkA2_lXFhY_0WHoo5I0oNO_csyFmHe8uHQWw/viewform")
          examButtons.clicked==38-> myURL.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfsygh4g0YgYFQFPEehloVFghrmMKq0psczEu-Y3zCswQxYHg/viewform")
          examButtons.clicked==39-> myURL.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSe4mAcnZUzqFmB-4HPnIHsJGNXQlZTGZtZL23cc4X-J30cT0A/viewform")
          examButtons.clicked==40-> myURL.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSetZuuf7lXIpPLtaV76oEj2sbjuDLF4K5CpFjHHnLFaODKrnQ/viewform")
          examButtons.clicked==41-> myURL.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSeo9EI3Q-Ce_UrxJiWcvAQapiItjKV0bb6EVd72GdP9YDpiiQ/viewform")
      }
    }
    override fun onBackPressed() {
        mInterstitialAd.adListener = object: AdListener() {
            override fun onAdClosed() {
                // Code to be executed when the interstitial ad is closed.
                mInterstitialAd.loadAd(AdRequest.Builder().build())

            }
        }
        if (mInterstitialAd.isLoaded) {
            mInterstitialAd.show()
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.")

        }
        super.onBackPressed()
    }
}