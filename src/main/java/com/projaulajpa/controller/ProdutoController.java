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

import com.projaulajpa.entity.Produto;
import com.projaulajpa.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
	private final ProdutoService produtoService;
	
	@Autowired
	public ProdutoController( ProdutoService produtoService) {
		this.produtoService = produtoService;
	}
	
	@PostMapping 
	public Produto InserirProduto(@RequestBody Produto produto) {
		return produtoService.salvarProduto(produto);
	}
	
	@GetMapping("/{id}")
		public Produto buscaProduto(@PathVariable Long id) {
			return produtoService.getProdutoPorId(id);
		}
	@GetMapping
	public List<Produto> buscaTodosProduto(){
		return produtoService.getAllProdutos();
	}
	
	@DeleteMapping("/{id}")
	public void deletarProduto(@PathVariable Long id) {
		produtoService.excluirProduto(id);
	}
	}
