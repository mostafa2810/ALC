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
import kotlinx.android.synthetic.main.activity_book_url.*


class bookUrl : AppCompatActivity() {
    private lateinit var mInterstitialAd: InterstitialAd
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_url)
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
when{
    levelBooks.clicked==1->  myURL.loadUrl("https://drive.google.com/file/d/11bncrAzVJ7denMGeVRXU91A_pSbFg1av/view")// 1 student
    levelBooks.clicked==2->  myURL.loadUrl("https://drive.google.com/file/d/1h8IM0lajV5kerJj_8giH1NDAfYNtyutp/view")// 2 student
    levelBooks.clicked==3->  myURL.loadUrl("https://drive.google.com/file/d/1rO_zTL1rd9ovmSsXAA_I0MZI2dgjiye7/view")// 3 student
    levelBooks.clicked==4->  myURL.loadUrl("https://drive.google.com/file/d/1rQA7ECaIT6_a5-U-F3weiXxZz7a98iEQ/view")// 4 student
    levelBooks.clicked==5->  myURL.loadUrl("https://drive.google.com/file/d/1YDiz0luHLsQsTj-ioQBl3xiNFBU1Sfds/view")// 5 student
    levelBooks.clicked==6->  myURL.loadUrl("https://drive.google.com/file/d/1Vu8fjdGK0_EjEVEOV0TSdaj5F3OiNjri/view")// 6 student
    levelBooks.clicked==7->  myURL.loadUrl("https://drive.google.com/file/d/12y8baPvMMivGclpPp2JsBqDMeSYaYbV4/view")// 7 student
    levelBooks.clicked==8->  myURL.loadUrl("https://drive.google.com/file/d/1VGmuykr8QCFlefI2X3nQ80qYVTV4RLdL/view")// 8 student

    levelBooks.clicked==9->  myURL.loadUrl("https://drive.google.com/file/d/19xOwX2aJT69Ip3tLLZYNwsi6xpzQXvHM/view")// 1 work
    levelBooks.clicked==10-> myURL.loadUrl("https://drive.google.com/file/d/1z9L_upuGVkv5XC1S3fEYodT2_0rCqw9p/view")// 2 work
    levelBooks.clicked==11-> myURL.loadUrl("https://drive.google.com/file/d/1h54zu2Z3nlY-mfd3RplmtE2UuyhoVPNd/view")// 3 work
    levelBooks.clicked==12-> myURL.loadUrl("https://drive.google.com/file/d/1U_4kU4F7P_7TbbJGyEreYKvQJlpqfgZ9/view")// 4 work
    levelBooks.clicked==13-> myURL.loadUrl("https://drive.google.com/file/d/1ezrAnoUwGS3bcFyQpSRTtP-q-zAkvHuD/view")// 5 work
    levelBooks.clicked==14-> myURL.loadUrl("https://drive.google.com/file/d/1JW6BuTe1ylK-3uoPHzLE1t-Tr1UCuPrF/view")// 6 work
    levelBooks.clicked==15-> myURL.loadUrl("https://drive.google.com/file/d/1mmFJzxpnyhLM5P1_2mBMrrFTPgxuJwaS/view")// 7 work
    levelBooks.clicked==16-> myURL.loadUrl("https://drive.google.com/file/d/1aQMdRxfFUEApf15j0kpPRlkmDvw99vbS/view")// 8 work
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