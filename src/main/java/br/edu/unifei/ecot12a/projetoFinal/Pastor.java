package br.edu.unifei.ecot12a.projetoFinal;

public class Pastor implements Ocupacao
{
	private int tamanhoRebanho;
	
	public void atividade()
	{
		System.out.println("Cuidando do rebanho de " + this.getTamanhoRebanho() + " cabecas.");
	}
	public int getTamanhoRebanho()
	{
		return tamanhoRebanho;
	}
	public void setTamanhoRebanho(int tamanhoRebanho)
	{
		this.tamanhoRebanho = tamanhoRebanho;
	}
}
