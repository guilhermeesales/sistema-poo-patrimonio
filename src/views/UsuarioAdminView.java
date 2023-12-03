package views;

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
            System.out.println("2. Controlar Inventario");            
            System.out.println("3. Cadastrar usuários");
            System.out.println("4. Localizar Patrimonio");
            System.out.println("5. Visualizar Patrimonios");
            System.out.println("6. Gerar Relatório");
            System.out.println("7. Editar Patrimonio");
            System.out.println("8. Excluir patrimônios");
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
                    break;
                case 2:
                    System.out.println("Você escolheu Controlar Inventario.");
                    // Adicione aqui o código para Controlar Inventario.
                    break;                    
                case 3:
                    System.out.println("Você escolheu Cadastrar usuários.");
                    // Adicione aqui o código para Cadastrar usuários.
                    CadastrarUsuarioView.ExibirCadastrarUsuarioView();
                    break;
                case 4:
                    System.out.println("Você escolheu editar Localizar Patrimonio.");
                    // Adicione aqui o código para Localizar Patrimonio.
                    break;
                case 5:
                    System.out.println("Você escolheu Visualizar Patrimonios.");
                    VisualizarPatrimoniosView.exibirVisualizarPatrimoniosView();
                    break;
                case 6:
                    System.out.println("Você escolheu Gerar Relatório.");
                    // Adicione aqui o código para Gerar Relatório.
                    break;
                case 7:
                    System.out.println("Você escolheu Editar Patrimonio.");
                    // Adicione aqui o código para Editar Patrimonio.
                    break;
                case 8:
                    System.out.println("Você escolheu Excluir patrimônios.");
                    // Adicione aqui o código para Excluir patrimônios.
                    break;                                       
                case 0:
                    System.out.println("Você escolheu sair.");
                    LoginView.ExibirLoginView();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            System.out.println();
        } while (opcao != 0);
        scanner.close();
    }
}
