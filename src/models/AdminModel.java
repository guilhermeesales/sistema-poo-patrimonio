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

    public Map<String, UsuarioModel> loadAdminstrador() {
        UsuarioModel userAdmin = new UsuarioModel();
        userAdmin.setNome("Guilherme Sales");
        userAdmin.setSexo('M');
        userAdmin.setEmail("guilhermesales11@outlook.com");
        userAdmin.setSenha("guilherme");
        userAdmin.setNivelAcesso("Admin".toLowerCase());
        userAdmin.UsuariosCadastrados.put("usuario", userAdmin);

        return userAdmin.UsuariosCadastrados;

    }




}
