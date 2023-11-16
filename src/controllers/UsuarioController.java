package controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import models.AdminModel;
import models.PatrimonioModel;
import models.RelatorioModel;
import models.UsuarioModel;

public class UsuarioController {
    AdminModel adm = new AdminModel();

    // Methods
    public UsuarioModel logarSistema(String email, String senha) {
        Map<String, UsuarioModel> admin = adm.loadAdminstrador();
        Collection<UsuarioModel> values = admin.values();

        for(UsuarioModel valor : values) {
            if(email.equals(valor.getEmail()) && senha.equals(valor.getSenha())) {
                System.out.println("Logado com sucesso!");
                return valor;
            }

            System.out.println("Digite suas credenciais corretamente!");

        }


        return null;
    }

    public ArrayList<PatrimonioModel> consultarPatrimonios() {
        return null;
    }

    public RelatorioModel gerarRelatorioChamado(int codRelatorio) {
        return null;
    }


}
