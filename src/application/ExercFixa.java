package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Pedido;
import entities.PedidoItens;
import entities.Produto;
import entities.enums.StatusPedido;

public class ExercFixa {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter com dos dados do cliente ");
		System.out.print("Name:");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Data de Nascimento (DD/MM/YYYY):");
		Date dtNasc = sdf1.parse(sc.nextLine());
		Cliente cliente = new Cliente(nome, email, dtNasc);
		System.out.println();
		System.out.println("Entre com os dados do Pedido");
		System.out.print("Status:");
		StatusPedido status = StatusPedido.valueOf( sc.nextLine());
		Pedido pedido = new Pedido(new Date(), status, cliente);
		System.out.print("Quantos itens nesse pedido:");
		int n = sc.nextInt();
		for ( int i=1; i<=n;i++) {
			System.out.println("Entre com os dados do #"+ i + " item:");
			sc.nextLine();
			System.out.print("Nome do Produto:");
			String produtonome = sc.nextLine();
			System.out.print("Preco do Produto:");
			Double produtopreco = sc.nextDouble();
			Produto produto = new Produto(produtonome, produtopreco);
			System.out.print("Quantidade:");
			Integer quantidade = sc.nextInt();
			PedidoItens item = new PedidoItens(produto, quantidade, produtopreco);
			pedido.addItem(item);
		}
		sc.close();
		
		System.out.println();
		System.out.println(pedido.toString());
	}

}
