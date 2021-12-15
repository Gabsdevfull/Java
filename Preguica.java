package AtividadeHeranca;

public class Preguica extends Animal {
	
	Preguica p = new Preguica();
	
	public void subir() {
		System.out.println("Preguica subindo...");
	}
	
	public void emitirSom() {
	System.out.println("ZZZZZZZZZZZ");
}

	public Preguica getP() {
		return p;
	}

	public void setP(Preguica p) {
		this.p = p;
	}
}



