package com.i9developed.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.i9developed.cursomc.domain.Categoria;
import com.i9developed.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;

	public List<Categoria> buscar() {

		return repository.findAll();

	}

	public Optional<Categoria> buscar(Integer id) {
		
		Optional<Categoria> categoria = repository.findById(id);

		return categoria;

	}
}
