
public class MaingContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria CB = new ContaBancaria();
		
		CB.setTipodaConta("CONTA CORRENTE");
		CB.setTipoCliente("UNICLASS");
		CB.setDataDeAbertura("14/12/21");
		CB.setSaldo(50000.00);
		
		System.out.println(CB.getTipodaConta());
		System.out.println(CB.getTipoCliente());
		System.out.println(CB.getDataDeAbertura());
		System.out.println(CB.getSaldo());

		
	}

}
