package entidade;

public class Vendedor extends Colaborador {
	
	public double bonificacao() {
		return getSalario() + 300.0 * getGrauInstrucao() * 4;
	}

}
