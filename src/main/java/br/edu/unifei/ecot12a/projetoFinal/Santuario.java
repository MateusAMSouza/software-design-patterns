package br.edu.unifei.ecot12a.projetoFinal;

public class Santuario
{
	private String nome;
	private boolean fixo;
	private boolean destruido;
	private Altar altarSacrificio;
	private ArcaAlianca arca;
	private boolean possuiArca;
	
	
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public boolean isFixo()
	{
		return fixo;
	}
	public void setFixo(boolean fixo)
	{
		this.fixo = fixo;
	}
	public Altar getAltarSacrificio()
	{
		return altarSacrificio;
	}
	public void setAltarSacrificio(Altar altarSacrificio)
	{
		this.altarSacrificio = altarSacrificio;
	}
	public boolean isDestruido()
	{
		return destruido;
	}
	public void setDestruido(boolean destruido)
	{
		this.destruido = destruido;
	}
	public boolean isPossuiArca()
	{
		return possuiArca;
	}
	public void setPossuiArca()
	{
		if(arca.isNoSantuario())
		{
			this.possuiArca = true;
		}
		else
		{
			this.possuiArca = false;
		}
	}
	public ArcaAlianca getArca()
	{
		return arca;
	}
	public void setArca(ArcaAlianca arca)
	{
		this.arca = arca;
	}
}
