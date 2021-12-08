import java.util.Scanner;

public class exer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double h, m, s;
		System.out.println("Informe o número de segundos");
		s=sc.nextDouble();
		h=s/3600;
		System.out.println("Escreva o tempo em horas");
		h=sc.nextDouble();
		m=60*h;
		System.out.println("Tempo em m:" +m);
		System.out.println("Tempo em s:" +s);
		
			
	}

}
