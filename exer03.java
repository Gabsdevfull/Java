import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		@SuppressWarnings({ "unused", "resource" })
		Scanner sc = new Scanner(System.in);
		int idade;
		@SuppressWarnings("unused")
		String categoria;

		System.out.println("Digite sua idade :");
		idade = sc.nextInt();

		if (idade >= 5 && idade < 8)
			categoria = "Infantil A";
		else if (idade >= 8 && idade < 12)
			categoria = "Infantil B";
		else if (idade >= 12 && idade < 14)
			categoria = "Juvenil A";
		else if (idade >= 14 && idade < 18)
			categoria = "Juvenil B";
		else
			categoria = "Adultos";

		System.out.println("A categoria é: " + categoria);

	}

}
