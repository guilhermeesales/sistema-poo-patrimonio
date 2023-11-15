package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Usuario {
	// Implementação da classe de Usuário
	private String nome;
	private char sexo;
	private String email;
	private String senha;
	private String nivelAcesso;
	Map<String, Usuario> UsuariosCadastrados = new HashMap<>();
	
		
	// Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNivelAcesso() {
		return nivelAcesso;
	}
	public void setNivelAcesso(String nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
	
}
