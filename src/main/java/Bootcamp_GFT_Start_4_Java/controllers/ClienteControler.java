package Bootcamp_GFT_Start_4_Java.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Bootcamp_GFT_Start_4_Java.domain.Cliente;
import Bootcamp_GFT_Start_4_Java.domain.ClienteDTO;
import Bootcamp_GFT_Start_4_Java.services.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteControler {
	
	private ClienteService service;
	private ModelMapper modelMapper;
	
	public ClienteControler(ClienteService service, ModelMapper modelMapper) {
		this.service = service;
		this.modelMapper = modelMapper;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ClienteDTO create(@RequestBody ClienteDTO dto) {
		Cliente cliente = modelMapper.map(dto, Cliente.class);
		cliente = service.save(cliente);
		ClienteDTO clienteDTO = modelMapper.map(cliente, ClienteDTO.class);
		return clienteDTO;
	}
	
	@GetMapping("/{id}")
	public ClienteDTO getClienteById(@PathVariable Integer id) {
		Cliente cliente = (Cliente) service.findById(id);
		ClienteDTO clienteDTO = modelMapper.map(cliente, ClienteDTO.class);

		return clienteDTO;
		}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Integer id){
		Cliente cliente = (Cliente) service.findById(id);
		service.delete(cliente);
		
	}
	
	@PutMapping("{id}")
	@ResponseStatus(HttpStatus.OK)
	public ClienteDTO update(@PathVariable Integer id , ClienteDTO dto) {
		Cliente cliente = (Cliente)service.findById(id);
		cliente.setNome(dto.getNome());
		cliente.setEmail(dto.getEmail());
		cliente =  service.update(cliente);
		return modelMapper.map(cliente, ClienteDTO.class);	
	}
}
