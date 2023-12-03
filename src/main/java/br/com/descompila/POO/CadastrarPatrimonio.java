import java.util.Scanner;

public class CadastrarPatrimonio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, tipo, defeito, location;
        System.out.println("----- Cadastro de Patrimônios -----");
        System.out.println("Digite o nome do patrimônio:");
        nome = scanner.nextLine();
        System.out.println("Digite o tipo do patrimônio:");
        tipo = scanner.nextLine();
        System.out.println("Digite o defeito do patrimônio:");
        defeito = scanner.nextLine();
        System.out.println("Digite o local do patrimônio:");
        location = scanner.nextLine();
        try {
            // Código para cadastrar o patrimônio
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao cadastrar o patrimônio: " + e.getMessage());
        }
    }
}
