import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int numero = 0, soma = 0;

		do {
			System.out.println("Digite um número: ");
			numero = sc.nextInt();
			soma = soma + numero;
		} while (numero != 0);

		System.out.println(soma);

	}

}
