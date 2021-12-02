package com.example.dailystories001;

import java.util.List;

import android.content.Context;

public class DiarioController {

	private static DiarioDAO diarioDAO;
    private static DiarioController instance;

    public static DiarioController getInstance(Context context)
    {
    	if (instance == null) 
    	{
    		instance = new DiarioController();
    		diarioDAO = new DiarioDAO(context);
    	}
    	return instance;
    }

    public void insert(Diario diario) throws Exception 
    {
    	diarioDAO.insert(diario);
    }

   

    public List<String> findAll() throws Exception 
    {
    	return diarioDAO.findAll();
    }
    
    
    // find Humor
    
    public int findByApaixonado ()
	{
    	
    	return diarioDAO.findByApaixonado();
    	
	}

    public int findByRadiante ()
	{
    	
    	return diarioDAO.findByRadiante();
    	
	}
    
    public int findByFeliz ()
   	{
       	
       	return diarioDAO.findByFeliz();
       	
   	}
    
    public int findByRaiva ()
   	{
       	
       	return diarioDAO.findByRaiva();
       	
   	}
    
    public int findByTriste ()
   	{
       	
       	return diarioDAO.findByTriste();
       	
   	}
    
  
    // find Atividade
    
    public int findByMusica ()
	{
    	
    	return diarioDAO.findByMusica();
    	
	}

    public int findByMalhar ()
	{
    	
    	return diarioDAO.findByMalhar();
    	
	}
    
    public int findByDanca ()
   	{
       	
       	return diarioDAO.findByDanca();
       	
   	}
    
    public int findByTv ()
   	{
       	
       	return diarioDAO.findByTv();
       	
   	}
    
    public int findByVideoGame ()
   	{
       	
       	return diarioDAO.findByVideoGame();
       	
   	}
    
    public int findByLer ()
   	{
       	
       	return diarioDAO.findByLer();
       	
   	}
    
    
    public int findByTudo ()
   	{
       	
       	return diarioDAO.findByTudo();
       	
   	}
    
    public int findByTudoA ()
   	{
       	
       	return diarioDAO.findByTudoA();
       	
   	}
    
    
    public void fechar()
	{
		diarioDAO.getDatabase().close();
	}
}
