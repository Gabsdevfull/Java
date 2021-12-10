import java.util.Scanner;

public class Exer04 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cont_calmas = 0;
		int cont_nervosonas = 0;
		int cont_badboys = 0;
		int cont_teens_calminhos = 0;
		int cont_coroas = 0;
		int total_pessoas = 0;
		int idade;
		char sexo;
		char caracteristica;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		for (total_pessoas = 0; total_pessoas < 150; total_pessoas++)
			;
		{
			System.out.println("Obtendo dados da pessoa " + total_pessoas + 1);
			System.out.println("Informe sua idade");
			idade = sc.nextInt();
			System.out.println("Informe sexo (M)asculino ou (F)eminino");
			sexo = sc.nextLine().charAt(0);
			System.out.println(" Informa a Caracterista Calma, Nervosa, Agressiva");
			caracteristica = sc.nextLine().charAt(0);

			if (caracteristica == 'C')
				;
			{
				cont_calmas++;
				if (sexo == 'F' && caracteristica == 'N')
					;
				{
					cont_nervosonas++;
					if (idade > 40)
						;
					{
						cont_coroas++;
						if (sexo == 'M' && caracteristica == 'A')
							;
						{
							cont_badboys++;
							if (caracteristica == 'C' && idade < 18)
								;
							{
								cont_teens_calminhos++;
							}
						}
						System.out.println("Total de pessoas calmas: " + cont_calmas);
						System.out.println("Total de coroas nervosas: " + cont_nervosonas);
						System.out.println("Total de Badboys " + cont_badboys);
						System.out.println("Total de Jovens Bananas calminhos" + cont_teens_calminhos);
						System.out.println("Total de mulheres nervosas" + cont_coroas);

					}

				}
			}

		}

	}

	private static Object charAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
