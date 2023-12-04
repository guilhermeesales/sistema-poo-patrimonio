package views;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import controllers.BasicController;
import controllers.ChamadoController;
import controllers.RelatorioController;
import models.ChamadoModel;
import java.util.ArrayList;
import java.util.Scanner;


public class RelatorioView {
    public static void exibirRelatorioView() {
        // Aqui será exibido a lista de relatorios
        Scanner scanner = new Scanner(System.in);
        int opc;
        do {
            System.out.println(" Tela de Relatorio ");
            System.out.println("[1] Gerar um relatório");
            System.out.println("[0] Voltar");
            System.out.println("Escolha sua opção: ");
            opc = scanner.nextInt();

                if(opc == 1) {
                    try {
                        BasicController bController = new BasicController();
                        ArrayList<ChamadoModel> chamado = bController.historicoChamados();
                        ChamadoController chamadoC = new ChamadoController();
                        // Aqui fica toda a lógica para cadastrar um relatorio
                        chamadoC.historicoChamado();

                        System.out.println("Escolha o chamado através do número de chamado");
                        System.out.println("Escolha o chamado que deseja: ");
                        opc = scanner.nextInt();

                        ChamadoModel chamadoSelecionado = chamado.get(opc-1);

                        System.out.println(chamadoSelecionado.getNomeChamado());

                        System.out.println("Digite o nome do relátorio: ");


                        RelatorioController.gerarPDFRelatorio("Seila", "Seila", "Seila");
                        System.out.println("Documento gerado com sucesso!");


                    } catch (Exception e) {
                        System.out.println("Houve algum erro. Mensagem: " + e.getMessage());
                    }

                }

        } while(opc != 0);
    }
}
