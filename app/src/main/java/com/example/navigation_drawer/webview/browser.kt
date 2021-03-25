package com.example.navigation_drawer.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.example.navigation_drawer.R
import kotlinx.android.synthetic.main.activity_browser.*

class browser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_browser)
        val url=intent.getStringExtra("extra").toString()
        webview.webViewClient = WebViewClient()

        // this will load the url of the website
        webview.loadUrl(url)



    }
}