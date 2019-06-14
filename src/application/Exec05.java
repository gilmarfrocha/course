package application;

import java.util.Scanner;
import entities.estudante;

public class Exec05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will be rented?");
		estudante[] Quartos = new estudante[10];
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			sc.nextLine();
			System.out.print("Nome: ");
			String Nome = sc.nextLine();
			System.out.print("Email: ");
			String Email = sc.nextLine();
			System.out.print("Room: ");
			int Room = sc.nextInt();
			Quartos[Room] = new estudante(Nome, Email);
		}

		for (int i = 0; i < Quartos.length; i++) {
			if (Quartos[i] != null) {
				System.out.println(i + " : " + Quartos[i].toString());
			}
		}
		sc.close();
	}

}
