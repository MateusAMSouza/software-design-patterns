package br.edu.unifei.ecot12a.projetoFinal;

public class Israelita extends Pessoa {
	private String familia;
	private Tribo tribo;
	
	public Israelita(Ocupacao ocupacao, Tribo tribo)
	{
		super(ocupacao);
		this.tribo = tribo;
	}
	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	public Tribo getTribo() {
		return tribo;
	}
	public void setTribo(Tribo tribo) {
		this.tribo = tribo;
	}
	
}
