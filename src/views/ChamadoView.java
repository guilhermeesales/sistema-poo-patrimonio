package views;
import java.util.Scanner;
import controllers.BasicController;

public class ChamadoView {
    public static void exibirChamadoView() {
        Scanner scanner = new Scanner(System.in);
        BasicController basic = new BasicController();
        String name, type, description;
        System.out.println("----- Criação de Chamado -----");
        System.out.println("Digite o nome do chamado:");
        name = scanner.nextLine();
        System.out.println("Digite o tipo do chamado:");
        type = scanner.nextLine();
        System.out.println("Digite a descrição do chamado:");
        description = scanner.nextLine();

        try {
            // Código para criar o chamado,
            basic.criarChamado(name, type, description);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao criar o chamado: " + e.getMessage());
        }
    }

}