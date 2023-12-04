package controllers;

import models.ChamadoModel;

public class ChamadoController {
    public void historicoChamado() {
        int cont = 0;
        BasicController basic = new BasicController();
        if (basic.historicoChamados().isEmpty()) {
            System.out.println("Nenhum chamado feito!");
        } else {
            for(int i = 0; i < basic.historicoChamados().size(); i++){
                int cod = i + 1;
                System.out.println("[" +cod+ "]"+"-------------------------------------------------");
                System.out.println("Nome: " + basic.historicoChamados().get(i).getNomeChamado());
                System.out.println("Tipo: " + basic.historicoChamados().get(i).getTipoChamado());
                System.out.println("Descrição: " + basic.historicoChamados().get(i).getDiscricaoChamado());

                cont++;
            }
        }
    }
    public void editarChamado(int chamado, String editar, int opcaoEditar){
        BasicController basic1 = new BasicController();
        if (basic1.historicoChamados().isEmpty()) {
            return;
        } else {
            if(opcaoEditar == 1) {
                basic1.historicoChamados().get(chamado - 1).setNomeChamado(editar);

            } else if (opcaoEditar == 2) {
                basic1.historicoChamados().get(chamado - 1).setTipoChamado(editar);

            }else if (opcaoEditar == 3 ) {
                basic1.historicoChamados().get(chamado - 1).setDiscricaoChamado(editar);

            }
            System.out.println(basic1.historicoChamados().get(chamado - 1).getNomeChamado());
            System.out.println(basic1.historicoChamados().get(chamado - 1).getTipoChamado());
            System.out.println(basic1.historicoChamados().get(chamado - 1).getDiscricaoChamado());
        }
            /*for (ChamadoModel chamado : basic.historicoChamados()) {
                System.out.println("-------------------------------------------------");
                System.out.println("Nome: " + chamado.getNomeChamado());
                System.out.println("Tipo: " + chamado.getTipoChamado());
                System.out.println("Descrição: " + chamado.getDiscricaoChamado());
            }*/
        }
    }

