
public class MainProdutoEletronico {

	public static void main(String[] args) {

		ProdutoEletronico PE = new ProdutoEletronico();
		
		PE.setInformatica("Desktop, Notebook, Periféricos");
		PE.setGames("Playstation, Xbox, Jogos PS, Jogos Xbox");
		PE.setEletroeletronicos("Tv Lcd, Home Teacher, Micro System, ");
		PE.setEletrodomesticos("Fogão, geladeira, Maquina de lava, aspirador");
		
		System.out.println(PE.getInformatica() + PE.getGames() + PE.getEletroeletronicos() + PE.getEletrodomesticos());
		
	}

}


