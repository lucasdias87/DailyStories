package com.example.dailystories001;

import java.util.Date;

public class Humor {

	private Integer id;
	private String humor;
	
	
	
	
	public Humor(Integer id, String humor)
	{
		this.id = id;
		this.humor = humor;
		
	}
	
	public Integer getId()
	{
		return this.id;
	}
	
	public void setID(Integer id)
	{
		this.id = id;
	}
	
	public String getHumor()
	{
		return this.humor;
	}
	
	public void setHumor(String humor)
	{
		this.humor = humor;
	}
	
	
	
}
