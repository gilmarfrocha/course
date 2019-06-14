package entities;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double valorEmReais(double vrDollar, double Qtde) {
		return vrDollar * Qtde * (1+IOF);
	}
}
