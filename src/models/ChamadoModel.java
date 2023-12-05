package models;

public class ChamadoModel {

	private String nomeChamado;
	private String tipoChamado;
	private String discricaoChamado;
	
	public ChamadoModel(String nomeChamado, String tipoChamado, String discricaoChamado) {
		this.nomeChamado = nomeChamado;
		this.tipoChamado = tipoChamado;
		this.discricaoChamado = discricaoChamado;
	}
	public ChamadoModel() {
		this.nomeChamado = null;
		this.tipoChamado = null;
		this.discricaoChamado = null;
	}
	
	public String getNomeChamado() {
		return nomeChamado;
	}
	public String getTipoChamado() {
		return tipoChamado;
	}
	public String getDiscricaoChamado() {
		return discricaoChamado;
	}
	public void setNomeChamado(String nomeChamado) {
		this.nomeChamado = nomeChamado;
	}
	public void setTipoChamado(String tipoChamado) {
		this.tipoChamado = tipoChamado;
	}
	public void setDiscricaoChamado(String discricaoChamado) {
		this.discricaoChamado = discricaoChamado;
	}
}
