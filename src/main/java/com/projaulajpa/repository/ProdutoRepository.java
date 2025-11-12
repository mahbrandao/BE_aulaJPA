package com.projaulajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projaulajpa.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	
}
