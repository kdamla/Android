package com.wvu.webviewuygulama;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Html extends Activity {

	@Override 
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.html);

		WebView html = (WebView) findViewById(R.id.wv2);
		String htmlSayfa = "<html><body><h1>Html Sayfasý</h1><h2>Sayfa detayý</h2></body></html>";
		html.loadData(htmlSayfa, "text/html; charset-UTF-8", null);
	}
}
