package com.example.dailystories001;

import com.jjoe64.graphview.BarGraphView;
import com.jjoe64.graphview.GraphView.GraphViewData;
import com.jjoe64.graphview.GraphView.LegendAlign;
import com.jjoe64.graphview.GraphViewSeries;
import com.jjoe64.graphview.GraphViewSeries.GraphViewSeriesStyle;
import com.jjoe64.graphview.LineGraphView;
import com.jjoe64.graphview.ValueDependentColor;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class TesteEstatisticas extends Activity {

	private Context context;
	private DiarioController diarioController;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_teste_estatisticas);
		LinearLayout ll = (LinearLayout) findViewById(R.id.graph);

		context = this;
		diarioController = DiarioController.getInstance(context);
		
		
		int Apai = diarioController.findByApaixonado();
		int Radi = diarioController.findByRadiante();
		int Feli = diarioController.findByFeliz();
		int Puto = diarioController.findByRaiva();
		int Tris = diarioController.findByTriste();
		
		
		
		
		GraphViewData[] data =	new GraphViewData[]
				{
				new GraphViewData (1, Apai),
      			new GraphViewData (3, Radi),
				new GraphViewData (5, Feli),
				new GraphViewData (7, Puto),
				new GraphViewData (9, Tris)
				
		};
		
		
		

		GraphViewSeries Teste = new GraphViewSeries(data);
		
		
		
	LineGraphView graph = new LineGraphView(this,"Grafico do Humor");
	
	graph.addSeries(Teste);
	
	ll.addView(graph);
	
	//graph.getGraphViewStyle().setTitle();
	graph.getGraphViewStyle().setGridColor(Color.BLACK);
	graph.getGraphViewStyle().setHorizontalLabelsColor(Color.BLACK);
	graph.getGraphViewStyle().setVerticalLabelsColor(Color.BLACK);	
	graph.getGraphViewStyle().setTextSize(20);
	

	graph.setVerticalLabels(new String[] {"Alto ", "Médio ", "Baixo "});
	graph.setHorizontalLabels(new String[] {"Paixão ", " Alegre ", " Feliz ", " Bravo ", " Triste "});
		
//	graph.setShowLegend(true);
//	graph.setLegendAlign(LegendAlign.BOTTOM);
	
	//graph.setDrawBackground(true);
	//graph.getGraphViewStyle().set(Color.BLACK);
	
	
	


	
	}

	private GraphViewSeriesStyle GraphViewSeriesStyle(int red, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.teste_estatisticas, menu);
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
