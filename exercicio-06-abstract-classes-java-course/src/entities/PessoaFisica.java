package entities;

public class PessoaFisica extends Pessoa{
	
	private Double gastosSaude;

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public Double imposto () {
		if(this.gastosSaude > 0) {
			return (this.getRendaAnual() * 0.25) - (this.gastosSaude * 0.5);
		}
		return this.getRendaAnual() * 0.25;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
}
