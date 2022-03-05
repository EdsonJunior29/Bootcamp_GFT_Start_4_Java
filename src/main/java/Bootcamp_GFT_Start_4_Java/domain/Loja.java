package Bootcamp_GFT_Start_4_Java.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Loja implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long CNPJ = 1254796047L;
	@Column(unique = true)
	private String nome;
	@Column(unique = true)
	private String URI; 
	
	@OneToMany(mappedBy = "loja")
	private List<Produto> produtos = new ArrayList<>();
	
	@OneToMany(mappedBy = "loja")
	private Set<Cliente> clientes = new HashSet<>();

}
