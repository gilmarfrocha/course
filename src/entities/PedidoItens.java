package entities;

public class PedidoItens {
	private Produto produto;
	private Integer quantidade;
	private Double preco;
	

	
	public PedidoItens(Produto produto, Integer quantidade, Double preco) {
		this.produto= produto;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	public PedidoItens() {
		
	}

	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Double SubTotal() {
		return quantidade * preco;
	}

	public String toString() {
		return produto.getNome() + " , $" + String.format("%.2f",  preco) + ", Quantidade : " + quantidade + ", SubTotal: $" + String.format("%.2f",SubTotal());
		
	}
	
	
}
