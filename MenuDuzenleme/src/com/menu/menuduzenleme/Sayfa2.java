package com.menu.menuduzenleme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sayfa2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sayfa2);

		TextView lbl = (TextView) findViewById(R.id.lblAdi);
		Intent i = getIntent();
		String ad = i.getStringExtra("ad");
		lbl.setText(ad);

		Button btnGeri = (Button) findViewById(R.id.btnGeri);

		btnGeri.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), MenuDuzenleme.class);
				startActivity(i);
			}
		});
	}

}
