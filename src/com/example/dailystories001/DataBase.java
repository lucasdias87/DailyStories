package com.example.dailystories001;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBase extends SQLiteOpenHelper{
	private static final int Versao = 5;
	private static final String NomeBD = "diario2.db";
	private static final String CREATE = "CREATE TABLE diario (id INTEGER PRIMARY KEY AUTOINCREMENT, data date NOT NULL, ds_diario VARCHAR(100) NOT NULL);";
	
	
	private static final String CREATE2 ="CREATE TABLE humor (id INTEGER PRIMARY KEY AUTOINCREMENT, nm_humor VARCHAR(50) NOT NULL);";
	private static final String CREATE3 ="CREATE TABLE atividade (id INTEGER PRIMARY KEY AUTOINCREMENT, nm_atividade VARCHAR(50) NOT NULL);";
	
	
	protected SQLiteDatabase database;
	
	public DataBase(Context context)
	{
		super(context, NomeBD, null, Versao);
	}
	
	@Override
	public void onCreate(SQLiteDatabase db)
	{
		db.execSQL(CREATE3);
		db.execSQL(CREATE);
		db.execSQL(CREATE2);
		
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
	{
//		db.execSQL(CREATE3);
//		db.execSQL(CREATE);
//		db.execSQL(CREATE2);
	}
	
	public SQLiteDatabase getDatabase()
	{
		if (database == null)
		{
			database = getWritableDatabase();
		}
		return database;
	}
}
