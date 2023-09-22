package com.example.mad_practical_7_22172012007

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class YoutubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
        val youtubeId = "fjn9B64Znrk"
        val webView = findViewById<WebView>(R.id.webView)

    }
}