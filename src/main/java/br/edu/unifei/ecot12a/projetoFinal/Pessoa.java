package br.edu.unifei.ecot12a.projetoFinal;

import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa
{
	private String nome;
	private int idade;
	private String sexo;
	private Ocupacao ocupacao;
	private List<Oferta> ofertas = 
			new ArrayList<Oferta>();
	
	public Pessoa(Ocupacao ocupacao)
	{
		this.ocupacao = ocupacao;
	}
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public int getIdade()
	{
		return idade;
	}
	public void setIdade(int idade)
	{
		this.idade = idade;
	}
	public String getSexo()
	{
		return sexo;
	}
	public void setSexo(String sexo)
	{
		this.sexo = sexo;
	}
	public List<Oferta> getOfertas()
	{
		return ofertas;
	}
	public void setOfertas(List<Oferta> ofertas)
	{
		this.ofertas = ofertas;
	}
	public Ocupacao getOcupacao() {
		return ocupacao;
	}
}
