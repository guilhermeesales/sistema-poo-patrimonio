package models;

import java.util.Map;

public class Admin extends Usuario{
	
	public Map<String, Usuario> loadAdminstrador() {
		Usuario userAdmin = new Usuario();
		userAdmin.setNome("Guilherme Sales");
		userAdmin.setSexo('M');
		userAdmin.setEmail("guilhermesales11@outlook.com");
		userAdmin.setSenha("guilherme");
		userAdmin.setNivelAcesso("Admin");
		userAdmin.UsuariosCadastrados.put("usuario", userAdmin);
		
		return userAdmin.UsuariosCadastrados;
		
	}

}
