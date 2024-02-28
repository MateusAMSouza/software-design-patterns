package br.edu.unifei.ecot12a.projetoFinal;

public class App {

	public static void main(String[] args) {
		ArcaAlianca arca = ArcaAlianca.getInstancia();
		
		Rei reiFilisteu = new Rei();
		Estrangeiro aquis = new Estrangeiro(reiFilisteu);
		aquis.setSexo("Masculino");
		aquis.setOrigem("Filisteu");
		
		OutroLugar asdode = new OutroLugar();
		asdode.setNome("Asdode");
		arca.setLocal(asdode);
		
		Altar altarJerusalem = new Altar();
		altarJerusalem.setLocal("Jerusalem");
		
		Santuario tenda = new Santuario();
		tenda.setNome("Tenda de Davi");
		tenda.setFixo(true);
		tenda.setDestruido(false);
		tenda.setAltarSacrificio(altarJerusalem);
		
		System.out.println("Local da Arca da Alianca:");
		
		System.out.println(arca.getLocal());
		if(!arca.isNoSantuario())
		{
			System.out.println("A Arca nao esta na " + tenda.getNome() + "\n");
		}
		
		
		Cidade jerusalem = new Cidade();
		jerusalem.setNome("Jerusalem");
		jerusalem.setCapital(true);
		jerusalem.setAltar(altarJerusalem);
		
		Tribo juda = new Tribo();
		juda.setNome("Juda");
		juda.setTamanho(470000);
		juda.setTerritorio("Sul");
		
		Rei rei = new Rei();
		Pessoa davi = new Israelita(rei, juda);
		davi.setNome("Davi");
		davi.setSexo("Masculino");
		davi.setIdade(38);
		rei.setReinadoAnos(40);
		
		Exercito exercito = new Exercito();
		exercito.getTribos().add(juda);
		exercito.setArca(arca);
	
		System.out.println("O Rei " + davi.getNome());
	
		rei.setExercito(exercito);
		rei.atividade();
		
		exercito.trazArca(); //da new na classe Israel
		
		System.out.println("O Exercito levou a Arca da Alianca\n");
		
		System.out.println("Local da Arca da Alianca: ");
		
		System.out.println(arca.getLocal());
		if(!arca.isNoSantuario())
		{
			System.out.println("A Arca esta em " + asdode.getNome() + "\n");
		}	
		else
		{
			System.out.println("A Arca esta na " + tenda.getNome() + "\n");
		}
		
		rei.atividade();
		
		Pastor pastor = new Pastor();
		Pessoa jesse = new Israelita(pastor, juda);
		jesse.setNome("Jesse");
		jesse.setSexo("Masculino");
		pastor.setTamanhoRebanho(80);
		
		System.out.println("\n" + jesse.getNome() + " eh um " + jesse.getOcupacao());
		pastor.atividade();
		
		Tribo efraim = new Tribo();
		efraim.setNome("Efraim");
		efraim.setTamanho(400000);
		efraim.setTerritorio("Oeste do Jordao");
		exercito.getTribos().add(efraim);
		
		Profeta profetaSamuel = new Profeta();
		Pessoa samuel = new Israelita(profetaSamuel, efraim);
		samuel.setNome("Samuel");
		samuel.setSexo("Masculino");
		profetaSamuel.setMensagem(false);
		
		System.out.println("\n" + samuel.getNome() + " eh um " + samuel.getOcupacao());
		
		Livro primeiroSamuel = new Livro();
		primeiroSamuel.setTitulo("1Samuel");
		primeiroSamuel.setProposito("Registro Historico");
		primeiroSamuel.setAutor(profetaSamuel);	
		
		System.out.println("Escreveu livro " + primeiroSamuel.getTitulo() + " com proposito de " + primeiroSamuel.getProposito() + "\n");
		
		Tribo levi = new Tribo();
		levi.setNome("Levi");
		
		Sacerdote sumoSacerdote = new Sacerdote();
		Pessoa abiatar = new Israelita(sumoSacerdote, levi);
		abiatar.setNome("Abiatar");
		abiatar.setSexo("Masculino");
		sumoSacerdote.setSumoSacerdote(true);
		sumoSacerdote.setAltar(altarJerusalem);
		
		System.out.println(abiatar.getNome() + " eh um " + abiatar.getOcupacao());
		
		sumoSacerdote.atividade();
		
		Festa trombetas = new Festa();
		trombetas.setNome("Festa das Trombetas");
		trombetas.setDuracaoDias(1);
		trombetas.setMotivo("Ano-Novo");
		trombetas.setMes("Tisri");
		
		Oferta graos = new Oferta();
		graos.setProposito(propositoEnum.Comunhao);
		graos.setTipo(tipoEnum.Cereal);
		
		davi.getOfertas().add(graos);
		
		Sacrificio sacrificioComunhao = new Sacrificio();
		sacrificioComunhao.realizaSacrificio("Jerusalem", davi, "Abiatar");
		
		trombetas.getSacrificios().add(sacrificioComunhao);
		
		System.out.println(trombetas.getSacrificios());
		
		Sacrificio sacrificio2 = new Sacrificio();
		sacrificio2.realizaSacrificio("Jerusalem", davi, "Abiatar");
	}

}
