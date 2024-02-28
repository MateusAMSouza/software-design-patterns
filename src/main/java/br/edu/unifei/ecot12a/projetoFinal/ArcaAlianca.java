package br.edu.unifei.ecot12a.projetoFinal;

public class ArcaAlianca
{
	private final boolean elementos = true;
	private static ArcaAlianca instancia =
			new ArcaAlianca();
	private ArcaAlianca() {};
	private Local local;
	private boolean noSantuario;
	
	public void mudarLocal()
	{
		local.inverter(this);
	}
	public static ArcaAlianca getInstancia()
	{
		return instancia;
	}
	public boolean isElementos()
	{
		return elementos;
	}
	public static void setInstancia(ArcaAlianca instancia)
	{
		ArcaAlianca.instancia = instancia;
	}
	public Local getLocal()
	{
		return local;
	}
	public void setLocal(Local local)
	{
		this.local = local;
	}
	public boolean isNoSantuario()
	{
		return noSantuario;
	}
	public void setSantuario(boolean noSantuario)
	{
		this.noSantuario = noSantuario;
	}
}
