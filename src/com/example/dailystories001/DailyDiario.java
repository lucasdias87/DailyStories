package com.example.dailystories001;


import java.text.SimpleDateFormat;
import java.util.Date;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;



public class DailyDiario extends Activity {
	ImageButton btnSalvar;
    EditText txtDiario;
   // SQLiteDatabase db;
    private Context context;
	private DiarioController diarioController;
//    private HumorController humorController;
	SimpleDateFormat formataData = new SimpleDateFormat("dd-MM-yyyy  HH:mm"); // formatar a data 
	Date data = new Date();
	String dataFormatada = formataData.format(data); // data formatada
   
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_daily_diario);
		
		
	
		
		
		
		
		btnSalvar = (ImageButton) findViewById(R.id.btnSalvar);
		txtDiario = (EditText) findViewById(R.id.txtDiario);
		
		context = this;
		diarioController = DiarioController.getInstance(context);
//		humorController = HumorController.getInstance(context);
		 
		
//		db = openOrCreateDatabase("DiarioDB", Context.MODE_PRIVATE, null);
//		db.execSQL("CREATE TABLE IF NOT EXISTS tb_diario (id INTEGER PRIMARY KEY AUTOINCREMENT, diario VARCHAR(100));");
//		
		
		btnSalvar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String diario = txtDiario.getText().toString();
				
				
				try {
					Diario d = new Diario(null, diario, dataFormatada);
					diarioController.insert(d);
					
//					Humor d = new Humor(null, diario);
//					humorController.insert(d);
					
					
					Intent Daily = new Intent(getApplicationContext(),Daily.class);
					startActivity(Daily);
					
					
					
					
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
				
				
				
//				
				
				
				
			}

//			
			

			
			

			
		});
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.daily_diario, menu);
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
