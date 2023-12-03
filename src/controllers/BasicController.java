package controllers;

import java.util.ArrayList;
import models.ChamadoModel;

public class BasicController extends UsuarioController {

	ArrayList<ChamadoModel> chamados = new ArrayList<>();
	public ChamadoModel criarChamado(String nomeChamado, String tipoChamado, String discricaoChamado) {
		ChamadoModel chamado = new ChamadoModel(nomeChamado,tipoChamado,discricaoChamado);
		this.chamados.add(chamado);
		return chamado; }
	
	
	public ArrayList<ChamadoModel> historicoChamados() { 
		return this.chamados;}
	
}
