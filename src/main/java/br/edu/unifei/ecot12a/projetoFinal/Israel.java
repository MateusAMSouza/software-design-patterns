package br.edu.unifei.ecot12a.projetoFinal;

public class Israel implements Local
{
	private static boolean noSantuario = true;
	
	public void inverter(ArcaAlianca arca)
	{
		arca.setLocal(new OutroLugar());
		arca.setSantuario(noSantuario);
	}

	public boolean isNoSantuario()
	{
		return noSantuario;
	}

	public void setNoSantuario(boolean noSantuario)
	{
		this.noSantuario = noSantuario;
	}
}
