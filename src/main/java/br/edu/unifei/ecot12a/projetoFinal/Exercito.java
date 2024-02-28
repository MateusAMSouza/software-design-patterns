package br.edu.unifei.ecot12a.projetoFinal;

import java.util.ArrayList;
import java.util.List;

public class Exercito
{
	private boolean acampado = false;
	private ArcaAlianca arca;
	private List<Tribo> tribos = 
			new ArrayList<Tribo>();
	
	public void trazArca()
	{
		arca.mudarLocal();
		arca.setSantuario(!arca.isNoSantuario());
	}
	public boolean isAcampado() {
		return acampado;
	}
	public void setAcampado(boolean acampado) {
		this.acampado = acampado;
	}
	public ArcaAlianca getArca() {
		return arca;
	}
	public void setArca(ArcaAlianca arca) {
		this.arca = arca;
	}
	public List<Tribo> getTribos() {
		return tribos;
	}
	public void setTribos(List<Tribo> tribos) {
		this.tribos = tribos;
	}
}
