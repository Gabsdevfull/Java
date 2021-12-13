import java.util.Scanner;

public class Exer01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int vet[] = new int[5];
		int x = 0, maior = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		for (x = 0; x < 5; x++) {
			System.out.println("Digite um número");
			vet[x] = sc.nextInt();
		}
		for (x = 0; x < 5; x++) {
			System.out.println("Valor da posição" + vet[x]);
			if (vet[x] > maior) {
				maior=vet[x];
				
			}
		}System.out.println(maior);

	}

}
