
public class Caneta {

	// ATRIBUTOS

	private String cor;
	private int carga;
	private double ponta;
	private boolean tampada;
	
	//METODO CONSTRUTOR
	
	public Caneta(String x, int y) {
		this.cor=x;
		this.carga=y;
	}

	// METODOS
	public void tampar() {
		tampada = true;
	}

	public void destampar() {
		tampada = false;
	}

	public void escrever() {
		if (tampada == true)
			System.out.println("ERRO!!! Caneta está tampada");
		else
			System.out.println("Escrevendo");
	}

	public void status() {
		System.out.println("A Caneta é" + this.cor);
		System.out.println("Está co a carga em: " + this.carga + "%");
		System.out.println("Está tampada?" +this.tampada);
		System.out.println("E tem a ponta com de " +this.ponta);

	}
	
	//METODOS GET E SET

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public double getPonta() {
		return ponta;
	}

	public void setPonta(double ponta) {
		this.ponta = ponta;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	
	//METODOS GETS E SETS
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}