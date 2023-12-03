package views;
import java.util.InputMismatchException;
import java.util.Scanner;
import models.PatrimonioModel;
import controllers.UsuarioController;

public class VisualizarPatrimoniosView {
    public static void exibirVisualizarPatrimoniosView() {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("--VISUALIZAR PATRIMÔNIOS--");
            System.out.println("1.Listar todos");
            System.out.println("2.Listar por localização");
            System.out.println("3.Listar todos com defeito");
            System.out.println("4.Listar por tipo");
            System.out.println("5.Listar por data de Depreciação");
            System.out.println("6.Listar por data de cadastro");
            System.out.println("7.Exibir histórico patrimônios cadastrados");
            try {
                opcao = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Tente novamente.");
                scanner.nextLine();
                continue;
            }
            switch (opcao) {
                case 1:
                    UsuarioController controlador = new UsuarioController();
                    System.out.println("--TODOS OS PATRIMÔNIOS CADASTRADOS--");
                    controlador.consultarPatrimonio();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 0);
    }

    public void ExibirTodosPatrimonios(){

    }


}
