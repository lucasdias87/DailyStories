package com.example.dailystories001;

import java.util.Date;

public class Diario {

	private Integer id;
	private String diario;
	private String data;
	
	
	public Diario(Integer id, String diario, String data)
	{
		this.id = id;
		this.diario = diario;
		this.data = data;
	}
	
	public Integer getId()
	{
		return this.id;
	}
	
	public void setID(Integer id)
	{
		this.id = id;
	}
	
	public String getDiario()
	{
		return this.diario;
	}
	
	public void setDiario(String diario)
	{
		this.diario = diario;
	}
	public String getData()
	{
		return this.data;
	}
	
	public void setData(String data)
	{
		this.data = data;
	}
	
	
}
