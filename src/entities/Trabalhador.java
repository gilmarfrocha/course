package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.TrabalhadorNivel;

public class Trabalhador {
	private String nome;
	private TrabalhadorNivel nivel;
	private Double salariobase;
	private Departamento departamento;
	private List<HoraContrato> contratos = new ArrayList<>();

	public Trabalhador() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TrabalhadorNivel getNivel() {
		return nivel;
	}

	public void setNivel(TrabalhadorNivel nivel) {
		this.nivel = nivel;
	}

	public Double getSalariobase() {
		return salariobase;
	}

	public void setSalariobase(Double salariobase) {
		this.salariobase = salariobase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HoraContrato> getContratos() {
		return contratos;
	}

	public Trabalhador(String nome, TrabalhadorNivel nivel, Double salariobase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salariobase = salariobase;
		this.departamento = departamento;
	}

	public void addContrato(HoraContrato contrato) {
		this.contratos.add(contrato);
	}

	public void removeContrato(HoraContrato contrato) {
		this.contratos.remove(contrato);
	}

	public Double rendimentos(int ano, int mes) {
		double vrTotal = salariobase;
		Calendar cal = Calendar.getInstance();
		for (HoraContrato c : contratos) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1+ cal.get(Calendar.MONTH);
			if (c_ano == ano && c_mes == mes) {
				vrTotal += c.Valortotal();
			}
		}
		return vrTotal;
	}

}
