package Bootcamp_GFT_Start_4_Java.services;

import Bootcamp_GFT_Start_4_Java.domain.Cliente;

public interface ClienteService {

	Cliente save(Cliente cliente);

	Object findById(Integer id);

	void delete(Cliente cliente);

	Cliente update(Cliente cliente);
}
