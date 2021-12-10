import java.util.Scanner;

public class Exer03 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		int idade=0, menor=0, maior=0;
		
		Scanner sc = new Scanner(System.in);
		
	while(idade>=-99) 
	{
		System.out.println("Informe sua idade em anos inteiros");
		idade=sc.nextInt();
	}
	
		
		if(idade<21);{
			menor=menor+1;
			System.out.println("Total de Idade menores que 21" +menor);
		}
	
		if(idade>50);{
			maior=maior+1;
			System.out.println("Total de Idade maiores que 50" +maior);
		}
		


	}

}
