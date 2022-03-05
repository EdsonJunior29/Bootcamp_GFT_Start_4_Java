package Bootcamp_GFT_Start_4_Java.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String descricao;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "produto_id")
	private Loja loja;
	
	@OneToMany(mappedBy = "id.produto")
	private Set<ItemPedido> itens = new HashSet<>();

	@JsonIgnore
	public List<Cliente> getClientes(){
		List<Cliente> clientes = new ArrayList<Cliente>();
		for(ItemPedido p : itens) {
			clientes.add(p.getCliente());
		}
		return clientes;
	}

}
