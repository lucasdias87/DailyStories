package com.example.dailystories001;



import java.text.SimpleDateFormat;
import java.util.Date;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class Daily extends Activity {

	ImageButton btnDaily1,btnSociedade,btnEstatisticas,btnAjuda,btnDicas;
	
	SimpleDateFormat formataData = new SimpleDateFormat("HH:mm"); // formatar a data 
	Date data = new Date();
	String dataFormatada = formataData.format(data); // data formatada
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_daily);
		btnDaily1 = (ImageButton) findViewById(R.id.btnDaily1);
		
		btnAjuda  = (ImageButton) findViewById(R.id.btnAjuda);
		btnDicas  = (ImageButton) findViewById(R.id.btnDicas);
		btnSociedade  = (ImageButton) findViewById(R.id.btnbola);
		btnEstatisticas  = (ImageButton) findViewById(R.id.btnMalhar);
		AlertDialog.Builder MsgDialogo = new AlertDialog.Builder(Daily.this);
		MsgDialogo.setTitle("");
		
		
		
		
		if(dataFormatada == "09:28") {
			MsgDialogo.setMessage("Seja Bem-Vindo");
			MsgDialogo.setNeutralButton("OK", null); // 
			MsgDialogo.show();
		}
		
		
		
		
		
		
		
		
		btnDaily1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent Daily = new Intent(getApplicationContext(),DailyHome.class);
				startActivity(Daily);
				
			}
		});btnAjuda.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                Intent IMC = new Intent(getApplicationContext(),Ajuda_dailyStories.class);
                startActivity(IMC);
		
		
		
	}
		});btnDicas.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                Intent IMC = new Intent(getApplicationContext(),DailyStoriesdicas.class);
                startActivity(IMC);
		
		
		
	}
		});
		
		btnSociedade.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent IMC = new Intent(getApplicationContext(),DailyQuemSomos.class);
                startActivity(IMC);
				
				
			}
		});
		
		btnEstatisticas.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent IMC = new Intent(getApplicationContext(),DailyEstatisticas.class);
                startActivity(IMC);
				
			}
		});
		
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.daily, menu);
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
