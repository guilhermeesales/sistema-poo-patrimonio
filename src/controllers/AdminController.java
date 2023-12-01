package controllers;

import models.LocalizacaoModel;
import models.PatrimonioModel;
import models.UsuarioModel;

import java.util.ArrayList;

public class AdminController {
    UsuarioModel usuarioM = new UsuarioModel();
    public boolean cadastrarAtivos(String nome, String tipo, LocalizacaoModel local) {
        ArrayList<PatrimonioModel> patrimonios = usuarioM.getPatrimoniosCadastrados();
        patrimonios.add(new PatrimonioModel(nome, tipo, local));
        return true;
    }

}
