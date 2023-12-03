package controllers;

import models.AdminModel;
import models.LocalizacaoModel;
import models.PatrimonioModel;
import models.UsuarioModel;

public class AdminController extends  UsuarioController{
    AdminModel AModel = new AdminModel();
    public boolean cadastrarAtivos(String nome, String tipo, LocalizacaoModel local) {
        AModel.setPatrimoniosCadastrados(nome, tipo, local);
        return true;

    }

    public boolean cadastrarUsuarios(AdminModel adminModel) {
        AdminModel.UsuariosCadastrados.put(adminModel.getEmail(), adminModel);
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
