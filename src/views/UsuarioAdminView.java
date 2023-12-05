package views;

import controllers.SessaoController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsuarioAdminView {
    public static void ExibirUsuarioAdminView() {
        Scanner scanner = new Scanner(System.in);
        int opcao = 1000;
        do {
            System.out.println("  Tela de administrador  ");
            System.out.println("----- Escolha uma opção -----");
            System.out.println("1. Cadastrar patrimônios");
            System.out.println("2. Cadastrar usuários");
            System.out.println("3. Localizar Patrimonio");
            System.out.println("4. Visualizar Patrimonios");
            System.out.println("5. Gerar Relatório");
            System.out.println("0. Voltar menu");
            System.out.print("Opção: ");
            try {
                opcao = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Tente novamente.");
                scanner.nextLine();
                continue;
            }
            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu Cadastrar patrimônios.");
                    CadastrarPatrimonioView.ExibirCadastrarPatrimonioView();
                    break;
                case 2:
                    System.out.println("Você escolheu Cadastrar usuários.");
                    // Adicione aqui o código para Cadastrar usuários.
                    CadastrarUsuarioView.ExibirCadastrarUsuarioView();
                    break;
                case 3:
                    System.out.println("Você escolheu editar Localizar Patrimonio.");
                    LocalizarPatrimonioView.exibirLocalizarPatrimoniosView();
                    break;
                case 4:
                    System.out.println("Você escolheu Visualizar Patrimonios.");
                    VisualizarPatrimoniosView.exibirVisualizarPatrimoniosView();
                    break;
                case 5:
                    System.out.println("Você escolheu Gerar Relatório.");
                    RelatorioView.exibirRelatorioView();
                    break;
                case 0:
                    System.out.println("Você escolheu sair.");
                    SessaoController.destruirSession();
                    LoginView.ExibirLoginView();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            System.out.println();
        } while (opcao != 0);
    }
}
