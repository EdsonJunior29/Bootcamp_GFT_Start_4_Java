package Bootcamp_GFT_Start_4_Java.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {

	private Integer id;
	private String nome;
	private String email;

}
