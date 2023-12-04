package controllers;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import models.AdminModel;
import models.RelatorioModel;
import java.util.Random;

import java.io.FileOutputStream;
import java.io.IOException;

public class RelatorioController {
    public static void gerarPDFRelatorio(String nomeRelatorio, String nomeChamado, String tipoChamado, String descricaoChamado) {
        Random random = new Random();
        AdminModel aModel = SessaoController.recuperarUsuarioSalvo();
        RelatorioModel rModel = new RelatorioModel();
        Document documentoPDF = new Document();

        int numeroInteiroAleatorio = random.nextInt(10000);
        rModel.setCodRelatorio(numeroInteiroAleatorio);

        try {
            PdfWriter.getInstance(documentoPDF, new FileOutputStream("E:\\Teste.pdf"));
            documentoPDF.open();
            documentoPDF.setPageSize(PageSize.A4);
            documentoPDF.add(new Paragraph("Nome do relátorio: " + nomeRelatorio));
            documentoPDF.add(new Paragraph("Data gerada: " + String.valueOf(rModel.getDataGerada())));
            documentoPDF.add(new Paragraph("Código do relátorio: " + rModel.getCodRelatorio()));
            documentoPDF.add(new Paragraph("Informações do chamado"));
            documentoPDF.add(new Paragraph("Nome do chamado: " + nomeRelatorio));
            documentoPDF.add(new Paragraph("Tipo de chamado: " + tipoChamado));
            documentoPDF.add(new Paragraph("Descrição do chamado: " + descricaoChamado));
            documentoPDF.add(new Paragraph("Documento gerado pelo usuário: " + aModel.getNome()));

        } catch (DocumentException documentError) {
            documentError.getStackTrace();

        } catch(IOException ioe) {
            ioe.printStackTrace();

        } finally {
            documentoPDF.close();

        }
    }
}
