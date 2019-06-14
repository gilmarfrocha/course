package entities;

public class Aluno {

	public String Name;
	public double N1Bim;
	public double N2Bim;
	public double N3Bim;

	
	public double media() {
		return (N1Bim + N2Bim  + N3Bim ) ;
	}
	
	public String AvalFinal() {
		if (media()>= 60)
				return "PASS";
		else
			return "FAILED";
	}
	
	public double PintRest() {
		return 60 - media();
	}
}
