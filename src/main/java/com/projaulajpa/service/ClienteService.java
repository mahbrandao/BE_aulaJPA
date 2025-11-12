package com.projaulajpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projaulajpa.entity.Cliente;
import com.projaulajpa.repository.ClienteRepository;

@Service
public class ClienteService {
	
	private final ClienteRepository clienteRepository;
	
	@Autowired
	public ClienteService (ClienteRepository clienteRepository ) {
		this.clienteRepository = clienteRepository;
	}
	
	public Cliente salvarCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public void excluirCliente(Long id) {
		clienteRepository.deleteById(id);
	}

	public ClienteRepository getClienteRepository() {
		return clienteRepository;
	}
	
	
	
}
