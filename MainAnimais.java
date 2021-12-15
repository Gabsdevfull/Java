package AtividadeHeranca;

public class MainAnimais {

	public static void main(String[] args) {

		Cachorro ca = new Cachorro();
		Cavalo c = new Cavalo();
		Preguica p = new Preguica();
		
		ca.correr();
		ca.emitirsom();
		ca.setIdade("3");
		ca.setNome("Snoop");
		
	    c.setIdade("10");
		c.setNome("Pé de pano");
		c.emitirsom();
		c.correr();
		
		p.setIdade("5");
		p.setNome("Mr sono");
		p.subir();
		p.emitirSom();
	
	
	}

	}


