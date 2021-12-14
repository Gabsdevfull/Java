
public class ContaBancaria {

	private String TipodaConta;
	private String TipoCliente;
	private String DataDeAbertura;
	private Double Saldo;
	
	
	public String getTipodaConta() {
		return TipodaConta;
	}
	public void setTipodaConta(String tipodaConta) {
		TipodaConta = tipodaConta;
	}
	public String getTipoCliente() {
		return TipoCliente;
	}
	public void setTipoCliente(String tipoCliente) {
		TipoCliente = tipoCliente;
	}
	public String getDataDeAbertura() {
		return DataDeAbertura;
	}
	public void setDataDeAbertura(String dataDeAbertura) {
		DataDeAbertura = dataDeAbertura;
	}
	public Double getSaldo() {
		return Saldo;
	}
	public void setSaldo(Double saldo) {
		Saldo = saldo;
	}
	public String sacar(double valor) {
		if(valor<Saldo) {
			Saldo = Saldo - valor;
			return "Saquel Realizado";
		}else {
			return "Saldo Insuficiente";
		}
	}public double depositar(double valor) {
		Saldo = Saldo + valor;
		return Saldo;
	}
}
