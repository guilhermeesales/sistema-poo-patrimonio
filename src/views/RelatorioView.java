package views;

import com.itextpdf.text.Document;
import controllers.BasicController;
import controllers.ChamadoController;
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

                        ChamadoModel chamadoSelecionado = chamado.get(opc);

                        if(chamadoSelecionado != null) {
                            Document documento = null;
                            try {
                                documento = new Document();
                                


                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                                documento.close();
                            }


                        }



                    } catch (Exception e) {
                        System.out.println("Houve algum erro. Mensagem: " + e.getMessage());
                    }

                }

        } while(opc != 0);
    }
}
