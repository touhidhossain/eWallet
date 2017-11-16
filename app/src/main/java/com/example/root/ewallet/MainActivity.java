package com.example.root.ewallet;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

    private WebView contentWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        contentWebView = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = contentWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        contentWebView.loadUrl("http://www.crazyhd.com/");
        contentWebView.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(contentWebView.canGoBack()){
            contentWebView.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}
