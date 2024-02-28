package br.edu.unifei.ecot12a.projetoFinal;

public class Oferta
{
	private propositoEnum proposito;
	private tipoEnum tipo;
	
	public propositoEnum getProposito()
	{
		return proposito;
	}
	public void setProposito(propositoEnum proposito)
	{
		this.proposito = proposito;
	}
	public tipoEnum getTipo()
	{
		return tipo;
	}
	public void setTipo(tipoEnum tipo)
	{
		this.tipo = tipo;
	}
}
