package com.example.dailystories001;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;


public class DailyStories_Medita extends Activity {
	ImageButton btnPlay, btnStop;
	MediaPlayer mp;
	Button btnVoltar;

	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		mp = MediaPlayer.create(DailyStories_Medita.this, R.raw.relax);
		setContentView(R.layout.activity_daily_stories__medita);
		
		
			
		mp.start();
			
			             
			
			
			btnVoltar = (Button) findViewById(R.id.btnVoltar);
			
			
			
			btnVoltar.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					
					mp.stop();
					
					Intent Daily = new Intent(getApplicationContext(),DailyStoriesdicas.class);
					startActivity(Daily);
					
				}
			});
			
			
			
			
			
			}
	
	               
	
		
		
		 
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.daily_stories__medita, menu);
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
