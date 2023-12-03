package controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import models.AdminModel;
import models.PatrimonioModel;
import models.RelatorioModel;
import models.UsuarioModel;
import views.UsuarioAdminView;
import views.UsuarioBasicView;

public class UsuarioController {
    AdminModel adm = new AdminModel();

    // Methods

    public UsuarioModel logarSistema(String email, String senha) {
        Map<String, AdminModel> admin = adm.loadAdminstrador();
        Collection<AdminModel> usuarios = admin.values();

        for(AdminModel usuario : usuarios) {
            System.out.println(usuario.getNome());
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
                UsuarioAdminView.ExibirUsuarioAdminView();

            } else {
                UsuarioBasicView.ExibirUsuarioBasicView();
            }

        }
    }

    // Gerar um relatorio feito pelo usuário comum
    public RelatorioModel gerarRelatorioChamado(int codRelatorio) {
        return null;
    }
    UsuarioModel userModel = new UsuarioModel();
    // Devolver todos os patrimônios cadastrados no sistema
    public void consultarPatrimonio() {
        UsuarioModel admin = new UsuarioModel();



        System.out.println("ENTREI AQUI");


        if(patrimonios.isEmpty()) {
            System.out.println("Está vazio...");
        }

        for(PatrimonioModel patrimonio : patrimonios) {
            System.out.println(patrimonio.getNome());
            System.out.println(patrimonio.getTipo());
            System.out.println(patrimonio.getLocal());

        }

    }

}
