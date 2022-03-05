package Bootcamp_GFT_Start_4_Java.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Data;

@Data 
@Entity 
public class ItemPedido implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ItemPedidoPK id = new ItemPedidoPK();
	
	private Double desconto;
	private Integer quantidade;
	private Double preco;
	
	public ItemPedido() {}

	public ItemPedido(Produto produto , Cliente cliente, Double desconto, Integer quantidade, Double preco) {
		super();
		id.setCliente(cliente);
		id.setProduto(produto);
		this.desconto = desconto;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	public Cliente getCliente() {
		return id.getCliente();
	}
	
	public Produto getProduto() {
		return id.getProduto();
	}
	
}
