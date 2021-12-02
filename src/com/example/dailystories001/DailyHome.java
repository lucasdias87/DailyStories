package com.example.dailystories001;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class DailyHome extends Activity {
	ImageButton	Btnapaixo,Btnfeliz,Btnbravo,Btntriste,Btnradiante;
	
	private Context context;
	private HumorController humorController;
	String Apaixonado;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_daily_home);
		
		Btnfeliz = (ImageButton) findViewById(R.id.Btnfeliz);
		Btnapaixo = (ImageButton) findViewById(R.id.Btnapaixo);
		Btnbravo = (ImageButton) findViewById(R.id.Btnbravo);
		Btntriste = (ImageButton) findViewById(R.id.Btntriste);
		Btnradiante = (ImageButton) findViewById(R.id.Btnradiante);
		
		context = this;
		humorController = HumorController.getInstance(context);
		
		Btnapaixo.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				
				
				
				try {
					
					
					
					Humor h = new Humor(null, "Apaixonado");
					humorController.insert(h);
					
					
					
					
					
					Intent Daily = new Intent(getApplicationContext(),Daily_atividades.class);
					startActivity(Daily);
					
					
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
				
				
				
				
				
			
				
			}
			
		});
		
		Btnfeliz.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
            	
				
				
				try {
					Humor h = new Humor(null, "Feliz");
					humorController.insert(h);
					
					Intent Daily = new Intent(getApplicationContext(),Daily_atividades.class);
					startActivity(Daily);
					
					
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
				
				
				


            }
        });
		
		Btnradiante.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

            	
				
				
				try {
					Humor h = new Humor(null, "Radiante");
					humorController.insert(h);
					
					Intent Daily = new Intent(getApplicationContext(),Daily_atividades.class);
					startActivity(Daily);
					
					
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
				
				
				
            }
		});
		
		Btnbravo.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

            	
				
				
				try {
					Humor h = new Humor(null, "Raiva");
					humorController.insert(h);
					
					Intent Daily = new Intent(getApplicationContext(),Daily_atividades.class);
					startActivity(Daily);
					
					
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
            }
		});
		
		Btntriste.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

            	
				
				
				try {
					Humor h = new Humor(null, "Triste");
					humorController.insert(h);
					
					Intent Daily = new Intent(getApplicationContext(),Daily_atividades.class);
					startActivity(Daily);
					
					
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
            }
		});
		
	} 
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.daily_home, menu);
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
