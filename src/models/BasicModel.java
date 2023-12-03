package models;

import java.util.Map;

public class BasicModel extends UsuarioModel {
    public BasicModel() {

    }

    public BasicModel(String nome,char sexo, String email, String senha, String nivelAcesso) {
        this.setNome(nome);
        this.setSexo(sexo);
        this.setEmail(email);
        this.setSenha(senha);
        this.setNivelAcesso(nivelAcesso);
    }

    public Map<String, AdminModel> loadBasic() {
        AdminModel userBasic = new AdminModel();
        userBasic.setNome(getNome());
        userBasic.setSexo(getSexo());
        userBasic.setEmail(getEmail());
        userBasic.setSenha(getSenha());
        userBasic.setNivelAcesso(getNivelAcesso().toLowerCase());
        userBasic.UsuariosCadastrados.put("usuario", userBasic);

        return userBasic.UsuariosCadastrados;

    }




}

