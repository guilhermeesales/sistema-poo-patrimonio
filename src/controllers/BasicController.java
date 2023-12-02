package controllers;

import java.util.ArrayList;
import models.ChamadoModel;


public class BasicController {
	ArrayList<Chamado> Chamados = new ArrayList<>();
	public Chamado criarChamado() { 
		ChamadoModel chamado = new ChamadoModel();
		chamado.setNomeChamado(nomeChamado);
		chamado.setTipoChamado(tipoChamado);
		chamado.setDescricaoChamado(descricaoChamado);
		
		
		
		chamados.add(chamado);
		return chamado; }
	
	
	public ArrayList<Chamado> historicoChamados() { 
		return this.Chamados;}
	
}
