package application;

public class ExecForEach {

	public static void main(String[] args) {
		String[] vet = new String[] { "Maria", "Bob", "Alex" };
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
		System.out.println();
		for (String Nome : vet) {
			System.out.println(Nome);
		}

	}

}
