package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ExercListas02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many employees will be registered?");
		int n = sc.nextInt();
		List<Funcionario> list = new ArrayList<>();
		for (int i=1;i<=n;i++) {
			System.out.println();
			System.out.print("Emplyoee #" + i + " : ");
			System.out.print("ID : ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome : ");
			String nome = sc.nextLine();
			System.out.print("Salary : ");
			double salario = sc.nextDouble();
			Funcionario f = new Funcionario(id, nome, salario);
			list.add(f);
		}
		
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		
		Funcionario f = list.stream().filter(x -> x.getID()==id).findFirst().orElse(null) ;
		if (f == null) {
			System.out.println("Funcionário não existe!");
		}
		else {
			
			System.out.print("Enter the percentage : ");
			double percent = sc.nextDouble();
			f.IncrementaSalario(percent);
		}

		System.out.println("List of employees:");
		
		for (Funcionario x : list) {
			System.out.println( x.toString());
		}
		

	}

}
