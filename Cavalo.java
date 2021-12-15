package AtividadeHeranca;

public class Cavalo extends Animal {
	
	Cavalo c = new Cavalo();
	
	public void correr () {
		System.out.println("Cavalo Correndo... ");
	}
	
	public void emitirsom() {
		System.out.println(" IRRIIIN!");
	}

	public Cavalo getC() {
		return c;
	}

	public void setC(Cavalo c) {
		this.c = c;
	}

}
