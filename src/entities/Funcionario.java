package entities;

public class Funcionario {
	private Integer ID;
	private String Nome;
	private Double Salario;

	public Funcionario(Integer iD, String nome, Double salario) {
		ID = iD;
		Nome = nome;
		Salario = salario;
	}

	@Override
	public String toString() {
		return "ID=" + ID + ", Nome=" + Nome + ", Salario=" + String.format("%.2f",  Salario);
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Double getSalario() {
		return Salario;
	}

	public void setSalario(Double salario) {
		Salario = salario;
	}
	
	public void IncrementaSalario (double percent ) {
		this.Salario *= (1 + (percent/100));
		}
	}
