package com.example.dailystories001;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

public class TudoDAO extends DataBase {

	private final String Table = "diario";
	private final String Table2 = "humor";
	private final String Table3 = "atividade";
	
	
	
	SimpleDateFormat formataData = new SimpleDateFormat("dd-MM-yyyy"); // formatar a data 
	Date data = new Date();
	String dataFormatada = formataData.format(data); // data formatada
	
	public TudoDAO(Context context) {
		super(context);
	}

	
	
	public List<String> findAll() throws Exception
	{
		List<String> retorno = new ArrayList<String>();
		String sql = "SELECT * FROM " + Table ;
		Cursor cursor = getDatabase().rawQuery(sql, null);
		cursor.moveToFirst();
		while (!cursor.isAfterLast()) {
		    retorno.add(cursor.getString(cursor.getColumnIndex("data")) + " - " + cursor.getString(cursor.getColumnIndex("ds_diario")));                                             
		    cursor.moveToNext();
		}
		cursor.close();
		return retorno;
	}

	
	
	
//	public Diario findById(int id)
//	{
//		String sql = "SELECT * FROM " + Table + " WHERE id= ?";
//		String[] selectionArgs = new String[] { "" + id};
//		Cursor cursor = getDatabase().rawQuery(sql, selectionArgs);
//		cursor.moveToFirst();
//		
//		return montaDiario(cursor);
//	}
//	
	
//	
	public Diario montaDiario(Cursor cursor) 
	{
		if (cursor.getCount() == 0) 
		{
		    return null;
		}
		Integer id = cursor.getInt(cursor.getColumnIndex("id"));
		String diario = cursor.getString(cursor.getColumnIndex("diario"));
		String data = cursor.getString(cursor.getColumnIndex("data"));

		return new Diario(id, diario, data);
	 }
//	
//	public Diario findByLogin(String diario)
//	{
//		String sql = "SELECT ds_diario FROM " + Table + " WHERE diario = ? ";
//		String[] selectionArgs = new String[] { diario };
//		Cursor cursor = getDatabase().rawQuery(sql, selectionArgs);
//		cursor.moveToFirst();
//		
//		return montaDiario(cursor);
//	 }
}
