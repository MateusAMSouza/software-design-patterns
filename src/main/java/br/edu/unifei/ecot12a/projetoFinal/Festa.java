package br.edu.unifei.ecot12a.projetoFinal;

import java.util.ArrayList;
import java.util.List;

public class Festa
{
	private String nome;
	private String mes;
	private int duracaoDias;
	private String motivo;
	private List<Sacrificio> sacrificios = 
			new ArrayList<Sacrificio>();
	
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getMes()
	{
		return mes;
	}
	public void setMes(String mes)
	{
		this.mes = mes;
	}
	public int getDuracaoDias()
	{
		return duracaoDias;
	}
	public void setDuracaoDias(int duracaoDias)
	{
		this.duracaoDias = duracaoDias;
	}
	public String getMotivo()
	{
		return motivo;
	}
	public void setMotivo(String motivo)
	{
		this.motivo = motivo;
	}
	public List<Sacrificio> getSacrificios()
	{
		return sacrificios;
	}
	public void setSacrificios(List<Sacrificio> sacrificios)
	{
		this.sacrificios = sacrificios;
	}	
}
