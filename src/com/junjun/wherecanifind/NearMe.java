package com.junjun.wherecanifind;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NearMe extends Activity {
	Button getLocationBank,getLocationAtm,getLocationRestaurant,getLocationHospital;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loadpage);
		/*
		 * For Bank
		 * */
		getLocationBank = (Button) findViewById(R.id.bank);
		
		getLocationBank.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				String buttonString = getLocationBank.getText().toString().toLowerCase();
				System.out.println("In NearME Activity"+buttonString);
				Intent intent = new Intent(v.getContext(),ListData.class);
				intent.putExtra("Value",buttonString);
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
				String buttonString = getLocationAtm.getText().toString().toLowerCase();
				System.out.println("In NearME Activity"+buttonString);
				Intent intent = new Intent(v.getContext(),ListData.class);
				intent.putExtra("Value",buttonString);
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
				String buttonString = getLocationRestaurant.getText().toString().toLowerCase();
				System.out.println("In NearME Activity"+buttonString);
				Intent intent = new Intent(v.getContext(),ListData.class);
				intent.putExtra("Value",buttonString);
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
				String buttonString = getLocationHospital.getText().toString().toLowerCase();
				System.out.println("In NearME Activity"+buttonString);
				Intent intent = new Intent(v.getContext(),ListData.class);
				intent.putExtra("Value",buttonString);
				startActivity(intent);
				
			}			
	});
}
}
