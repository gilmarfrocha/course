package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Vet02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        Produto[] vect= new Produto[n];
        for (int i=0; i< vect.length ;i++) {
        	sc.nextLine();
        	String nome =sc.nextLine();
        	double preco =sc.nextDouble();
        	vect[i] = new Produto(nome, preco);
        }
         double Total = 0.0;
         for (int i=0; i< vect.length;i++) {
        	 Total+=vect[i].getPreco();
        	 
         }
         double media = Total /n;
        System.out.printf("Média = %.2f%n" , media);
		sc.close();
	}

	}


