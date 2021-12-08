import java.util.Scanner;

public class exer05 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, m;
		
		System.out.println("Insira a primeira nota: ");
		n1=sc.nextInt();
		System.out.println("Insira a segunda nota: ");
		n2=sc.nextInt();
		System.out.println("Insira a terceira nota: ");
		n3=sc.nextInt();
		m= n1 + n2 + n3 / 3;
		System.out.println("A média é : " + m);
		

	}

}
