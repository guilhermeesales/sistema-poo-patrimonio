package views;

import java.util.InputMismatchException;
import java.util.Scanner;
import views.EditarChamadoView;
import controllers.ChamadoController;
import views.ChamadoView;

public class UsuarioBasicView {
    public static void ExibirUsuarioBasicView() {
        Scanner scanner = new Scanner(System.in);
        int opcao = 7;
        do {
            System.out.println("  Tela de usuário basic  ");
            System.out.println("----- Escolha uma opção -----");
            System.out.println("1. Visualizar Patrimônios");
            System.out.println("2. Gerar Relatorio dos Chamados");
            System.out.println("3. Criar Chamado");
            System.out.println("4. Histórico de Chamados");
            System.out.println("5. Editar Chamado");
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
                    System.out.println("Você escolheu Visualizar Patrimônios.");
                    VisualizarPatrimoniosView.exibirVisualizarPatrimoniosView();
                    break;
                case 2:
                    System.out.println("Você escolheu Gerar Relatório.");

                    break;                    
                case 3:
                    System.out.println("Você escolheu Criar Chamado.");
                    ChamadoView.exibirChamadoView();
                    break;
                case 4:
                    System.out.println("Você escolheu Histórico de Chamados.");
                    ChamadoController cController = new ChamadoController();
                    cController.historicoChamado();

                    break;
                case 5:
                    System.out.println("Você escolheu editar Chamado:");
                    EditarChamadoView.EditarChamadoView();
                    case 0:
                    System.out.println("Você escolheu sair.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            System.out.println();
        } while (opcao != 0);
    }
}
