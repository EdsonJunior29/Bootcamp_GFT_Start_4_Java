package Bootcamp_GFT_Start_4_Java.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Bootcamp_GFT_Start_4_Java.domain.Cliente;
import Bootcamp_GFT_Start_4_Java.repositories.ClienteRepository;

@Service
public class ClienteServiceIMP implements ClienteService{

	@Autowired
	private ClienteRepository repository;
	
	@Override
	public Cliente save(Cliente cliente) {
		return repository.save(cliente);
	}

	@Override
	public Optional<Cliente> findById(Integer id) {
		return this.repository.findById(id);
	}

	@Override
	public void delete(Cliente cliente) {
		this.repository.delete(cliente);
		
	}

	@Override
	public Cliente update(Cliente cliente) {
		return this.repository.save(cliente);
	}
		

}
