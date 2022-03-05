package Bootcamp_GFT_Start_4_Java.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Embeddable
public class ItemPedidoPK implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "produto_id")
	private Produto produto;
	

	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;

}
