package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departamento;
import entities.HoraContrato;
import entities.Trabalhador;
import entities.enums.TrabalhadorNivel;

public class ExercCompos01 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter department's name: ");
		String dep = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String nome = sc.nextLine();
		System.out.print("Level: ");
		String nivel = sc.nextLine();
		System.out.print("Base salary: ");
		Double salario = sc.nextDouble();
		Trabalhador t = new Trabalhador(nome, TrabalhadorNivel.valueOf(nivel), salario, new Departamento(dep));
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter dados do contrato #" + i + " :");
			sc.nextLine();
			System.out.print("Data no formato (DD/MM/YYYY):");
			Date vdata = sdf1.parse(sc.nextLine());
			System.out.print("Value por hora :");
			Double vrHora = sc.nextDouble();
			System.out.print("Quantidade de  Horas:");
			Integer duracao = sc.nextInt();
			HoraContrato hc = new HoraContrato(vdata, vrHora, duracao);
			t.addContrato(hc);
		}
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY)");
		String vdata = sc.next();
		int Mes = Integer.parseInt(vdata.substring(0, 2));
		int Ano = Integer.parseInt(vdata.substring(3));
		System.out.println("Name: " + t.getNome());
		System.out.println("Department: " + t.getDepartamento().getNome());
		System.out
				.println("Rendimentos do Mes " + vdata + " : " + String.format("%.2f",  t.rendimentos(Ano, Mes)));
		sc.close();
	}

}
