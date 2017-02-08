
public class Cliente {

	String nome;
	Integer idade;
	Integer cpf;
	String endereco;
	String telefone;
	Integer numconta;

	

	public Cliente(String nome, Integer idade, Integer cpf, String endereco, String telefone, Integer numconta) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.numconta = numconta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Integer getNumconta() {
		return numconta;
	}

	public void setNumconta(Integer numconta) {
		this.numconta = numconta;
	}

	
	
}
