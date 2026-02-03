package com.projaulajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projaulajpa.entity.Cliente;
import com.projaulajpa.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	private final ClienteService clienteService;

	@Autowired
	public ClienteController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	@PostMapping
	public Cliente InserirCliente(@RequestBody Cliente cliente) {
		return clienteService.salvarCliente(cliente);
	}

	@GetMapping("/{id}")
	public Cliente buscaCliente(@PathVariable Long id) {
		return clienteService.getClientePorId(id);
	}

	@GetMapping
	public List<Cliente> buscaTodosCliente() {
		return clienteService.getAllClientes();
	}

	@DeleteMapping("/{id}")
	public void deletarCliente(@PathVariable Long id) {
		clienteService.excluirCliente(id);
	}
}