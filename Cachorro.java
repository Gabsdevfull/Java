package AtividadeHeranca;

public class Cachorro extends Animal {
	
	Cachorro ca = new Cachorro();
	
	public void correr() {
		System.out.println("Cachorro correndo... ");
		
	}
	public void emitirsom() {
		
		System.out.println("AU AU AU! ");
		
	}
	public Cachorro getCa() {
		return ca;
	}
	public void setCa(Cachorro ca) {
		this.ca = ca;
	}
}
