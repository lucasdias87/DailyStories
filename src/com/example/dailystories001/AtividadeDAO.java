package com.example.dailystories001;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

public class AtividadeDAO extends DataBase {

	private final String Table = "atividade";
	
	
	
	public AtividadeDAO(Context context) {
		super(context);
	}

	public void insert(Atividade diario) throws Exception
	{
		ContentValues values = new ContentValues();
		values.put("nm_atividade", diario.getAtividade());
		
		getDatabase().insert(Table, null, values);
		
		
		
		
		
	}
	
	public List<String> findAll() throws Exception
	{
		List<String> retorno = new ArrayList<String>();
		String sql = "SELECT * FROM " + Table;
		Cursor cursor = getDatabase().rawQuery(sql, null);
		cursor.moveToFirst();
		while (!cursor.isAfterLast()) {
		    retorno.add(cursor.getString(cursor.getColumnIndex("nm_atividade")));
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
	public Atividade montaDiario(Cursor cursor) 
	{
		if (cursor.getCount() == 0) 
		{
		    return null;
		}
		Integer id = cursor.getInt(cursor.getColumnIndex("id"));
		String atividade = cursor.getString(cursor.getColumnIndex("atividade"));
		

		return new Atividade(id, atividade);
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
