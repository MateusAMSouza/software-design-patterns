package br.edu.unifei.ecot12a.projetoFinal;

public class Rei implements Ocupacao {
	private int reinadoAnos;
	private Exercito exercito;
	
	public void atividade() {
		if(!exercito.isAcampado())
		{
			exercito.setAcampado(true);
			System.out.println("Convocou exercito.");
		}
		else
		{
			exercito.setAcampado(false);
			System.out.println("Dispensou exercito.");
		}
	}

	public int getReinadoAnos() {
		return reinadoAnos;
	}

	public void setReinadoAnos(int reinadoAnos) {
		this.reinadoAnos = reinadoAnos;
	}

	public Exercito getExercito() {
		return exercito;
	}

	public void setExercito(Exercito exercito) {
		this.exercito = exercito;
	}
}
