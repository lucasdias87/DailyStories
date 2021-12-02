package com.example.dailystories001;

import com.jjoe64.graphview.GraphViewSeries;
import com.jjoe64.graphview.LineGraphView;
import com.jjoe64.graphview.GraphView.GraphViewData;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class DailyStoriesGraficoAtividade extends Activity {

	private Context context;
	private DiarioController diarioController;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_daily_stories_grafico_atividade);
		
		LinearLayout ll = (LinearLayout) findViewById(R.id.graph);

		context = this;
		diarioController = DiarioController.getInstance(context);
		
		int Musi = diarioController.findByMusica();
		 int Malh = diarioController.findByMalhar();
		 int Dan = diarioController.findByDanca();
		 int Tv = diarioController.findByTv();
		 int Vide = diarioController.findByVideoGame();
		 int Ler = diarioController.findByLer();
		

		GraphViewData[] data =	new GraphViewData[]
				{
				new GraphViewData (1, Musi),
      			new GraphViewData (3, Malh),
				new GraphViewData (5, Dan),
				new GraphViewData (7, Tv),
				new GraphViewData (9, Vide),
				new GraphViewData (11, Ler)
		};
		
		
		

		GraphViewSeries Teste = new GraphViewSeries(data);
		
		
		
	LineGraphView graph = new LineGraphView(this,"Grafico do Atividade ");
	
	graph.addSeries(Teste);
	
	ll.addView(graph);
	
	//graph.getGraphViewStyle().setTitle();
	graph.getGraphViewStyle().setGridColor(Color.BLACK);
	graph.getGraphViewStyle().setHorizontalLabelsColor(Color.BLACK);
	graph.getGraphViewStyle().setVerticalLabelsColor(Color.BLACK);	
	graph.getGraphViewStyle().setTextSize(20);
	

	graph.setVerticalLabels(new String[] {"Alto ", "Médio ", "Baixo "});
	graph.setHorizontalLabels(new String[] {"Música ", " Treino ", " Dança ", " Tv ", " Game "," Ler "});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.daily_stories_grafico_atividade, menu);
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
