import java.util.Scanner;

public class CadastrarUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, sexo, email, senha, accessLevel;
        System.out.println("Cadastro de Usuário");
        System.out.println("Digite o nome do usuário:");
        nome = scanner.nextLine();
        System.out.println("Digite o sexo do usuário (M ou F):");
        sexo = scanner.nextLine();
        while (!sexo.equals("M") && !sexo.equals("F")) {
            System.out.println("Sexo inválido. Digite M ou F:");
            sexo = scanner.nextLine();
        }
        System.out.println("Digite o email do usuário:");
        email = scanner.nextLine();
        System.out.println("Digite a senha do usuário:");
        senha = scanner.nextLine();
        System.out.println("Digite o nível de acesso do usuário (basic ou admin):");
        accessLevel = scanner.nextLine();
        while (!accessLevel.equals("basic") && !accessLevel.equals("admin")) {
            System.out.println("Nível de acesso inválido. Digite basic ou admin:");
            accessLevel = scanner.nextLine();
        }
        try {
            // Código para cadastrar o usuário
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao cadastrar o usuário: " + e.getMessage());
        }
    }
}
