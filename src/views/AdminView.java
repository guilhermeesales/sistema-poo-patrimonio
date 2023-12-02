package views;

import controllers.AdminController;
import controllers.UsuarioController;
import models.AdminModel;

public class AdminView {

    public void exibirAdminView() {
        System.out.println("ESSA É A ROTA PARA ADMINSTRADOR");

        UsuarioController userController = new UsuarioController();

        System.out.println("PATRIMONIOS CADASTRADOS NO SISTEMA");

        userController.consultarPatrimonio();

    }

}
