import java.util.Date;

public class Venda {

	Integer qtdparc;
	String horario;
	Double valorcompra;
	Double valorparcela;
	String formapag;
	
	public Venda() {
		super();
	}

	

	public Venda(Integer qtdparc, String horario, Double valorcompra, Double valorparcela, String formapag) {
		super();
		this.qtdparc = qtdparc;
		this.horario = horario;
		this.valorcompra = valorcompra;
		this.valorparcela = valorparcela;
		this.formapag = formapag;
	}



	public Integer getQtdparc() {
		return qtdparc;
	}

	public void setQtdparc(Integer qtdparc) {
		this.qtdparc = qtdparc;
	}

	

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Double getValorcompra() {
		return valorcompra;
	}

	public void setValorcompra(Double valorcompra) {
		this.valorcompra = valorcompra;
	}

	public Double getValorparcela() {
		return valorparcela;
	}

	public void setValorparcela(Double valorparcela) {
		this.valorparcela = valorparcela;
	}

	public String getFormapag() {
		return formapag;
	}

	public void setFormapag(String formapag) {
		this.formapag = formapag;
	}
}
