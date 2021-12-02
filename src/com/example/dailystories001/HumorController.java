package com.example.dailystories001;

import java.util.List;

import android.content.Context;

public class HumorController {

	private static HumorDAO humorDAO;
    private static HumorController instance;

    public static HumorController getInstance(Context context)
    {
    	if (instance == null) 
    	{
    		instance = new HumorController();
    		humorDAO = new HumorDAO(context);
    	}
    	return instance;
    }

    public void insert(Humor humor) throws Exception 
    {
    	humorDAO.insert(humor);
    }

   

    public List<String> findAll() throws Exception 
    {
    	return humorDAO.findAll();
    }
    
    public int findById ()
	{
    	
    	return humorDAO.findById();
    	
	}

//    public boolean validaLogin(String diario) throws Exception 
//    {
//    	Diario user = diarioDAO.findByLogin(diario);
//    	if (user == null || user.getDiario() == null ) 
//    	{
//    		return false;
//    	}
//    	String informado = diario;
//    	String esperado = user.getDiario();
//    	if (informado.equals(esperado))
//    	{
//    		return true;
//    	}
//    	return false;
//    }
    
    public void fechar()
	{
		humorDAO.getDatabase().close();
	}
}
