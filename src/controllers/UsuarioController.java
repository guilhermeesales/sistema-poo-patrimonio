package controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Scanner;

import models.AdminModel;
import models.LocalizacaoModel;
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
            if(email.equals(usuario.getEmail()) && senha.equals(usuario.getSenha())) {
                SessaoController.salvarUsuarioSession(usuario);
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
    
    // Chama a lista com os patrimônios cadastrados.
    ArrayList<PatrimonioModel> patrimonios = adm.getPatrimoniosCadastrados();

    // Devolver todos os patrimônios cadastrados no sistema
    public void consultarPatrimonio() {
        for(PatrimonioModel patrimonio : patrimonios) {
            System.out.println(patrimonio);
        }
    }

    //Printa todos os patrimônios com a mesma localização.
    public boolean consultarPatrimonioLocalizacao(String sala, byte bloco, byte unidade){
        LocalizacaoModel local = new LocalizacaoModel(sala, bloco, unidade);
        boolean achado = false;

        for(PatrimonioModel patrimonio : patrimonios) {
            if (patrimonio.getLocal().equals(local)) {
                achado = true;
                System.out.println(patrimonio);
            }
        }
        return achado;
    }

    public void consultarPatrimonioDefeituosos(){
        for(PatrimonioModel patrimonio : patrimonios) {
            if (patrimonio.getDefeito() != null ) {
                System.out.println(patrimonio);
            }
        }
    }
}
