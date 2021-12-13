import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {

		int mat[][] = new int[3][3];
		int l, c, soma = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		for (l = 0; l < 3; l++) {
			for (c = 0; c < 3; c++) {
				System.out.println("Digite um número: ");
				mat[l][c] = sc.nextInt();
				soma += mat[l][c];
			}
		}
		for (l = 0; l < 3; l++) {
			for (c = 0; c < 3; c++) {
				System.out.print(mat[l][c] + "\t");
			}
		}
		System.out.println();
		System.out.println("\n A soma é: " + soma);

	}
}
