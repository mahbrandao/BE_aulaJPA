package com.projaulajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projaulajpa.entity.Produto;
import com.projaulajpa.repository.ProdutoRepository;

@Service
public class ProdutoService {

	private final ProdutoRepository produtoRepository;
	
	@Autowired 
	public ProdutoService (ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}
	
	public Produto salvarProduto(Produto produto) {
		return produtoRepository.save(produto);
	}
	
	public void excluirProduto(Long id) {
	  produtoRepository.deleteById(id);
	}
	
	public List<Produto> getAllProdutos() {
		return produtoRepository.findAll();
	}
	
	
	public Produto getProdutoPorId(Long id) {
		return produtoRepository.findById(id).orElse(null);
	}
	
	
}
