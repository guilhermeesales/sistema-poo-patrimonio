package views;
import java.util.Scanner;
import controllers.BasicController;
import models.ChamadoModel;
import controllers.ChamadoController;
import java.util.InputMismatchException;

public class ChamadoView {
    public static void exibirChamadoView() {
        Scanner scanner = new Scanner(System.in);
        BasicController basic = new BasicController();
        String name, type, description;
        int correct = 0;
        System.out.println("----- Criação de Chamado -----");
        System.out.println("Digite o nome do chamado:");
        name = scanner.nextLine();
        System.out.println("Digite o tipo do chamado:");
        type = scanner.nextLine();
        System.out.println("Digite a descrição do chamado:");
        description = scanner.nextLine();
        System.out.println("Nome: " + name);
        System.out.println("tipo: " + type);
        System.out.println("Descrição: " + description);
        System.out.println("[1]Salvar\n[0]Refazer");
        try {
            // Código para criar o chamado,
            while (true) {
                correct = scanner.nextInt();

                if (correct == 1) {
                    basic.criarChamado(name, type, description);
                    break;
                } else if (correct == 0) {
                    exibirChamadoView();
                    break;
                } else {
                    System.out.println("Digite um numero valido!");
                    continue;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Ocorreu um erro ao criar o chamado: ");


            exibirChamadoView();


        }
    }

}
