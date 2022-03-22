package entidade;

public class Gerente extends Colaborador {
	
	public double bonificacao() {
		
		return getSalario() + 1000.0 * getGrauInstrucao() * 2;
		
	}

}
