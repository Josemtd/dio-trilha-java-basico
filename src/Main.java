
public class Main {

	public static void main(String[] args) {
		Cliente alice = new Cliente();
		alice.setNome("Alice");
		
		Conta contaCCAlice = new ContaCorrente(alice);
		Conta contaPPAlice = new ContaPoupanca(alice);
		
		Banco banco = new Banco();
		banco.adicionarConta(contaCCAlice);
		banco.adicionarConta(contaPPAlice);
		banco.exibirContasDoCliente(alice);
		
		contaCCAlice.depositar(100);
		contaCCAlice.transferir(100, contaPPAlice);
		banco.exibirContasDoCliente(alice);
		
		contaCCAlice.imprimirExtrato();
		contaPPAlice.imprimirExtrato();
	}

}
