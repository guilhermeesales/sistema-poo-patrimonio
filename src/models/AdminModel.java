package models;

import java.util.Map;

public class AdminModel extends UsuarioModel {
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
