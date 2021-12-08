import java.util.Scanner;

public class exer08 {

	public static void main(String[] args) {
		@SuppressWarnings({ "unused", "resource" })
		Scanner sc = new Scanner(System.in);
		double carroNovo, custoFabricacao, distribuidor, imposto, distribuidorEimposto1, distribuidorEimposto2, distribuidorEimpostoFinal;
		
		System.out.println("Qual é o custo de Fabrica? ");
		custoFabricacao=sc.nextDouble();
		
		imposto = 0.45;
		distribuidor = 0.25;
		
		distribuidorEimposto1 = custoFabricacao * imposto;

	    distribuidorEimposto2 = custoFabricacao * distribuidor;

	    distribuidorEimpostoFinal = distribuidorEimposto1 + distribuidorEimposto2;

	    carroNovo = distribuidorEimpostoFinal+custoFabricacao;
	    
	    System.out.println("Esse é o custo do consumidor " + carroNovo);
		
		

	}

}
