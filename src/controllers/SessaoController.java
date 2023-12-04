package controllers;
import models.AdminModel;
import java.util.ArrayList;
import java.util.List;

public class SessaoController {

    public static final List<AdminModel> sessaoUsuario = new ArrayList<>();

    public static void salvarUsuarioSession(AdminModel adminModel) {
        sessaoUsuario.add(adminModel);

    }

    public static AdminModel recuperarUsuarioSalvo() {
        return sessaoUsuario.get(0);
    }


    public static void destruirSession() {
        sessaoUsuario.clear();
    }


}
