
public class Main {

	public static void main(String[] args) {
		
		Cliente cesar = new Cliente();
		cesar.setNome("Antonio Cesar");
		
		Conta cCorent = new ContaCorrente(cesar);
		cCorent.depositar(100);
		
		Conta cPoup = new ContaPoupanca(cesar);
		cCorent.transferir(100, cPoup);
		
		Conta cUni = new ContaUniversitaria(cesar);
		cUni.depositar(1000);
		cUni.sacar(800);
		
		cCorent.imprimirExtrato();
		cPoup.imprimirExtrato();
		cUni.imprimirExtrato();
		
	}

}
