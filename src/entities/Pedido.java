package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedido {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
	private Date data;
	private StatusPedido status;
	private Cliente cliente;
	private List<PedidoItens> itens = new ArrayList<>();

	public Pedido(Date data, StatusPedido status, Cliente cliente) {
		this.data = data;
		this.status = status;
		this.cliente = cliente;
	}

	public Pedido() {
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<PedidoItens> getItens() {
		return itens;
	}

	public void addItem(PedidoItens item) {
		this.itens.add(item);
	}

	public void removeItem(PedidoItens item) {
		this.itens.remove(item);
	}

	public Double Total() {
		Double vTotal = 0.0;
		for (PedidoItens item : itens) {
			vTotal += item.SubTotal();
		}
		return vTotal;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Resumo do Pedido :" + "\n");
		sb.append("Data do Pedido : " + sdf.format(data)  + "\n" );
		sb.append("Status do Pedido : " + status + "\n");
		sb.append("Cliente :" + cliente.getNome() + "("+ sdf2.format(cliente.getDtNasc()) + ") - " + cliente.getEmail() + "\n");
		sb.append("---------------------------------------------------"+"\n");
		sb.append("Itens do Pedido :" + "\n");
		for (PedidoItens item : itens) {
			sb.append(item.toString()  + "\n");	
		}
		sb.append(String.format("Valor total: $"+ "%.2f", Total()));
		return sb.toString();
	}
}
