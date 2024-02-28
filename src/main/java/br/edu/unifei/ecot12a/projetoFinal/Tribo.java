package br.edu.unifei.ecot12a.projetoFinal;

import java.util.ArrayList;
import java.util.List;

public class Tribo
{
	private String nome;
	private int tamanho;
	private String territorio;
	private List<Cidade> cidades =
			new ArrayList<Cidade>();
	
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public int getTamanho()
	{
		return tamanho;
	}
	public void setTamanho(int tamanho)
	{
		this.tamanho = tamanho;
	}
	public String getTerritorio()
	{
		return territorio;
	}
	public void setTerritorio(String territorio)
	{
		this.territorio = territorio;
	}
	public List<Cidade> getCidades()
	{
		return cidades;
	}
	public void setCidades(List<Cidade> cidades)
	{
		this.cidades = cidades;
	}
}
