package application;

import java.util.Locale;
import java.util.Scanner;

public class Vet01 {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
	        double[] vect=new double[n];
	        int i=0;
	        double total=0;
	        for ( i=0; i<n;i++) {
	        	vect[i]=sc.nextDouble();
	        	total += vect[i];
	        }
	        double media=total/n;
	        System.out.printf("Média %2f5n3" + media);
			sc.close();
		}

	}


