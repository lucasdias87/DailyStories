package com.example.dailystories001;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

public class HumorDAO extends DataBase {

	private final String Table = "humor";
	
	
	
	public HumorDAO(Context context) {
		super(context);
	}

	public void insert(Humor humor) throws Exception
	{
		ContentValues values = new ContentValues();
		
		values.put("nm_humor", humor.getHumor());
		
		getDatabase().insert(Table, null, values);
		
		
		
		
		
	}
	
	public List<String> findAll() throws Exception
	{
		List<String> retorno = new ArrayList<String>();
		String sql = "SELECT * FROM " + Table;
		Cursor cursor = getDatabase().rawQuery(sql, null);
		cursor.moveToFirst();
		while (!cursor.isAfterLast()) {
		    retorno.add(cursor.getString(cursor.getColumnIndex("nm_humor")));
		    cursor.moveToNext();
		}
		cursor.close();
		return retorno;
	}

	
	
	
	
	
	
	
	
	
	
	public int findById ()
	{
		String sql = "SELECT count(*) FROM " + Table ;
		//String[] selectionArgs = new String[] {humor};
		Cursor cursor = getDatabase().rawQuery(sql,null);
		cursor.moveToFirst();
		Integer count = cursor.getInt(cursor.getColumnIndex("count(*)"));
		return count;
		//return montaHumor(cursor);
	}
	
	
	
	
	
	

	public Humor montaHumor(Cursor cursor) 
	{
		if (cursor.getCount() == 0) 
		{
		    return null;
		}
		Integer id = cursor.getInt(cursor.getColumnIndex("id"));
		String humor = cursor.getString(cursor.getColumnIndex("humor"));
		

		return new Humor(id, humor);
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
