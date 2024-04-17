package com.example.qqq;

import com.google.ads.AdSize;
import com.google.ads.AdView;
import com.google.ads.AdRequest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;


public class MainActivity extends Activity {
	private AdSize adSize;
	private AdView adView;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		

		LinearLayout layout = new LinearLayout(this);
		setContentView(layout);
		
		AdView adView = new AdView(this, AdSize.SMART_BANNER, "");
        layout.addView(adView);

        AdRequest adRequest = new AdRequest();
        adView.loadAd(adRequest);
	}
}
