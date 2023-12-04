package views;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import controllers.AdminController;
import models.AdminModel;
import models.PatrimonioModel;

public class VisualizarPatrimoniosView {
    public static void exibirVisualizarPatrimoniosView() {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

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


            AdminModel adm = new AdminModel();
            ArrayList<PatrimonioModel> listaPatrimonios = adm.getPatrimoniosCadastrados();

            AdminController controlador = new AdminController();
            switch (opcao) {
                case 1:
                    if (listaPatrimonios.isEmpty()) {
                        System.out.println("Nenhum patrimônio cadastrado!");
                    }else{
                        System.out.println("--TODOS OS PATRIMÔNIOS CADASTRADOS--");
                        controlador.consultarPatrimonio();
                    }
                    break;

                case 2:
                    if (listaPatrimonios.isEmpty()) {
                        System.out.println("Nenhum patrimônio cadastrado!");   
                    }else{
                        System.out.println("--Selecione o local para ver os patrimônios");
                        System.out.println("Selecione a unidade");
                        byte unidade = scanner.nextByte();
                        
                        System.out.println("Selecione o bloco");
                        byte bloco = scanner.nextByte();

                        System.out.println("Digite a sala(1 a 8 ou Laboratorio ou Secretaria)");
                        String sala = scanner.nextLine();

                        System.out.println("--PATRIMÔNIOS CADASTRADOS NESTA LOCALIZAÇÃO--");
                        if (!controlador.consultarPatrimonioLocalizacao(sala, bloco, unidade)) {
                            System.out.println("Não há patrimônios cadastrados nessa sala!");
                        }

                        
                    }
                    break;
                case 3:
                    if (listaPatrimonios.isEmpty()) {
                        System.out.println("Nenhum patrimônio cadastrado!");
                    }else{
                        System.out.println("--TODOS OS PATRIMÔNIOS COM DEFEITO--");
                        controlador.consultarPatrimonio();
                    }
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
}
