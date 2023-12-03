package models;

import java.util.Map;

public class AdminModel extends UsuarioModel {
    public AdminModel() {

    }

    public AdminModel(String nome,char sexo, String email, String senha, String nivelAcesso) {
        this.setNome(nome);
        this.setSexo(sexo);
        this.setEmail(email);
        this.setSenha(senha);
        this.setNivelAcesso(nivelAcesso);
    }

    public Map<String, AdminModel> loadAdminstrador() {
        AdminModel userAdmin = new AdminModel("Guilherme Sales", 'M', "guilhermesales@outlook.com", "guilherme", "Admin".toLowerCase());

        userAdmin.UsuariosCadastrados.put("Guilherme Sales", userAdmin);

        return userAdmin.UsuariosCadastrados;

    }




}
