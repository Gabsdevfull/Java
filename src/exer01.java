import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, m, d, idade;

		System.out.println("Escreva sua idade em anos");
		a = sc.nextInt();
		System.out.println("Escreva sua idade em meses");
		m = sc.nextInt();
		System.out.println("Escreva sua idade em dias");
		d = sc.nextInt();
		idade = a * 365;
		System.out.println("Sua Idade em dias é:" + idade);

	}

}
