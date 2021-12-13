import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Double[] vet = new Double[10];
		double media = 0.0, soma = 0.0;
		int cont, maior = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		for (cont = 0; cont < 10; cont++) {
			System.out.println("Digite o valor do dado: ");
			vet[cont] = sc.nextDouble();
			if (vet[cont] == 6) {
				maior++;
				media = soma / 10;
				System.out.println("A média é :" + media);
				System.out.println("A maior pontuação ocorreu em" + maior);

			}

		}

	}

}
