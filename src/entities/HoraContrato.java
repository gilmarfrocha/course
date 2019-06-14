package entities;

import java.util.Date;

public class HoraContrato {
	private Date Data;
	private Double ValorHora;
	private Integer QtdHoras;

	
	public HoraContrato(Date data, Double valorHora, Integer duracao) {
		Data = data;
		ValorHora = valorHora;
		QtdHoras = duracao;
	}
	
	public HoraContrato() {
	}

	
	public Date getData() {
		return Data;
	}

	public void setData(Date data) {
		Data = data;
	}

	public Double getValorHora() {
		return ValorHora;
	}

	public void setValorHora(Double valorHora) {
		ValorHora = valorHora;
	}

	public Integer getQtdHoras() {
		return QtdHoras;
	}

	public void setQtdHoras(Integer qtdHoras) {
		QtdHoras = qtdHoras;
	}

	public Double Valortotal() {
		return this.ValorHora * this.QtdHoras;
	}
}
