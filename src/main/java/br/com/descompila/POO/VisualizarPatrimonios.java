import java.util.InputMismatchException;
import java.util.Scanner;

public class VisualizarPatrimonios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        do {
            System.out.println("-------------- Escolha uma opção --------------");
            System.out.println("[1] Listar Todos Patrimônios");
            System.out.println("[2] Listar Patrimônios em Comum");            
            System.out.println("[3] Listar Patrimônios por Sala");
            System.out.println("[4] Listar Patrimônios com Defeitos");
            System.out.println("[5] Localizações e Quantidades de Patrimônios");
            System.out.println("[6] Histórico de Atribuições de Patrimônios");          
            System.out.println("[0] Voltar ao Menu");
            try {
                opcao = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Tente novamente.");
                scanner.nextLine();
                continue;
            }
            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu Listar Todos Patrimônios.");
                    // Adicione aqui o código para Listar Todos Patrimônios.
                    break;
                case 2:
                    System.out.println("Você escolheu Listar Patrimônios em Comum.");
                    // Adicione aqui o código para Listar Patrimônios em Comum.
                    break;                    
                case 3:
                    System.out.println("Você escolheu Listar Patrimônios por Sala.");
                    // Adicione aqui o código para Listar Patrimônios por Sala.
                    break;
                case 4:
                    System.out.println("Você escolheu Listar Patrimônios com Defeitos.");
                    // Adicione aqui o código para Listar Patrimônios com Defeitos.
                    break;
                case 5:
                    System.out.println("Você escolheu Localizações e Quantidades de Patrimônios.");
                    // Adicione aqui o código para Localizações e Quantidades de Patrimônios.
                    break;
                case 6:
                    System.out.println("Você escolheu Histórico de Atribuições de Patrimônios.");
                    // Adicione aqui o código para Histórico de Atribuições de Patrimônios.
                    break;                                    
                case 0:
                    System.out.println("Você escolheu sair.");
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
