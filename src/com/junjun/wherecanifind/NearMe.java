package com.junjun.wherecanifind;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NearMe extends Activity {
	Button getLocation;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loadpage);
		getLocation = (Button) findViewById(R.id.button1);
		getLocation.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(),ListData.class);
				startActivityForResult(intent,0);
				
			}			
	});
}
}
