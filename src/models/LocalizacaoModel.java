package models;
import java.util.ArrayList;

public class LocalizacaoModel {
    byte unidade, bloco; 
    String sala; 

    ArrayList<String> colecaoDeSalas = new ArrayList<String>(); //Array com as salas de cada bloco.
    

    public byte getUnidade(){
        return this.unidade;
    }
    public byte getBloco(){
        return this.bloco;
    }
    public String getSala(){
        return this.sala;
    }

    public void setUnidade(byte unidade){ //Irá setar a unidade em que o patrimônio está presente.
        if (unidade > 0 && unidade < 3) { //Como o campus só tem 2 unidades, so aceitara valor 1 e 2 para setar.
            this.unidade = unidade;
        }else{
            this.unidade = 0;
        }
    }

    public void setBloco(byte bloco){ //Setar o bloco existente do patrimônio.
        if (bloco > 0 && bloco < 3) { //Se o bloco for 1 ou 2, ele irá setar.
            this.bloco = bloco;
        }else{ //Se não, não irá setar.
            this.bloco = 0;
        }
    }

    public void setSala(String sala){ //Setando as salas.

        for (String percorredor : colecaoDeSalas) { //Irá percorrer o array, vendo se a sala setada existe no Array.

            if (percorredor.equals(sala)) { //Se encontrar no Array de Salas existentes, irá setar.
                this.sala = sala;
                return;
            }
        }

        this.sala = null; //Caso não, receberá null.

    }

}
