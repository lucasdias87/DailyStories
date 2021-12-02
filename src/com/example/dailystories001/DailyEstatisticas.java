package com.example.dailystories001;

import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

public class DailyEstatisticas extends Activity {

	Button btnmostrar,btnVolt;
	ListView lisMostrar;
	SQLiteDatabase db;
	ImageButton btnHumorEs, btnAtividadeEs;
	private Context context;
	private DiarioController diarioController;
	
	private List<String> diario;
	//private List<String> humor;
	
	
	private ArrayAdapter<String> adaptador;

	
	SimpleDateFormat formataData = new SimpleDateFormat("dd-mm-yyyy"); // formatar a data 
	Date data = new Date();
	String dataFormatada = formataData.format(data); // data formatada
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_daily_estatisticas);
		

		
		
		btnVolt = (Button) findViewById(R.id.btnVolt);
		btnHumorEs = (ImageButton) findViewById(R.id.btnHumorEs);
		btnAtividadeEs = (ImageButton) findViewById(R.id.btnAtividadeEs);
		
		
		lisMostrar = (ListView) findViewById(R.id.lisMostrar);
		
		
		
		context = this;
		diarioController = DiarioController.getInstance(context);
	
				
				
		    	try 
				{
				   
				    
				    	
				    	diario = diarioController.findAll();
				    	adaptador = new ArrayAdapter<String>(DailyEstatisticas.this, android.R.layout.simple_list_item_1, diario);
				    	lisMostrar.setAdapter(adaptador);
				    	   	
				    	
				   
				} 
				catch (Exception e) 
				{
					
				    e.printStackTrace();
				}				
				
				
				btnHumorEs.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						
						Intent Daily = new Intent(getApplicationContext(),TesteEstatisticas.class);
						startActivity(Daily);
						
					}
				});
				btnAtividadeEs.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						
						Intent Daily = new Intent(getApplicationContext(),DailyStoriesGraficoAtividade.class);
						startActivity(Daily);
						
					}
				});
				
			
			
		
		
		
		btnVolt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent Daily = new Intent(getApplicationContext(),Daily.class);
				startActivity(Daily);
				
				
			}
		});
		
		
		
				AlertDialog.Builder MsgDialogo = new AlertDialog.Builder(DailyEstatisticas.this);
				MsgDialogo.setTitle("DailyStories - Relatorio");
				
				// humor
				 int Apai = diarioController.findByApaixonado();
				 int Radi = diarioController.findByRadiante();
				 int Feli = diarioController.findByFeliz();
				 int Puto = diarioController.findByRaiva();
				 int Tris = diarioController.findByTriste();
				 
				// atividade
				 int Musi = diarioController.findByMusica();
				 int Malh = diarioController.findByMalhar();
				 int Dan = diarioController.findByDanca();
				 int Tv = diarioController.findByTv();
				 int Vide = diarioController.findByVideoGame();
				 int Ler = diarioController.findByLer();
				 
				 int Tudo = diarioController.findByTudo();
				 int TudoA = diarioController.findByTudoA();
				 
				 
				
//				 MsgDialogo.setMessage("testeee " + Tudo);
//					MsgDialogo.setNeutralButton("OK", null); // dica: nada
//					MsgDialogo.show();
				 
				try 
				{
					
			   if(Tudo >= 5 && TudoA >= 5){
				   
				   
//				// ---- Apaixonado ----
				   if(Apai > Radi && Apai > Feli && Apai > Puto && Apai > Tris){
						
						if(Musi > Malh && Musi > Dan && Musi > Tv && Musi > Vide && Musi > Ler){
							
							    MsgDialogo.setMessage("Ultimamente você tem estado mais Apaixonado e a atividade que mais tem feito é Ouvir Música");
								MsgDialogo.setNeutralButton("OK", null); // dica: nada
								MsgDialogo.show();
							
						}
						
						if(Malh > Musi && Malh > Dan && Malh > Tv && Malh > Vide && Malh > Ler){
							
						    MsgDialogo.setMessage("Ultimamente  você tem estado mais Apaixonado e a atividade que mais tem feito é Exercícios Físicos");
							MsgDialogo.setNeutralButton("OK", null); // dica: nada
							MsgDialogo.show();
						
						}
						
						if(Tv > Musi && Tv > Malh && Tv > Dan && Tv > Vide && Tv > Ler){
							
						    MsgDialogo.setMessage("Ultimamente você tem estado mais Apaixonado e a atividade que mais tem feito é Assistir Tv");
							MsgDialogo.setNeutralButton("OK", null); // dica: nada
							MsgDialogo.show();
						
						}
						if(Dan > Musi && Dan > Malh && Dan > Tv && Dan > Vide && Dan > Ler){
							
						    MsgDialogo.setMessage("Ultimamente você tem estado mais Apaixonado e  a atividade que mais tem feito é Dança");
							MsgDialogo.setNeutralButton("OK", null); // dica: nada
							MsgDialogo.show();
						
						}
						
						
						if(Vide > Musi && Vide > Malh && Vide > Dan && Vide > Tv && Vide > Ler){
							
						    MsgDialogo.setMessage("Ultimamente você tem estado mais Apaixonado e a atividade que mais tem feito é Jogar Video Game");
							MsgDialogo.setNeutralButton("OK", null); // dica: nada
							MsgDialogo.show();
						
						}
						
						if(Ler > Musi && Ler > Malh && Ler > Dan && Ler > Tv && Ler > Vide){
							
						    MsgDialogo.setMessage("Ultimamente você tem estado mais Apaixonado e a atividade que mais tem feito é Ler");
							MsgDialogo.setNeutralButton("OK", null); // dica: nada
							MsgDialogo.show();
						
						}
						
					}
						
//					// ---- Radiante ----
//					
					if(Radi > Apai && Radi > Feli && Radi > Puto && Radi > Tris){
						
						if(Musi > Malh && Musi > Dan && Musi > Tv && Musi > Vide && Musi > Ler){
							
						    MsgDialogo.setMessage("Ultimamente você tem estado mais Alegre e a atividade que mais tem feito é Ouvir Música");
							MsgDialogo.setNeutralButton("OK", null); // dica: nada
							MsgDialogo.show();
						
					}
					
					if(Malh > Musi && Malh > Dan && Malh > Tv && Malh > Vide && Malh > Ler){
						
					    MsgDialogo.setMessage("Ultimamente você tem estado mais Alegre e a atividade que mais tem feito é Exercícios Físicos");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					
					if(Tv > Musi && Tv > Malh && Tv > Dan && Tv > Vide && Tv > Ler){
						
					    MsgDialogo.setMessage("Ultimamente você tem estado mais Alegre e a atividade que mais tem feito é Assistir Tv");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					if(Dan > Musi && Dan > Malh && Dan > Tv && Dan > Vide && Dan > Ler){
						
					    MsgDialogo.setMessage("Ultimamente você tem estado mais Alegre e a atividade que mais tem feito é Dança");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					
					
					if(Vide > Musi && Vide > Malh && Vide > Dan && Vide > Tv && Vide > Ler){
						
					    MsgDialogo.setMessage("Ultimamente você tem estado mais Alegre e a atividade que mais tem feito é Jogar Video Game");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					
					if(Ler > Musi && Ler > Malh && Ler > Dan && Ler > Tv && Ler > Vide){
						
					    MsgDialogo.setMessage("Ultimamente você tem estado mais Alegre e a atividade que mais tem feito é Ler");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					}
//					
//					
//					// ---- Feliz ----
//					
					if(Feli > Apai && Feli > Radi && Feli > Puto && Feli > Tris){
						
						if(Musi > Malh && Musi > Dan && Musi > Tv && Musi > Vide && Musi > Ler){
							
						    MsgDialogo.setMessage("Ultimamente você tem estado mais Feliz e a atividade que mais tem feito é Ouvir Música");
							MsgDialogo.setNeutralButton("OK", null); // dica: nada
							MsgDialogo.show();
						
					}
					
					if(Malh > Musi && Malh > Dan && Malh > Tv && Malh > Vide && Malh > Ler){
						
					    MsgDialogo.setMessage("Ultimamente você tem estado mais Feliz e a atividade que mais tem feito é Exercícios Físicos");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					
					if(Tv > Musi && Tv > Malh && Tv > Dan && Tv > Vide && Tv > Ler){
						
					    MsgDialogo.setMessage("Ultimamente você tem estado mais Feliz e a atividade que mais tem feito é Assistir Tv");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					if(Dan > Musi && Dan > Malh && Dan > Tv && Dan > Vide && Dan > Ler){
						
					    MsgDialogo.setMessage("Ultimamente você tem estado mais Feliz e a atividade que mais tem feito é Dança");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					
					
					if(Vide > Musi && Vide > Malh && Vide > Dan && Vide > Tv && Vide > Ler){
						
					    MsgDialogo.setMessage("Ultimamente você tem estado mais Feliz e a atividade que mais tem feito é Jogar Video Game");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					
					if(Ler > Musi && Ler > Malh && Ler > Dan && Ler > Tv && Ler > Vide){
						
					    MsgDialogo.setMessage("Ultimamente você tem estado mais Feliz e a atividade que mais tem feito é Ler");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
						
					}
					
					
					// ---- Bravo ----
						
					if(Puto > Apai && Puto > Radi && Puto > Feli && Puto > Tris){
						
						if(Musi > Malh && Musi > Dan && Musi > Tv && Musi > Vide && Musi > Ler){
							
						    MsgDialogo.setMessage("Ultimamente você tem estado mais Bravo e a atividade que mais tem feito é Ouvir Música. Se quiser saber a como melhorar o seu humor vá na área de dicas na tela principal");
							MsgDialogo.setNeutralButton("OK", null); // dica: nada
							MsgDialogo.show();
						
					}
					
					if(Malh > Musi && Malh > Dan && Malh > Tv && Malh > Vide && Malh > Ler){
						
					    MsgDialogo.setMessage("Ultimamente você tem estado mais Bravo e a atividade que mais tem feito é Exercícios Físicos. Se quiser saber a como melhorar o seu humor vá na área de dicas na tela principal");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					
					if(Tv > Musi && Tv > Malh && Tv > Dan && Tv > Vide && Tv > Ler){
						
					    MsgDialogo.setMessage("Ultimamente você tem estado mais Bravo e a atividade que mais tem feito é Assistir Tv. Se quiser saber a como melhorar o seu humor vá na área de dicas na tela principal");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					if(Dan > Musi && Dan > Malh && Dan > Tv && Dan > Vide && Dan > Ler){
						
					    MsgDialogo.setMessage("Ultimamente você tem estado mais Bravo e a atividade que mais tem feito é Dança. Se quiser saber a como melhorar o seu humor vá na área de dicas na tela principal");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					
					
					if(Vide > Musi && Vide > Malh && Vide > Dan && Vide > Tv && Vide > Ler){
						
					    MsgDialogo.setMessage("Ultimamente você tem estado mais Feliz e a atividade que mais tem feito é Jogar Video Game. Se quiser saber a como melhorar o seu humor vá na área de dicas na tela principal");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					
					if(Ler > Musi && Ler > Malh && Ler > Dan && Ler > Tv && Ler > Vide){
						
					    MsgDialogo.setMessage("Ultimamente você tem estado mais Feliz e a atividade que mais tem feito é Ler. Se quiser saber a como melhorar o seu humor vá na área de dicas na tela principal");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
						
					}
						
					
					
					// ---- Triste ----
					
					if(Tris > Apai && Tris > Radi && Tris > Feli && Tris > Puto){
						
						if(Musi > Malh && Musi > Dan && Musi > Tv && Musi > Vide && Musi > Ler){
							
						    MsgDialogo.setMessage("Ultimamente você tem estado mais Triste e a atividade que mais tem feito é Ouvir Música. Se quiser saber a como melhorar o seu humor vá na área de dicas na tela principal");
							MsgDialogo.setNeutralButton("OK", null); // dica: nada
							MsgDialogo.show();
						
					}
					
					if(Malh > Musi && Malh > Dan && Malh > Tv && Malh > Vide && Malh > Ler){
						
					    MsgDialogo.setMessage("Ultimamente você tem estado mais Triste e a atividade que mais tem feito é Exercícios Físicos. Se quiser saber a como melhorar o seu humor vá na área de dicas na tela principal");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					
					if(Tv > Musi && Tv > Malh && Tv > Dan && Tv > Vide && Tv > Ler){
						
					    MsgDialogo.setMessage("Ultimamente você tem estado mais Triste e a atividade que mais tem feito é Assistir Tv. Se quiser saber a como melhorar o seu humor vá na área de dicas na tela principal");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					if(Dan > Musi && Dan > Malh && Dan > Tv && Dan > Vide && Dan > Ler){
						
					    MsgDialogo.setMessage("Ultimamente você tem estado mais Triste e a atividade que mais tem feito é Dança. Se quiser saber a como melhorar o seu humor vá na área de dicas na tela principal");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					
					
					if(Vide > Musi && Vide > Malh && Vide > Dan && Vide > Tv && Vide > Ler){
						
					    MsgDialogo.setMessage("Ultimamente você tem estado mais Triste e a atividade que mais tem feito é Jogar Video Game. Se quiser saber a como melhorar o seu humor vá na área de dicas na tela principal");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					
					if(Ler > Musi && Ler > Malh && Ler > Dan && Ler > Tv && Ler > Vide){
						
					    MsgDialogo.setMessage("Ultimamente você tem estado mais Triste e a atividade que mais tem feito é Ler. Se quiser saber a como melhorar o seu humor vá na área de dicas na tela principal");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					}
					
					
					
					// ----Maior ou menor que ----
					
					
					
					
					if(Apai == Radi && Apai > Tris && Apai > Puto && Apai > Feli){
						
					if(Musi > Malh && Musi > Dan && Musi > Tv && Musi > Vide && Musi > Ler){
							
						    MsgDialogo.setMessage("A sua Paixão está te deixando mais Alegre e a atividade que mais tem feito é Ouvir Música");
							MsgDialogo.setNeutralButton("OK", null); // dica: nada
							MsgDialogo.show();
						
					}
					
					if(Malh > Musi && Malh > Dan && Malh > Tv && Malh > Vide && Malh > Ler){
						
						MsgDialogo.setMessage("A sua Paixão está te deixando mais Alegre e a atividade que mais tem feito é fazer Exercícios Físicos");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					
					if(Tv > Musi && Tv > Malh && Tv > Dan && Tv > Vide && Tv > Ler){
						
						MsgDialogo.setMessage("A sua Paixão está te deixando mais Alegre e a atividade que mais tem feito é Assistir Tv");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					if(Dan > Musi && Dan > Malh && Dan > Tv && Dan > Vide && Dan > Ler){
						
						MsgDialogo.setMessage("A sua Paixão está te deixando mais Alegre e a atividade que mais tem feito é Dançar");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					
					
					if(Vide > Musi && Vide > Malh && Vide > Dan && Vide > Tv && Vide > Ler){
						
						MsgDialogo.setMessage("A sua Paixão está te deixando mais Alegre e a atividade que mais tem feito é Jogar Video Game");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					
					if(Ler > Musi && Ler > Malh && Ler > Dan && Ler > Tv && Ler > Vide){
						
						MsgDialogo.setMessage("A sua Paixão está te deixando mais Alegre e a atividade que mais tem feito é Ler");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
						


					}

					
					
					

					if(Tris == Puto && Tris > Radi && Puto > Apai && Tris > Feli){
						
						if(Musi > Malh && Musi > Dan && Musi > Tv && Musi > Vide && Musi > Ler){
							
						    MsgDialogo.setMessage("A sua Raiva está te deixando mais Triste e a atividade que mais tem feito é Ouvir Música. Se quiser saber a como melhorar o seu humor vá na área de dicas na tela principal");
							MsgDialogo.setNeutralButton("OK", null); // dica: nada
							MsgDialogo.show();
						
					}
					
					if(Malh > Musi && Malh > Dan && Malh > Tv && Malh > Vide && Malh > Ler){
						
						MsgDialogo.setMessage("A sua Raiva está te deixando mais Triste e a atividade que mais tem feito é fazer Exercícios Físicos. Se quiser saber a como melhorar o seu humor vá na área de dicas na tela principal");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					
					if(Tv > Musi && Tv > Malh && Tv > Dan && Tv > Vide && Tv > Ler){
						
						MsgDialogo.setMessage("A sua Raiva está te deixando mais Triste e a atividade que mais tem feito é Assistir Tv. Se quiser saber a como melhorar o seu humor vá na área de dicas na tela principal");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					if(Dan > Musi && Dan > Malh && Dan > Tv && Dan > Vide && Dan > Ler){
						
						MsgDialogo.setMessage("A sua Raiva está te deixando mais Triste e a atividade que mais tem feito é Dançar. Se quiser saber a como melhorar o seu humor vá na área de dicas na tela principal");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					
					
					if(Vide > Musi && Vide > Malh && Vide > Dan && Vide > Tv && Vide > Ler){
						
						MsgDialogo.setMessage("A sua Raiva está te deixando mais Triste e a atividade que mais tem feito é Jogar Video Game. Se quiser saber a como melhorar o seu humor vá na área de dicas na tela principal");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					
					if(Ler > Musi && Ler > Malh && Ler > Dan && Ler > Tv && Ler > Vide){
						
						MsgDialogo.setMessage("A sua Raiva está te deixando mais Triste e a atividade que mais tem feito é Ler. Se quiser saber a como melhorar o seu humor vá na área de dicas na tela principal");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
						

						
					
					
					
					}

					if(Radi == Tris || Radi == Puto && Radi > Apai && Tris > Feli){
						
					if(Musi > Malh && Musi > Dan && Musi > Tv && Musi > Vide && Musi > Ler){
							
						    MsgDialogo.setMessage("Seu Humor está tendo altos e baixos, e a atividade que mais tem feito é Ouvir Música.");
							MsgDialogo.setNeutralButton("OK", null); // dica: nada
							MsgDialogo.show();
						
					}
					
					if(Malh > Musi && Malh > Dan && Malh > Tv && Malh > Vide && Malh > Ler){
						
					    MsgDialogo.setMessage("Seu Humor está tendo altos e baixos, e a atividade que mais tem feito é fazer Exercícios Fícicos.");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					
					if(Tv > Musi && Tv > Malh && Tv > Dan && Tv > Vide && Tv > Ler){
						
					    MsgDialogo.setMessage("Seu Humor está tendo altos e baixos, e a atividade que mais tem feito é Assistir Tv.");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					if(Dan > Musi && Dan > Malh && Dan > Tv && Dan > Vide && Dan > Ler){
						
					    MsgDialogo.setMessage("Seu Humor está tendo altos e baixos, e a atividade que mais tem feito é Dança.");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					
					
					if(Vide > Musi && Vide > Malh && Vide > Dan && Vide > Tv && Vide > Ler){
						
					    MsgDialogo.setMessage("Seu Humor está tendo altos e baixos, e a atividade que mais tem feito é Jogar Video Game.");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
					
					if(Ler > Musi && Ler > Malh && Ler > Dan && Ler > Tv && Ler > Vide){
						
					    MsgDialogo.setMessage("Seu Humor está tendo altos e baixos, e a atividade que mais tem feito é Ler.");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
					
					}
						
					
					

						
					}

					
					}


	}
	
	
					
				
				
				catch (Exception e) 
				{
					    MsgDialogo.setMessage("Erro");
						MsgDialogo.setNeutralButton("OK", null); // dica: nada
						MsgDialogo.show();
				    e.printStackTrace();
				}	
			}
			
			
			
		
		
		

		
		
		
		
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.daily_estatisticas, menu);
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
