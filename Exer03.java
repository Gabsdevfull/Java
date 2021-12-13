import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		int n1[][] = new int[4][6];
		int n2[][] = new int[4][6];
		int m1[][] = new int[4][6];
		int m2[][] = new int[4][6];
		int l, c;

		@SuppressWarnings({ "unused", "resource" })
		Scanner sc = new Scanner(System.in);

		for (l = 0; l < 6; l++) {
			for (c = 0; c < 6; c++) {
				System.out.println("Digite o valor da linha N1: ");
				n1[l][c] = sc.nextInt();
			}
		}
		for (l = 0; l < 6; l++) {
			for (c = 0; c < 6; c++) {
				System.out.println("Digite o valor da linha N2: ");
				n2[l][c] = sc.nextInt();
			}

			System.out.println("A soma das matrizes N1 e N2: ");
			for (l = 0; l < 6; l++) {
				for (c = 0; c < 6; c++) {
					m1[l][c] = n1[l][c] + n2[l][c];
					System.out.println("[" + m1[l][c] + "]");
				}
			}
			for (l = 0; l < 6; l++) {
				for (c = 0; c < 6; c++) {
					m2[l][c] = n1[l][c] - n2[l][c];
					System.out.println("[" + m2[l][c] + "]");
				}
			}
		}
	}
}
