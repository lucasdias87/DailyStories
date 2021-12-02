package com.example.dailystories001;

import java.util.Date;

public class Atividade {

	private Integer id;
	private String atividade;
	
	
	
	public Atividade(Integer id, String atividade)
	{
		this.id = id;
		this.atividade = atividade;
		
	}
	
	public Integer getId()
	{
		return this.id;
	}
	
	public void setID(Integer id)
	{
		this.id = id;
	}
	
	public String getAtividade()
	{
		return this.atividade;
	}
	
	public void setAtividade(String atividade)
	{
		this.atividade = atividade;
	}
	
	
	
}
