package views;

import java.util.InputMismatchException;
import java.util.Scanner;
import models.LocalizacaoModel;
import controllers.AdminController;

public class CadastrarPatrimonioView {
    public static void ExibirCadastrarPatrimonioView() {
        try {
            Scanner scanner = new Scanner(System.in);
            String nome, tipo;
            byte location; 
            LocalizacaoModel local = new LocalizacaoModel();

            System.out.println("----- Cadastro de Patrimônios -----");
            System.out.println("Digite o nome do patrimônio:");
            nome = scanner.nextLine();

            System.out.println("Digite o tipo do patrimônio:");
            tipo = scanner.nextLine();

            System.out.println("Local do Patrimônio\nDigite a unidade do patrimônio (1 ou 2):");
            location = scanner.nextByte();
            local.setUnidade(location);

            System.out.println("Digite o bloco da unidade (1 ou 2):");
            location = scanner.nextByte();
            local.setBloco(location);

            local.ExibirSalas();
            System.out.println("Digite a sala do patrimônio:");
            String sala = scanner.next();
            local.setSala(sala);

            AdminController adm = new AdminController();
            adm.cadastrarAtivos(nome, tipo, local);


        } catch (InputMismatchException e) {
            System.out.println("Digite uma entrada válida! - " + e.getMessage());
        }
    }
}
