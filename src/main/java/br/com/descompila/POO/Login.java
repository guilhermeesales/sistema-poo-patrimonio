import java.util.InputMismatchException;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
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
