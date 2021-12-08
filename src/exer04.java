import java.util.Scanner;

public class exer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double a, b, c, s, d, r;
		
		System.out.println("Insira A");
		a=sc.nextDouble();
		System.out.println("Insira B");
		b=sc.nextDouble();
		System.out.println("Insira C");
		c=sc.nextDouble();
		r=Math.pow(a+b, 2.0);
		s=Math.pow(b+c, 2.0);
		d=(r+s)/2;
		System.out.println("O vaor de D: " +d);
	}

}
