
public class Cartao implements VerificaCartao{

	Integer numero;
	String nome;
	Integer codseg;
	Boolean chip;
	Double limitecartao;
	Double saldo;
	

	public Cartao() {
		super();
	}

	

	public Cartao(Integer numero, String nome, Integer codseg, Boolean chip, Double limitecartao, Double saldo) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.codseg = codseg;
		this.chip = chip;
		this.limitecartao = limitecartao;
		this.saldo = saldo;
	}

	

	public Double getSaldo() {
		return saldo;
	}



	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}



	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodseg() {
		return codseg;
	}

	public void setCodseg(Integer codseg) {
		this.codseg = codseg;
	}

	public Boolean getChip() {
		return chip;
	}

	public void setChip(Boolean chip) {
		this.chip = chip;
	}

	public Double getLimitecartao() {
		return limitecartao;
	}

	public void setLimitecartao(Double limitecartao) {
		this.limitecartao = limitecartao;
	}

	@Override
	public boolean verificaChip() {
		return this.chip;
	}
		
}
