package controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.time.LocalDate;

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

    public AdminModel logarSistema(String email, String senha) {
        Map<String, AdminModel> admin = adm.loadAdminstrador();
        Collection<AdminModel> usuarios = admin.values();

        for(AdminModel usuario : usuarios) {
            if(email.equals(usuario.getEmail()) && senha.equals(usuario.getSenha())) {
                SessaoController.salvarUsuarioSession(usuario);
                UsuarioModel.setUsuarioLogado(true);
                definirRotas(usuario);
                return usuario;

            }
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

    //Printa todos os patrimônios defeituosos.
    public boolean consultarPatrimonioDefeituosos(){
        boolean temdefeituosos = false;
        for(PatrimonioModel patrimonio : patrimonios) {
            if (patrimonio.getDefeito() != null ) {
                temdefeituosos = true;
                System.out.println(patrimonio);
            }
        }
        return temdefeituosos;
    }
    //Printa todos os patrimônios com o mesmo tipo.
    public boolean consultarPatrimonioMesmoTipo(String tipo){
        boolean contemTipo = false;
        for (PatrimonioModel p : patrimonios) {
            if (p.getTipo().equals(tipo)) {
                contemTipo = true;
                System.out.println(p);
            }
        }
        return contemTipo;
    }
    //Méotodo para printar os patrimônios com a data de depreciação passada.
    public boolean consultarPatrimonioDepreciacao(LocalDate data){
        boolean contemData = false;
        for (PatrimonioModel p: patrimonios) {
            if (p.getDataDepreciacao().equals(data)) {
                contemData = true;
                System.out.println(p);
            }
        }
        return contemData;
    }
    //Méotodo para printar os patrimônios com a data de cadastro passada.
    public boolean consultarPatrimonioDataCadastro(LocalDate data){
        boolean contemData = false;
        for (PatrimonioModel p: patrimonios) {
            if (p.getDataDeCadastro().equals(data)) {
                contemData = true;
                System.out.println(p);
            }
        }
        return contemData;
    }

    //Método para consultar o histórico de patrimônios cadastrados do mais recente ao mais antigo.
    public void consultarHistoricoDePatrimonios(){
        for (int i = patrimonios.size()-1; i >= 0; i--) {
            System.out.println(patrimonios.get(i).toString());
        }
    }

    //Método para exibir os tipos de patrimônios aceitados pelo sistema.
    public void exibirTiposPatrimonio(){
        for ( String p : PatrimonioModel.arrayTipos ) {
            System.out.println(p);
        }
    }


}