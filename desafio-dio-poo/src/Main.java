<<<<<<< HEAD
import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
=======
>>>>>>> 12febd40ab3409d5396cc2b8bec043e2e8e315fb

public class Main {

	public static void main(String[] args) {
<<<<<<< HEAD
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descricao curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
				
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev1 = new Dev();
		dev1.setNome("Developer1");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Dev1: " + dev1.getConteudosInscritos());
		dev1.progredirBootcamp();
		System.out.println("--");
		System.out.println("Conteúdos Inscritos Dev1: " + dev1.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Dev1: " + dev1.getConteudosConcluidos());
		System.out.println("XP: " + dev1.calcularTotalXp());
		
		System.out.println("---------");
		
		Dev dev2 = new Dev();
		dev2.setNome("Developer2");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Dev2: " + dev2.getConteudosInscritos());
		dev2.progredirBootcamp();
		System.out.println("--");
		System.out.println("Conteúdos Inscritos Dev2: " + dev2.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Dev2: " + dev2.getConteudosConcluidos());
		System.out.println("XP: " + dev2.calcularTotalXp());
		
=======
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
>>>>>>> 12febd40ab3409d5396cc2b8bec043e2e8e315fb
	}

}
