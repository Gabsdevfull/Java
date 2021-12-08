import java.util.Scanner;

public class exer02 {

	public static void main(String[] args) {
		
	   
	    @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
	     
	    
	    System.out.print("Quantidade de anos: ");
	    int anos = Integer.parseInt(entrada.nextLine());
	     
	  
	    System.out.print("Quantidade de meses: ");
	    int meses = Integer.parseInt(entrada.nextLine());
	     
	  
	    System.out.print("Quantidade de dias: ");
	    int dias = Integer.parseInt(entrada.nextLine());

	    int quant_dias = (anos * 365) + (meses * 30) + dias;
	     
	    System.out.println("Idade em dias: " + quant_dias);

}
}