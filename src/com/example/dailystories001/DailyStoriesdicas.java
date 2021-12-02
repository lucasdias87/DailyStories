package com.example.dailystories001;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class DailyStoriesdicas extends Activity {
	 Button Btnvoltar;
	 ImageButton btnmeditar,btnFruta,btnAtividades;
	 
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_daily_storiesdicas);
		Btnvoltar = (Button) findViewById(R.id.Btnvoltar);
		btnmeditar = (ImageButton) findViewById(R.id.Btnmeditar); 
		btnFruta = (ImageButton) findViewById(R.id.btnFruta); 
		btnAtividades = (ImageButton) findViewById(R.id.btnAtividades); 
		
		
		
		
		Btnvoltar.setOnClickListener(new OnClickListener() {
			
			
			
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent Daily = new Intent(getApplicationContext(),Daily.class);
					startActivity(Daily);
	}
		   });
		btnmeditar.setOnClickListener(new OnClickListener() {
		
			
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent Daily = new Intent(getApplicationContext(),DailyStories_Medita.class);
				startActivity(Daily);
			
		
	}
		 });
		   
		btnFruta.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent Daily = new Intent(getApplicationContext(),DailyAlimentacao.class);
				startActivity(Daily);
			}
		});
		
		btnAtividades.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent Daily = new Intent(getApplicationContext(),DailyDicasAtividades.class);
				startActivity(Daily);
			}
		});
		
		
		
		   
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.daily_storiesdicas, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
