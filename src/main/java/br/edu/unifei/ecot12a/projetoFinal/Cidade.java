package br.edu.unifei.ecot12a.projetoFinal;

public class Cidade
{
	private String nome;
	private boolean capital;
	private Altar altar;
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public Altar getAltar()
	{
		return altar;
	}
	public void setAltar(Altar altar)
	{
		this.altar = altar;
	}
	public boolean isCapital() {
		return capital;
	}
	public void setCapital(boolean capital) {
		this.capital = capital;
	}
}
