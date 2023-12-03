package views;
import java.util.Scanner;
import controllers.BasicController;
import models.ChamadoModel;
import java.util.ArrayList;
public class ChamadoView {
    public void criarChamado() {
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
        basic.criarChamado(name, type, description);
        try {
            // Código para criar o chamado
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao criar o chamado: " + e.getMessage());
        }
    }
    public void historico() {
        BasicController basic = new BasicController();
        if (basic.historicoChamados().isEmpty()) {
            System.out.println("Nenhum chamado feito!");
        } else {
            for (ChamadoModel chamado : basic.historicoChamados()) {
                System.out.println("-------------------------------------------------");
                System.out.println("Nome: " + chamado.getNomeChamado());
                System.out.println("Tipo: " + chamado.getTipoChamado());
                System.out.println("Descrição: " + chamado.getDiscricaoChamado());
            }
        }
    }
}