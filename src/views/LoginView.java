package views;

import controllers.AdminController;
import models.UsuarioModel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoginView {

    public static void ExibirLoginView() {
        AdminController aController = new AdminController();
        Scanner scanner = new Scanner(System.in);
        int opcao = 1000;
        do {
            System.out.println("----Tela inicial----");
            System.out.println("[1] Logar no sistema");
            System.out.println("[0] Sair do sistema");
            System.out.print("Digite sua escolha: ");
            try {
                opcao = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida.");
                scanner.nextLine();
                continue;
            }
            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu logar no sistema");
                    System.out.println("Digite o email: ");
                    String email = scanner.next();
                    System.out.println("Digite a senha: ");
                    String senha = scanner.next();
                    // Fazer login no sistema
                    UsuarioModel userModel = aController.logarSistema(email, senha);

                    if(userModel == null) {
                        System.out.println("As credenciais não foram digitadas corretamente.");

                    }

                    break;
                case 0:
                    System.out.println("Você escolheu sair.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            System.out.println();
            //scanner.close();
        } while (opcao != 0);
    }
}
