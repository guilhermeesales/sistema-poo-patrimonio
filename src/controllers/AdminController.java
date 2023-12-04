package controllers;

import models.AdminModel;
import models.LocalizacaoModel;
import models.PatrimonioModel;

public class AdminController extends  UsuarioController {
    AdminModel AModel = new AdminModel();
    //Método para cadastrar patrimônios.
    public boolean cadastrarAtivos(String nome, String tipo, LocalizacaoModel local) {
        AModel.setPatrimoniosCadastrados(nome, tipo, local);
        return true;

    }
    //Cadastro de usuários
    public boolean cadastrarUsuarios(AdminModel adminModel) {
        AdminModel.UsuariosCadastrados.put(adminModel.getEmail(), adminModel);
        return true;
    }

    //Método para localizar o patrimônio pelo código na lista.
    public PatrimonioModel localizarPatrimonio(int codigo) {
        for(PatrimonioModel pModel : AModel.getPatrimoniosCadastrados()) {
            if(pModel.getCodigo() == codigo) {
                return pModel;
            }
        }
        return null;
    }
}