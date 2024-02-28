package br.edu.unifei.ecot12a.projetoFinal;

public class Livro
{
	private String titulo;
	private String proposito;
	private Profeta autor;
	
	public String getTitulo()
	{
		return titulo;
	}
	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}
	public String getProposito()
	{
		return proposito;
	}
	public void setProposito(String proposito)
	{
		this.proposito = proposito;
	}
	public Profeta getAutor()
	{
		return autor;
	}
	public void setAutor(Profeta autor)
	{
		this.autor = autor;
	}
}
