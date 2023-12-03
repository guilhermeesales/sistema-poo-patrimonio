package controllers;

import java.util.ArrayList;
import models.ChamadoModel;

public class BasicController {

	ArrayList<ChamadoModel> chamados = new ArrayList<>();
	public ChamadoModel criarChamado() { 
		ChamadoModel chamado = new ChamadoModel();
		chamado.setNomeChamado(nomeChamado);
		chamado.setTipoChamado(tipoChamado);
		chamado.setDiscricaoChamado(discricaoChamado);
		
		this.chamados.add(chamado);
		return chamado; }
	
	
	public ArrayList<ChamadoModel> historicoChamados() { 
		return this.chamados;}
	
}
