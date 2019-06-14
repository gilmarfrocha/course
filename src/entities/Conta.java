package entities;

public class Conta {
private String NrConta;
private String NomeTitular;
private double Saldo;

public Conta(String nrConta, String nomeTitular, double saldo) {
	NrConta = nrConta;
	NomeTitular = nomeTitular;
	Saldo = saldo;
}

public Conta(String nrConta, String nomeTitular) {
	NrConta = nrConta;
	NomeTitular = nomeTitular;
	Saldo = 0;
}

public String getNrConta() {
	return NrConta;
}


public String getNomeTitular() {
	return NomeTitular;
}

public void setNomeTitular(String nomeTitular) {
	NomeTitular = nomeTitular;
}

public double getSaldo() {
	return Saldo;
}

public void deposito (double Valor) {
	this.Saldo +=Valor;

}

public void saque (double Valor) {
	this.Saldo -= (Valor + 5);
}

@Override
public String toString() {
	return "NrConta=" + NrConta + ", NomeTitular :" + NomeTitular + ", Saldo: $ " + String.format("%.2f",  Saldo) ;
}



}
