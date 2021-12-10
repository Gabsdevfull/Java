import java.util.Scanner;

public class Exer06 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int num, soma=0;
		double media=0, cont=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		num = sc.nextInt();
		if(num %3==0 && num!=0) {
			soma=soma+num;
			cont++;
		}
		while(num!=0) {
			System.out.println("Digite um número inteiro: ");
			num = sc.nextInt();
		}if(num %3==0 && num!=0) 
		 { 
			 soma=soma+num; 
			 cont++; 
		     media=soma/cont;}
		
		System.out.println("A media dos números é: " + media);

	}

}
