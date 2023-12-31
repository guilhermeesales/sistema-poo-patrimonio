package models;
import java.time.LocalDate;

public class PatrimonioModel {
    private static int qtdPatrimonios = 0; //Variável estática que ira definir um novo código para cada patrimonio cadastrado.
    private int codigo; //Código do patrimonio, da etiqueta.

    private String nome; //Nome do patrimônio, por ex: extintor, mesa, carteira, cadeira, PC , monitor, mouse, teclado, ar-condicionado,
    // estante, banco, projetor, lousa, porta, bebedouro, telefone fixo.
    private String tipo; //Tipo do patrimônio.
    public static final String[] arrayTipos = {"material informatico", "movel", "escritorio","material de segurança"};

    private String defeito; //Defeito existente no patrimônio, não iremos cadastrar um novo patrimônio no sistema, sendo ele quebrado, então ele irá começar com "ótimo estado".
    
    private LocalizacaoModel local = new LocalizacaoModel(); //Localização de aonde está o patrimônio, por exemplo: Unidade 1 Bloco 2 Sala 2.
    
    private LocalDate dataDeCadastro = LocalDate.now(); //Data em que o patrimônio foi cadastrado no sistema.
    private LocalDate ultimaManutencao; //Data em que o patrimônio teve sua última manutenção, caso tenha tido algum defeito antes.
    private LocalDate dataDepreciacao;//Data em que o patrimônio será depreciado.


    public PatrimonioModel() {
    }

    public PatrimonioModel(String nome, String tipo, LocalizacaoModel local){
        qtdPatrimonios++;
        this.codigo = qtdPatrimonios;
        this.nome = nome;
        this.tipo = tipo;
        this.local = local;
        this.dataDeCadastro = LocalDate.now();
    }

    public String toString(){
        if (getDefeito() != null) {
            return "Código:"+ getCodigo() +" - Nome:"+ getNome() +" - Tipo:"+getTipo()+" \nUnidade:"+getLocal().getUnidade()+" - Bloco:" + getLocal().getBloco() + " - Sala:" + getLocal().getSala() + "\nData de Cadastro:"+getDataDeCadastro()+" - Data de Depreciação:"+getDataDepreciacao()+ " - Defeito"+getDefeito()+"\n";
        }
        return "Código:"+ getCodigo() +" - Nome:"+ getNome() +" - Tipo:"+getTipo()+" \nUnidade:"+getLocal().getUnidade()+" - Bloco:" + getLocal().getBloco() + " - Sala:" + getLocal().getSala() + "\nData de Cadastro:"+getDataDeCadastro()+" - Data de Depreciação:"+getDataDepreciacao()+ " - Defeito: Sem defeitos.\n";
    }

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

    public LocalDate getDataDeCadastro() {
        return this.dataDeCadastro;
    }

    public LocalDate getUltimaManutencao() {
        return this.ultimaManutencao;
    }

    public LocalDate getDataDepreciacao(){
        return this.dataDepreciacao;
    }



    //Setters da classe
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

    public void setDataDeCadastro(LocalDate dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public void setUltimaManutencao(LocalDate ultimaManutencao) {
        this.ultimaManutencao = ultimaManutencao;
    }

    public void setDataDepreciacao(LocalDate depreciacao){
        this.dataDepreciacao = depreciacao;
    }
}