package views;
import java.util.Scanner;
import controllers.UsuarioController;

public class HomeView {
    UsuarioController uController = new UsuarioController();
    Scanner sc = new Scanner(System.in);

    public void exibirHomeView() {
        String email, senha;
        int opc;
        do {
            System.out.println("Bem vindo ao sistema de patrimônio público");
            System.out.println("[1] Logar no sistema");
            System.out.println("[0] Sair do sistema");
            System.out.println("Selecione sua opção: ");
            opc = sc.nextInt();

            if(opc == 1) {
                System.out.println("Opção de logar selecionada com sucesso!");
                System.out.println("Digite seu email: ");
                email = sc.next();
                System.out.println("Digite sua senha: ");
                senha = sc.next();
                uController.logarSistema(email, senha);

            } else if(opc == 2) {
                System.out.println("Poxa cara você saiu do sistema");

            } else if(opc == 0) {
                System.out.println("Obrigado por utilizar o programa");
            }


        } while(opc != 0);

    }


}
