package views;
import java.time.LocalDate;
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
            System.out.println("0.Voltar");
            System.out.println("Selecione a opção: ");

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
                        try {
                            System.out.println("--Selecione o local para ver os patrimônios");
                            System.out.println("Selecione a unidade");
                            byte unidade = scanner.nextByte();
                            
                            System.out.println("Selecione o bloco");
                            byte bloco = scanner.nextByte();
                            scanner.nextLine(); //limpar buffer do teclado

                            System.out.println("Digite a sala(1 a 8 ou Laboratorio ou Secretaria)");
                            String sala = scanner.next();

                            System.out.println("--PATRIMÔNIOS CADASTRADOS NESTA LOCALIZAÇÃO--");
                            if (!controlador.consultarPatrimonioLocalizacao(sala, bloco, unidade)) {
                                System.out.println("Não há patrimônios cadastrados nessa sala!");
                            }
                        } catch (Exception e) {
                            System.out.println("Insira os dados corretamente!");
                        }
                    }
                    break;
                case 3:
                    if (listaPatrimonios.isEmpty()) {
                        System.out.println("Nenhum patrimônio cadastrado!");
                    }else{
                        System.out.println("--TIPOS DE PATRIMÔNIO COM DEFEITO--");
                        if (!controlador.consultarPatrimonioDefeituosos()) {
                            System.out.println("Não há patrimônios defeituosos!");
                        }
                    }
                    break;
                case 4:
                    if (listaPatrimonios.isEmpty()) {
                        System.out.println("Nenhum patrimônio cadastrado!");
                    }else{
                        System.out.println("--TIPOS DE PATRIMÔNIO ACEITADOS--");
                        controlador.exibirTiposPatrimonio();

                        System.out.println("Digite o tipo a ser exibido:");
                        String tipo = scanner.next();

                        if (!controlador.consultarPatrimonioMesmoTipo(tipo)) {
                            System.out.println("Não há patrimônios com esse tipo!");
                        }
                    }
                    break;
                case 5:
                    if (listaPatrimonios.isEmpty()) {
                        System.out.println("Nenhum patrimônio cadastrado!");
                    }else{
                        try{
                            System.out.println("--Selecione a data em que o patrimônio foi depreciado");
                            System.out.println("Digite o ano:");
                            int ano = scanner.nextInt();
                            
                            System.out.println("Digite o mês:");
                            byte mes = scanner.nextByte();

                            System.out.println("Digite o dia:");
                            byte dia = scanner.nextByte();

                            System.out.println("--TIPOS DE PATRIMÔNIO COM ESTA DATA DE DEPRECIAÇÃO--");
                            LocalDate depreciacao = LocalDate.now().withYear(ano).withMonth(mes).withDayOfMonth(dia);
                            if (!controlador.consultarPatrimonioDepreciacao(depreciacao)) {
                                System.out.println("Não há patrimônios com essa data de depreciação!");
                            }
                        }catch(Exception e){
                            System.out.println("Digite a data corretamente!");
                        }
                    }
                    break;
                case 6:
                    if (listaPatrimonios.isEmpty()) {
                        System.out.println("Nenhum patrimônio cadastrado!");
                    }else{
                        try{
                            System.out.println("--Selecione a data em que o patrimônio foi cadastrado");
                            System.out.println("Digite o ano:");
                            int ano = scanner.nextInt();
                            
                            System.out.println("Digite o mês:");
                            byte mes = scanner.nextByte();

                            System.out.println("Digite o dia:");
                            byte dia = scanner.nextByte();

                            System.out.println("--TIPOS DE PATRIMÔNIO COM ESTA DATA DE DEPRECIAÇÃO--");
                            LocalDate depreciacao = LocalDate.now().withYear(ano).withMonth(mes).withDayOfMonth(dia);
                            if (!controlador.consultarPatrimonioDataCadastro(depreciacao)) {
                                System.out.println("Não há patrimônios com essa data de cadastro!");
                            }
                        }catch(Exception e){
                            System.out.println("Digite a data corretamente!");
                        }

                    }
                    break;
                case 7:
                    if (listaPatrimonios.isEmpty()) {
                        System.out.println("Nenhum patrimônio cadastrado!");
                    }else{
                        System.out.println("--HISTÓRICO DE PATRIMÔNIOS CADASTRADOS (DO MAIS RECENTE PRO MAIS ANTIGO)");
                        controlador.consultarHistoricoDePatrimonios();
                    }
                case 0:
                    System.out.println("Retornando ao menu principal!");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 0);
    }
}
