
import java.util.Scanner;

public class Exer001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
	
	
		int number1;
		int number2;
		int number3;
		
		
        int maior=0;
		
		
		System.out.print("Digite o primeiro n�mero:   \n");
		number1 = input.nextInt();
		
		System.out.print("Digite o segundo n�mero:    \n");
		number2 = input.nextInt();
		
		System.out.print("Digite o terceiro n�mero:   \n");
		number3 = input.nextInt();
		
       if (number1 > number2)
    	   maior = number1;
       
       else if (number2 > number3)
    	   maior = number2;
       
       
       else if(number3 > maior)
    	   System.out.printf("O n�mero maior �: %d", number3);
		
		
	}

}