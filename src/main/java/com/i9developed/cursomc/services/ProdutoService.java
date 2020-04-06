package com.i9developed.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.i9developed.cursomc.domain.Produto;
import com.i9developed.cursomc.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;

	public List<Produto> buscar() {

		return repository.findAll();

	}

	public Optional<Produto> buscar(Integer id) {
		
		Optional<Produto> categoria = repository.findById(id);

		return categoria;

	}
}
