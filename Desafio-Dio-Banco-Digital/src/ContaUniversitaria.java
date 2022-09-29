
public class ContaUniversitaria extends Conta{

	public ContaUniversitaria(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println(" === Extrato Conta Universitária === ");
		super.imprimirInfosComuns();
	}

	@Override
	public void sacar(double valor) {
		if(valor <= 600) {
			super.sacar(valor);
		} else {
			System.out.println("Valor limite de saque ultrapassado\n");
		}
	}
}
