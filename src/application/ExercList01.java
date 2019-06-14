package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExercList01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Tim");
		list.add("Sara");
		list.add("Anna");
		list.add(2, "Marco");
		System.out.println(list.size());

		for (String Nome : list) {
			System.out.println(Nome);
		}
		System.out.println("--------------------------------------------");
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String Nome : list) {
			System.out.println(Nome);
		}
		System.out.println("--------------------------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("--------------------------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String Nome : result) {
			System.out.println(Nome);
		}
		System.out.println("--------------------------------------------");
		String nome = list.stream().filter(x -> x.charAt(0)=='T').findFirst().orElse(null);
		System.out.println(nome);
	}

}
