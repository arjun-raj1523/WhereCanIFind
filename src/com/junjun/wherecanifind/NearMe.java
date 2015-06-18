package com.junjun.wherecanifind;

import android.app.Activity;
import android.content.Intent;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class NearMe extends Activity implements LocationListener {
	Button getLocationBank,getLocationAtm,getLocationRestaurant,getLocationHospital,getLocationCStore,getLocationLaundry;
	LocationManager locationManager;
	Geocoder geocoder;
	TextView textOutLat,textOutLong;
	String provider = locationManager.GPS_PROVIDER;
	Intent intent;
	Location location;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loadpage);
		textOutLat = (TextView) findViewById(R.id.textView1);
		textOutLong = (TextView) findViewById(R.id.textView2);
		locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
		geocoder = new Geocoder(this);
		
		Location lastLocation = locationManager.getLastKnownLocation(provider);
		if(lastLocation != null)
			onLocationChanged(lastLocation);

		
		
		/*
		 * For Bank
		 * */
		getLocationBank = (Button) findViewById(R.id.bank);
		
		getLocationBank.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				intent = new Intent(v.getContext(),ListData.class);
				intent.putExtra("Value","bank");
				intent.putExtra("Lat",textOutLat.getText().toString());
				intent.putExtra("Long",textOutLong.getText().toString());
				startActivity(intent);
				
			}			
	});
		/*
		 * For ATM
		 * */
		getLocationAtm = (Button) findViewById(R.id.atm);
		
		getLocationAtm.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				intent = new Intent(v.getContext(),ListData.class);
				intent.putExtra("Value","atm");
				intent.putExtra("Lat",textOutLat.getText().toString());
				intent.putExtra("Long",textOutLong.getText().toString());
				startActivity(intent);
				
			}			
	});
		/*
		 * For Restaurant
		 * */
		getLocationRestaurant = (Button) findViewById(R.id.restaurant);
		
		getLocationRestaurant.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				intent = new Intent(v.getContext(),ListData.class);
				intent.putExtra("Value","restaurant");
				intent.putExtra("Lat",textOutLat.getText().toString());
				intent.putExtra("Long",textOutLong.getText().toString());
				startActivity(intent);
				
			}			
	});
		/*
		 * For Hospital
		 * */
		getLocationHospital = (Button) findViewById(R.id.hospital);
		
		getLocationHospital.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				intent = new Intent(v.getContext(),ListData.class);
				intent.putExtra("Value","hospital");
				intent.putExtra("Lat",textOutLat.getText().toString());
				intent.putExtra("Long",textOutLong.getText().toString());
				startActivity(intent);
				
			}			
	});
		/*
		 * For Departmental Store
		 * */
		getLocationCStore = (Button) findViewById(R.id.convenience_store);
		
		getLocationCStore.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				intent = new Intent(v.getContext(),ListData.class);
				intent.putExtra("Value","convenience_store");
				intent.putExtra("Lat",textOutLat.getText().toString());
				intent.putExtra("Long",textOutLong.getText().toString());
				startActivity(intent);
				
			}			
	});
		/*
		 * For Laundry
		 * */
		getLocationLaundry = (Button) findViewById(R.id.laundry);
		
		getLocationLaundry.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {;
				intent = new Intent(v.getContext(),ListData.class);
				intent.putExtra("Value","laundry");
				intent.putExtra("Lat",textOutLat.getText().toString());
				intent.putExtra("Long",textOutLong.getText().toString());
				startActivity(intent);
				
			}			
	});
}

	@Override
	protected void onResume() {
		super.onResume();
		locationManager.requestLocationUpdates(provider,6000, 1000,this);
	}
	@Override
	protected void onPause() {
		super.onPause();
		
	}

	@Override
	public void onLocationChanged(Location location) {
		// TODO Auto-generated method stub
		String textLat = String.format("%f",
				location.getLatitude());
		textOutLat.setText(textLat);
		String textLong = String.format("%f",
				location.getLongitude());
		textOutLong.setText(textLong);
		
	}

	@Override
	public void onProviderDisabled(String provider) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onProviderEnabled(String provider) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {
		// TODO Auto-generated method stub
		
	}


}
