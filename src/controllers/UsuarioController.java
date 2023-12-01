package controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import models.AdminModel;
import models.PatrimonioModel;
import models.RelatorioModel;
import models.UsuarioModel;
import views.AdminView;
import views.BasicView;

public class UsuarioController {
    AdminModel adm = new AdminModel();

    // Methods
    public UsuarioModel logarSistema(String email, String senha) {
        Map<String, UsuarioModel> admin = adm.loadAdminstrador();
        Collection<UsuarioModel> usuarios = admin.values();

        for(UsuarioModel usuario : usuarios) {
            if(email.equals(usuario.getEmail()) && senha.equals(usuario.getSenha())) {
                UsuarioModel.setUsuarioLogado(true);
                definirRotas(usuario);
                return usuario;
            }

            UsuarioModel.setUsuarioLogado(false);
        }

        return null;
    }


    public void definirRotas(UsuarioModel usuario) {
        // Definindo o controle de rotas Admin e Basic
        if(AdminModel.isUsuarioLogado()) {
            if(usuario.getNivelAcesso().equals("Admin".toLowerCase())) {
                AdminView aView = new AdminView();
                aView.exibirAdminView();

            } else {
                BasicView bView = new BasicView();
                bView.exibirHomeView();
            }

        }
    }

    public RelatorioModel gerarRelatorioChamado(int codRelatorio) {
        return null;
    }

}
