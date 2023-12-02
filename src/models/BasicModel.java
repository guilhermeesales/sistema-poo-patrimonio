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

    public Map<String, UsuarioModel> loadBasic() {
        UsuarioModel userBasic = new UsuarioModel();
        userBasic.setNome(this.nome);
        userBasic.setSexo(this.sexo);
        userBasic.setEmail(this.email);
        userBasic.setSenha(this.senha);
        userBasic.setNivelAcesso(this.nivelAcesso.toLowerCase());
        userBasic.UsuariosCadastrados.put("usuario", userBasic);

        return userBasic.UsuariosCadastrados;

    }




}

