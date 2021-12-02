package com.example.dailystories001;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

public class DiarioDAO extends DataBase {

	private final String Table = "diario";
	private final String Table2 = "humor";
	private final String Table3 = "atividade";
	
	
	
	
	
	
	
	
	public DiarioDAO(Context context) {
		super(context);
	}

	public void insert(Diario diario) throws Exception
	{
		ContentValues values = new ContentValues();
		values.put("data", diario.getData());
		values.put("ds_diario", diario.getDiario());
		
		getDatabase().insert(Table, null, values);
		
		
		
		
		
	}
	
	public List<String> findAll() throws Exception
	{
		List<String> retorno = new ArrayList<String>();
		String sql = "SELECT * FROM " + Table ;
		Cursor cursor = getDatabase().rawQuery(sql, null);
		cursor.moveToFirst();
		while (!cursor.isAfterLast()) {
		    retorno.add(cursor.getString(cursor.getColumnIndex("data"))+ " - " + cursor.getString(cursor.getColumnIndex("ds_diario")));          //  + " - " + cursor.getString(cursor.getColumnIndex("nm_humor"))+ " - " + cursor.getString(cursor.getColumnIndex("nm_atividade"))       + ", "+Table2+ ", "+Table3+" WHERE diario.cd_atividade = atividade._id"                           
		    cursor.moveToNext();
		}
		cursor.close();
		return retorno;
	}

	
	// find humor
	
	public int findByApaixonado ()
	{
		String sql = "SELECT count(*) FROM " + Table2 + " WHERE nm_humor = 'Apaixonado'";
		Cursor cursor = getDatabase().rawQuery(sql,null);
		cursor.moveToFirst();
		Integer count = cursor.getInt(cursor.getColumnIndex("count(*)"));
		return count;
		
	}
	
	public int findByRadiante ()
	{
		String sql = "SELECT count(*) FROM " + Table2 + " WHERE nm_humor = 'Radiante'";
		Cursor cursor = getDatabase().rawQuery(sql,null);
		cursor.moveToFirst();
		Integer count = cursor.getInt(cursor.getColumnIndex("count(*)"));
		return count;
		
	}
	public int findByFeliz ()
	{
		String sql = "SELECT count(*) FROM " + Table2 + " WHERE nm_humor = 'Feliz'";
		Cursor cursor = getDatabase().rawQuery(sql,null);
		cursor.moveToFirst();
		Integer count = cursor.getInt(cursor.getColumnIndex("count(*)"));
		return count;
		
	}
	public int findByRaiva ()
	{
		String sql = "SELECT count(*) FROM " + Table2 + " WHERE nm_humor = 'Raiva'";
		Cursor cursor = getDatabase().rawQuery(sql,null);
		cursor.moveToFirst();
		Integer count = cursor.getInt(cursor.getColumnIndex("count(*)"));
		return count;
		
	}
	public int findByTriste ()
	{
		String sql = "SELECT count(*) FROM " + Table2 + " WHERE nm_humor = 'Triste'";
		Cursor cursor = getDatabase().rawQuery(sql,null);
		cursor.moveToFirst();
		Integer count = cursor.getInt(cursor.getColumnIndex("count(*)"));
		return count;
		
	}
	
	// find atividade
	
	public int findByMusica ()
	{
		String sql = "SELECT count(*) FROM " + Table3 + " WHERE nm_atividade = 'Musica'";
		Cursor cursor = getDatabase().rawQuery(sql,null);
		cursor.moveToFirst();
		Integer count = cursor.getInt(cursor.getColumnIndex("count(*)"));
		return count;
		
	}
	
	public int findByMalhar ()
	{
		String sql = "SELECT count(*) FROM " + Table3 + " WHERE nm_atividade = 'Malhar'";
		Cursor cursor = getDatabase().rawQuery(sql,null);
		cursor.moveToFirst();
		Integer count = cursor.getInt(cursor.getColumnIndex("count(*)"));
		return count;
		
	}
	public int findByDanca ()
	{
		String sql = "SELECT count(*) FROM " + Table3 + " WHERE nm_atividade = 'Dançar'";
		Cursor cursor = getDatabase().rawQuery(sql,null);
		cursor.moveToFirst();
		Integer count = cursor.getInt(cursor.getColumnIndex("count(*)"));
		return count;
		
	}
	public int findByTv ()
	{
		String sql = "SELECT count(*) FROM " + Table3 + " WHERE nm_atividade = 'Tv'";
		Cursor cursor = getDatabase().rawQuery(sql,null);
		cursor.moveToFirst();
		Integer count = cursor.getInt(cursor.getColumnIndex("count(*)"));
		return count;
		
	}
	public int findByVideoGame ()
	{
		String sql = "SELECT count(*) FROM " + Table3 + " WHERE nm_atividade = 'Videogame'";
		Cursor cursor = getDatabase().rawQuery(sql,null);
		cursor.moveToFirst();
		Integer count = cursor.getInt(cursor.getColumnIndex("count(*)"));
		return count;
		
	}
	public int findByLer ()
	{
		String sql = "SELECT count(*) FROM " + Table3 + " WHERE nm_atividade = 'Ler'";
		Cursor cursor = getDatabase().rawQuery(sql,null);
		cursor.moveToFirst();
		Integer count = cursor.getInt(cursor.getColumnIndex("count(*)"));
		return count;
		
	}
	
	
	// tudo

	public int findByTudo ()
	{
		String sql = "SELECT count(*) FROM " + Table2;
		Cursor cursor = getDatabase().rawQuery(sql,null);
		cursor.moveToFirst();
		Integer count = cursor.getInt(cursor.getColumnIndex("count(*)"));
		return count;
		
	}
	
	public int findByTudoA ()
	{
		String sql = "SELECT count(*) FROM " + Table3;
		Cursor cursor = getDatabase().rawQuery(sql,null);
		cursor.moveToFirst();
		Integer count = cursor.getInt(cursor.getColumnIndex("count(*)"));
		return count;
		
	}
	
}
