package controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import models.Admin;
import models.Patrimonio;
import models.Relatorio;
import models.Usuario;

public class UsuarioController {
	Admin adm = new Admin();
	
	// Methods
	public Usuario logarSistema(String email, String senha) {
		Map<String, Usuario> admin = adm.loadAdminstrador();
		Collection<Usuario> values = admin.values();
		
		for(Usuario valor : values) {
			if(email == valor.getEmail() && senha == valor.getSenha()) {
				return valor;
			}
		}
		
	
		return null;
	}
	
	public ArrayList<Patrimonio> consultarPatrimonios() {
		return null;
	}
	
	public Relatorio gerarRelatorioChamado(int codRelatorio) {
		return null;
	}
	

}
