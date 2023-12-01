package models;

import java.time.LocalDate;

public class PatrimonioModel {
    private int codigo; //Código do patrimonio, da etiqueta.
    private String defeito; //Defeito existente no patrimônio, caso não tenha será null.
    private String nome; //Nome do patrimônio, por ex: extintor, mesa, carteira, cadeira, PC , monitor, mouse, teclado, ar-condicionado,
    // estante, banco, projetor, lousa, porta, bebedouro, telefone fixo.
    private String tipo; //Tipo do patrimônio como: material informático, móvel, material escritório.
    private LocalizacaoModel local = new LocalizacaoModel(); //Localização de aonde está o patrimônio, por exemplo: Unidade 1 Bloco 2 Sala 2.
    private DataModel dataDeCadastro = new DataModel(); //Data em que o patrimônio foi cadastrado no sistema.
    private DataModel ultimaManutencao = new DataModel(); //Data em que o patrimônio teve sua última manutenção, caso tenha tido algum defeito antes.
    private DataModel dataDepreciacao = new DataModel(); //Data em que o patrimônio será depreciado.

    //Getters da classe.
    public int getCodigo() {
        return this.codigo;
    }

    public String getDefeito() {
        return this.defeito;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTipo(){
        return this.tipo;
    }

    public LocalizacaoModel getLocal() {
        return this.local;
    }

    public DataModel getDataDeCadastro() {
        return this.dataDeCadastro;
    }

    public DataModel getUltimaManutencao() {
        return this.ultimaManutencao;
    }

    public DataModel getDepreciacao(){
        return this.dataDepreciacao;
    }





    //Setter's da classe.
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }


    public void setLocal(LocalizacaoModel local) {
        this.local = local;
    }

    public void setDataDeCadastro(DataModel dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public void setUltimaManutencao(DataModel ultimaManutencao) {
        this.ultimaManutencao = ultimaManutencao;
    }

    public void setDataDepreciacao(DataModel depreciacao){
        this.dataDepreciacao = depreciacao;
    }
}
