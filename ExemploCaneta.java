
public class ExemploCaneta {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta("Vermelho", 100);
		//c1.cor = "Azul";
		//c1.ponta = 0.5;
		//c1.carga = 90;
		
		c1.setCor("Azul");
		
		c1.tampar();
		c1.status();
		c1.escrever();
		
		System.out.println("A cor da Caneta é: " +c1.getCor());
		
		Caneta c2 = new Caneta("Dourada", 80);
		//c2.cor = "Rosa";
		//c2.ponta = 2.0;
		//c2.carga = 75;
		c2.destampar();
		c2.status();
		c2.escrever();

	}

}
