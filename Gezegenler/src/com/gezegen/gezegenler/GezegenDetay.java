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

		if (gelenGezegenAdi.equals("D�nya")) {
			detay = "D�nyan�n d�rtte ��� sularla kapl�d�r";
		} else if (gelenGezegenAdi.equals("Ven�s")) {
			detay = "Se�ilen gezegen Ven�s";
		} else {
			detay = "A��klama yok";
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
