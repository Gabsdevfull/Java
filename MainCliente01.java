
public class MainCliente01 {

	public static void main(String[] args) {
		
		Cliente01 C = new Cliente01();
		
		C.setNome("Gabriel");
		C.setEndere�o("Av Rio Pequeno");
		C.setIdade(26);
		C.setSexo("Masculino");
		
		
		System.out.println(C.getNome());
		System.out.println(C.getEndere�o());
		System.out.println(C.getSexo());
		System.out.println(C.getIdade());
		
	}

}

