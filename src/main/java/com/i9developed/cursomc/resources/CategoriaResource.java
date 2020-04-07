package com.i9developed.cursomc.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.i9developed.cursomc.domain.Categoria;
import com.i9developed.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value = "categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> find() {
		
		Categoria categoria1 =new Categoria(1,"Informatica");
		Categoria categoria2 =new Categoria(1,"Escritorio");
		
		List<Categoria> categorias =new  ArrayList<Categoria>();
		categorias.add(categoria1);
		categorias.add(categoria2);
		return categorias;
	}
	
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria categoria =  service.find(id);
		
		return ResponseEntity.ok(categoria);
		
	}

}
