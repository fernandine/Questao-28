package aplicacao;

import entidade.Gerente;
import entidade.Supervisor;
import entidade.Vendedor;

public class Programa {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();

		System.out.println("********GERENTE************");

		gerente.setNome("Luiz");
		System.out.println("Nome: " + gerente.getNome());
		gerente.setIdade(32);
		System.out.println("Idade: " + gerente.getIdade());
		gerente.setSalario(1500);
		System.out.println("Salario: R$" + String.format("%.2f", gerente.getSalario()));
		gerente.setGrauInstrucao(4);
		System.out.println("Grau de instrucao: " + gerente.getGrauInstrucao());
		System.out.println("Bonificação: R$" + String.format("%.2f", gerente.bonificacao()));
		System.out.println();

		System.out.println("********SUPERVISOR************");

		Supervisor supervisor = new Supervisor();

		supervisor.setNome("Paulo");
		System.out.println("Nome: " + supervisor.getNome());
		supervisor.setIdade(38);
		System.out.println("Idade: " + supervisor.getNome());
		supervisor.setSalario(6580);
		System.out.println("Salario: R$" + String.format("%.2f", supervisor.getSalario()));
		supervisor.setGrauInstrucao(2);
		System.out.println("Grau de Instrucao: " + supervisor.getGrauInstrucao());
		supervisor.bonificacao();
		System.out.println("Bonificação: R$" + String.format("%.2f", supervisor.bonificacao()));

		System.out.println("********VENDEDOR************");

		Vendedor vendedor = new Vendedor();

		vendedor.setNome("Maria");
		System.out.println("Nome: " + vendedor.getNome());
		vendedor.setIdade(45);
		System.out.println("Idade: " + vendedor.getIdade());
		vendedor.setSalario(8500);
		System.out.println("Salario: R$" + String.format("%.2f", vendedor.getSalario()));
		vendedor.setGrauInstrucao(3);
		System.out.println("Grau de instrucao: " + vendedor.getGrauInstrucao());
		System.out.println("Bonificação: R$" + String.format("%.2f", vendedor.bonificacao()));

		
			
	}

}
