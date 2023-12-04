package controllers;
import models.UsuarioModel;
import java.util.HashMap;
import java.util.Map;

public class SessaoController {
    private static final Map<String, UsuarioModel> sessaoUser = new HashMap<>();
    public static void salvarUsuarioSession(String user, UsuarioModel userModel) {
        sessaoUser.put(user, userModel);

    }

    public static void destruirSession() {
        sessaoUser.clear();
    }


}
