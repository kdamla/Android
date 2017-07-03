package com.gezegen.gezegenler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GezegenDetay extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gezegen_detay);

		TextView tvGezegenAdi = (TextView) findViewById(R.id.tvGezegenAdi);
		TextView tvGezegenDetay = (TextView) findViewById(R.id.tvDetay);
		Button btnGeri = (Button) findViewById(R.id.btnGeri);

		Intent i = getIntent();
		String gelenGezegenAdi = i.getStringExtra("gezegenAdi");
		String detay = "";

		if (gelenGezegenAdi.equals("Dünya")) {
			detay = "Dünyanýn dörtte üçü sularla kaplýdýr";
		} else if (gelenGezegenAdi.equals("Venüs")) {
			detay = "Seçilen gezegen Venüs";
		} else {
			detay = "Açýklama yok";
		}

		tvGezegenAdi.setText(gelenGezegenAdi);
		tvGezegenDetay.setText(detay);

		btnGeri.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent ii = new Intent(getApplicationContext(), Gezegenler.class);
				startActivity(ii);
			}
		});
	}
}
