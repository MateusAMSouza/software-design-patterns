package br.edu.unifei.ecot12a.projetoFinal;

public class Sacerdote implements Ocupacao
{
	private boolean sumoSacerdote;
	private Altar altar;
	
	public void atividade()
	{
		System.out.println("Cuidando do altar de " + altar.getLocal()+" .");
	}

	public boolean isSumoSacerdote()
	{
		return sumoSacerdote;
	}

	public void setSumoSacerdote(boolean sumoSacerdote)
	{
		this.sumoSacerdote = sumoSacerdote;
	}

	public Altar getAltar()
	{
		return altar;
	}

	public void setAltar(Altar altar)
	{
		this.altar = altar;
	}
}
