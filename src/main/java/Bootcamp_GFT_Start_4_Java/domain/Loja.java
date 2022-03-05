package Bootcamp_GFT_Start_4_Java.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Loja {
	
	@Id
	private Long CNPJ = 1254796047L;
	@Column(unique = true)
	private String nome;
	@Column(unique = true)
	private String URI; 
	
	

}
