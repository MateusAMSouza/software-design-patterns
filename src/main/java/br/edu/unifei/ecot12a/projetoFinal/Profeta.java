package br.edu.unifei.ecot12a.projetoFinal;

public class Profeta implements Ocupacao
{
	private boolean mensagem = true;
	
	public void atividade()
	{
		if(this.hasMensagem())
		{
			System.out.println("Profecia declarada.");
		}
	}
	public boolean hasMensagem()
	{
		return mensagem;
	}
	public void setMensagem(boolean mensagem)
	{
		this.mensagem = mensagem;
	}
}
