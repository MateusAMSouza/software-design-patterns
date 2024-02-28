package br.edu.unifei.ecot12a.projetoFinal;

public class Estrangeiro extends Pessoa
{
	private String origem;
	
	public Estrangeiro(Ocupacao ocupacao)
	{
		super(ocupacao);
	}
	public String getOrigem()
	{
		return origem;
	}
	public void setOrigem(String origem)
	{
		this.origem = origem;
	}
}
