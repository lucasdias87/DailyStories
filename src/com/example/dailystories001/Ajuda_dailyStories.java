package com.example.dailystories001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Ajuda_dailyStories extends Activity {
 Button btnvoltar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ajuda_daily_stories);
		btnvoltar = (Button) findViewById(R.id.btnvoltar);
		
		btnvoltar.setOnClickListener(new OnClickListener() {

			
			
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent Daily = new Intent(getApplicationContext(),Daily.class);
					startActivity(Daily);
	}
		   });
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ajuda_daily_stories, menu);
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
