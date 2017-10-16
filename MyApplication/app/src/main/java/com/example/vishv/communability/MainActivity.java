//Created by: Vishvajit Kher
//GitHub: https://www.github.com/vishvajit79
//Email: vishvajit79@gmail.com
package com.example.vishv.communability;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    //////////////////////////////////////////////////////////////////////////////////////////////////
    ////////                                                                                  ////////
    ////////                       Welcome to Communability                                   ////////
    ////////                                                                                  ////////
    //////////////////////////////////////////////////////////////////////////////////////////////////
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView) findViewById(R.id.myWebView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("http://communability.ca");//Website link goes here
        webView.setWebViewClient(new WebViewClient());//Opens new link or page in current application rather than going to third-party application
    }

    @Override
    public void onBackPressed() {
        //Checks whether it can go back
        if(webView.canGoBack()){
            //If yes, it will go back to previous visited webpage
            webView.goBack();
        }
        //If not, it will exit the app
        else {
            super.onBackPressed();
        }

    }
}
