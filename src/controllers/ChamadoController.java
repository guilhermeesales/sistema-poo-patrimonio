package controllers;

import models.ChamadoModel;

public class ChamadoController {
    public void historicoChamado() {
        int cont = 0;
        BasicController basic = new BasicController();
        if (basic.historicoChamados().isEmpty()) {
            System.out.println("Nenhum chamado feito!");
        } else {
            for (ChamadoModel chamado : basic.historicoChamados()) {

                System.out.println("-------------------------------------------------");
                System.out.println("Número de chamado " + cont);
                System.out.println("Nome: " + chamado.getNomeChamado());
                System.out.println("Tipo: " + chamado.getTipoChamado());
                System.out.println("Descrição: " + chamado.getDiscricaoChamado());
                cont++;
            }
        }
    }
}
