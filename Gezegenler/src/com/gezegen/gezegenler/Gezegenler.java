package com.gezegen.gezegenler;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Gezegenler extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gezegenler);

		// Listview oluþturma
		String[] gezegenler = getResources().getStringArray(R.array.gezegenler);
		this.setListAdapter(new ArrayAdapter<String>(this, R.layout.gezegenler, R.id.tvGezegen, gezegenler));

		// Liste elemanýna týklama
		ListView lv = getListView();
		lv.setId(android.R.id.list);
		lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				String gezegenAdi = ((TextView) view).getText().toString();
				Intent i = new Intent(getApplicationContext(), GezegenDetay.class);
				i.putExtra("gezegenAdi", gezegenAdi);
				startActivity(i);
			}
		});
	}

}
