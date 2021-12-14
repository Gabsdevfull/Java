
public class MainAviao {

	public static void main(String[] args) {
		
		Aviao A = new Aviao();
		
		A.setMotores("Biturbo");
		A.setAsas("Asas fixas");
		A.setTremdepouso("Trem de pouso com freios especiais");
		
		System.out.println(A.getMotores());
		System.out.println(A.getAsas());
		System.out.println(A.getTremdepouso());

	}

}
