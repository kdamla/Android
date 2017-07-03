package com.wvu.webviewuygulama;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Url extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.url);

		WebView url = (WebView) findViewById(R.id.wV1);
		url.getSettings().setJavaScriptEnabled(true);
		//Týklanan sayfayý web browserdan açmasý yerine uygulama içinden açmasý için
		url.setWebViewClient(new WebViewClient());
		url.loadUrl("http://www.selcuk.edu.tr");
	}

}
