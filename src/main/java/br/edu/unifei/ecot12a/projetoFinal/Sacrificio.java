package br.edu.unifei.ecot12a.projetoFinal;

public class Sacrificio
{
	public void realizaSacrificio(String lugar, Pessoa pessoa, String nomeSacerdote)
	{
		Altar a = new Altar();
		a.setLocal(lugar); 
		
		Tribo levi = new Tribo();
		levi.setNome("Levi");
		
		Sacerdote sacerdote = new Sacerdote();
		Pessoa p = new Israelita(sacerdote, levi);
		p.setNome(nomeSacerdote);
		
		if(pessoa.getOfertas().isEmpty())
		{
			System.out.println(pessoa.getNome() + " nao possui ofertas");
		}
		else
		{
			System.out.println("Sacerdote " + p.getNome() + " realizou o sacrificio de "
								+ pessoa.getOfertas().get(0).getProposito() + " com "
								+ pessoa.getOfertas().get(0).getTipo() + 
								" ofertado por " + pessoa.getNome() + " no altar em " + a.getLocal());
			pessoa.getOfertas().remove(0);
			
		}
	}
}
