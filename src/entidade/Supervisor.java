package entidade;

public class Supervisor extends Colaborador{
	
	public double bonificacao() {
		return getSalario() + 500.0 * getGrauInstrucao() * 2;
	}

}
