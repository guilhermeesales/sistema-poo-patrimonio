package controllers;

import models.AdminModel;
import models.UsuarioModel;


public class AdminController {
    UsuarioModel userModel = new UsuarioModel();
    public boolean cadastrarAtivos(String nome, String tipo) {
        userModel.setPatrimoniosCadastrados(nome, tipo);
        return true;

    }

    public boolean cadastrarAlunos(String nome, char sexo, String email, String senha, String nivelAcesso) {
        userModel.setUsuariosCadastrados(nome, sexo, email, senha, nivelAcesso);
        return true;
    }




}
