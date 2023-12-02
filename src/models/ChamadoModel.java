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
	
	public getNomeChamado() {
		return nomeChamado;
	}
	public getTipoChamado() {
		return tipoChamado;
	}
	public getDiscricaoChamado() {
		return discricaoChamado;
	}
	public setNomeChamado(String nomeChamado) {
		this.nomeChamado = nomeChamado;
	}
	public setTipoChamado(String tipoChamado) {
		this.tipoChamado = tipoChamado;
	}
	public setDiscricaoChamado(String discricaoChamado) {
		this.discricaoChamado = discricaoChamado;
	}
}
