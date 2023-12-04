package views;

import controllers.ChamadoController;
import  controllers.BasicController;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EditarChamadoView {
    public static void EditarChamadoView(){
        BasicController bControl = new BasicController();
        ChamadoController cControl = new ChamadoController();
        cControl.historicoChamado();
        Scanner scan = new Scanner(System.in);

            int chamado1 , opcaoEditar;
            String editar ;
            System.out.println("Qual o chamado que deseja editar:");
            chamado1 = scan.nextInt();
            if (chamado1 > bControl.historicoChamados().size()){
                System.out.println("Digite um número de chamado válido");
            }

            System.out.println("Qual deseja alterar;");
            System.out.println("[1]Nome");
            System.out.println("[2]tipo");
            System.out.println("[3]Descrição");
            opcaoEditar = scan.nextInt();

            System.out.println("Digite o novo texto");
            scan.nextLine();
            editar = scan.nextLine();

            cControl.editarChamado(chamado1, editar, opcaoEditar);

        }
    }

