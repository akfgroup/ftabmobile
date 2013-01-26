package com.dve.ftab;

import org.apache.cordova.CordovaChromeClient;
import org.apache.cordova.DroidGap;

import android.os.Bundle;
import android.webkit.WebView;

public class App extends DroidGap {
	 /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
    
    @Override
    public void init() {
    	super.init(new WebView(this), new GWTCordovaWebViewClient(this), new CordovaChromeClient(this));
    	
    }
    
}