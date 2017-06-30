package com.menu.menuduzenleme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MenuDuzenleme extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_duzenleme);

		Button btn = (Button) findViewById(R.id.btnGeri);
		final EditText txt = (EditText) findViewById(R.id.txtAd);

		btn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				if (txt.getText().length() == 0) {
					Toast.makeText(getApplicationContext(), "Ad giriniz!", Toast.LENGTH_LONG).show();
					return;
				}

				Intent i = new Intent(getApplicationContext(), Sayfa2.class);
				i.putExtra("ad", txt.getText().toString());
				startActivity(i);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_duzenleme, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			Toast.makeText(getApplicationContext(), "Ayarlar", Toast.LENGTH_SHORT).show();
		} else if (id == R.id.menu2) {
			Toast.makeText(getApplicationContext(), "Menü 2", Toast.LENGTH_SHORT).show();
		}

		return super.onOptionsItemSelected(item);
	}
}
