package entities;

public class PessoaJuridica extends Pessoa {
	
	private  Integer numeroFuncionarios;

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	@Override
	public Double imposto () {
		if(this.numeroFuncionarios > 10) {
			return this.getRendaAnual() * 0.14;
		}
		return this.getRendaAnual() * 0.16;
	}
}
