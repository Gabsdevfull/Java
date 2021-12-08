import java.util.Scanner;

public class exer06 {

	public static void main(String[] args) {
		@SuppressWarnings({ "unused", "resource" })
		Scanner sc = new Scanner(System.in);
		int x1, x2, y1, y2, d;
		double p1;
		double p2;
		
		System.out.println("Digite x1");
		x1=sc.nextInt();
		System.out.println("Digite x2");
		x2=sc.nextInt();
		System.out.println("Digite y1");
		y1=sc.nextInt();
		System.out.println("Digite y2");
		y2=sc.nextInt();
		
		p1=Math.pow(x2-x1, 2.0);
		p2=Math.pow(y2-y1, 2.0);
		
		d=(int) (p1+p2);
		
		System.out.println("O valor de D é:" + d);
		
		
	}

}
