package controllers;

import models.AdminModel;
import models.PatrimonioModel;

public class AdminController {
    AdminModel AModel = new AdminModel();
    public boolean cadastrarAtivos(String nome, String tipo) {
        AModel.setPatrimoniosCadastrados(nome, tipo);
        return true;

    }

    public boolean cadastrarAlunos(String nome, char sexo, String email, String senha, String nivelAcesso) {
        AModel.setUsuariosCadastrados(nome, sexo, email, senha, nivelAcesso);
        return true;
    }

    public boolean editarAtivos(String nome, String tipo) {
        for(PatrimonioModel pModel : AModel.getPatrimoniosCadastrados()) {
            if(pModel.getNome().equals(nome)) {
                // Ativo existente faço a alteração!
                return true;
            }
        }
        return false;
    }

    public boolean excluirAtivos(int cod) {
        for(PatrimonioModel pModel : AModel.getPatrimoniosCadastrados()) {
            if(pModel.getCodigo() == cod) {
                // Item encontrado com sucesso e poderá ser excluido
                return true;
            }
        }
        return false;
    }

    public PatrimonioModel localizarPatrimonio(String nome) {
        for(PatrimonioModel pModel : AModel.getPatrimoniosCadastrados()) {
            if(pModel.getNome().equals(nome)) {
                return pModel;
            }
        }
        return null;
    }



}
