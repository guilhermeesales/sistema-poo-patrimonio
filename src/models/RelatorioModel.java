package models;

import java.time.LocalDate;

public class RelatorioModel {
    private String nomeDocumento;
    private LocalDate dataGerada = LocalDate.now();
    private int codRelatorio;

    public String getNomeDocumento() {
        return nomeDocumento;
    }

    public void setNomeDocumento(String nomeDocumento) {
        this.nomeDocumento = nomeDocumento;
    }

    public LocalDate getDataGerada() {
        return dataGerada;
    }

    public void setDataGerada(LocalDate dataGerada) {
        this.dataGerada = dataGerada;
    }

    public int getCodRelatorio() {
        return codRelatorio;
    }

    public void setCodRelatorio(int codRelatorio) {
        this.codRelatorio = codRelatorio;
    }
}
