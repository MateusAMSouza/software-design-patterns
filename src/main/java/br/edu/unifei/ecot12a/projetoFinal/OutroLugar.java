package br.edu.unifei.ecot12a.projetoFinal;

public class OutroLugar implements Local
{
	private String nome;
	public void inverter(ArcaAlianca arca)
	{
		arca.setLocal(new Israel());
		arca.setSantuario(false);
	}
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
}
