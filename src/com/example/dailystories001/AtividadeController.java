package com.example.dailystories001;

import java.util.List;

import android.content.Context;

public class AtividadeController {

	private static AtividadeDAO atividadeDAO;
    private static AtividadeController instance;

    public static AtividadeController getInstance(Context context)
    {
    	if (instance == null) 
    	{
    		instance = new AtividadeController();
    		atividadeDAO = new AtividadeDAO(context);
    	}
    	return instance;
    }

    public void insert(Atividade atividade) throws Exception 
    {
    	atividadeDAO.insert(atividade);
    }

   

    public List<String> findAll() throws Exception 
    {
    	return atividadeDAO.findAll();
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
		atividadeDAO.getDatabase().close();
	}
}
