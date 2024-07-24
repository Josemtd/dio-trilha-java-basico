import java.util.List;
import java.util.ArrayList;
import lombok.Data;

@Data
public class Banco {
	
	private List<Conta> listaContas = new ArrayList<>();
	
	public void adicionarConta(Conta conta) {
		listaContas.add(conta);
	}
	
	public void exibirContasDoCliente(Cliente cliente) {
		System.out.println("Contas do Cliente: " + cliente.getNome());
		for(Conta conta : listaContas) {
			if(conta.getCliente().equals(cliente)) {
				conta.imprimirInfoComuns();
				System.out.println();
			}
		}
	}

}
