package com.example.dailystories001;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Daily_atividades extends Activity {
	
	ImageButton btnbola, btnMalhar, btnDanca, btnMalha, btnControle, btnLivro;
	private Context context;
	private AtividadeController atividadeController;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_daily_atividades);
		
		btnbola = (ImageButton) findViewById(R.id.btnbola);
		btnMalhar = (ImageButton) findViewById(R.id.btnMalhar);
		btnDanca = (ImageButton) findViewById(R.id.btnDanca);
		btnMalha = (ImageButton) findViewById(R.id.btnMalha);
		btnControle = (ImageButton) findViewById(R.id.btnControle);
		btnLivro = (ImageButton) findViewById(R.id.btnLivro);
		
		context = this;
		atividadeController = AtividadeController.getInstance(context);
		
		btnbola.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				try {
					Atividade h = new Atividade(null, "Musica");
					atividadeController.insert(h);
					
					Intent Daily = new Intent(getApplicationContext(),DailyDiario.class);
					startActivity(Daily);
					
					
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
		});
		
	btnMalhar.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		
		
		try {
			Atividade h = new Atividade(null, "Malhar");
			atividadeController.insert(h);
			
//			MsgDialogo.setMessage(Atividade.getAtividade());
//			MsgDialogo.setNeutralButton("OK", null); // dica: nada
//			MsgDialogo.show();
			Intent Daily = new Intent(getApplicationContext(),DailyDiario.class);
			startActivity(Daily);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
	}
});
	btnDanca.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		try {
			Atividade h = new Atividade(null, "Dançar");
			atividadeController.insert(h);
			
			Intent Daily = new Intent(getApplicationContext(),DailyDiario.class);
			startActivity(Daily);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
});
	btnMalha.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		try {
			Atividade h = new Atividade(null, "Tv");
			atividadeController.insert(h);
			
			Intent Daily = new Intent(getApplicationContext(),DailyDiario.class);
			startActivity(Daily);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
});
	btnControle.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		try {
			Atividade h = new Atividade(null, "Videogame");
			atividadeController.insert(h);
			
			Intent Daily = new Intent(getApplicationContext(),DailyDiario.class);
			startActivity(Daily);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
});
	btnLivro.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		try {
			Atividade h = new Atividade(null, "Ler");
			atividadeController.insert(h);
			
			Intent Daily = new Intent(getApplicationContext(),DailyDiario.class);
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
		getMenuInflater().inflate(R.menu.daily_atividades, menu);
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
