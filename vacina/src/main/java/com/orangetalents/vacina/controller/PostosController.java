package com.orangetalents.vacina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orangetalents.vacina.model.Postos;
import com.orangetalents.vacina.repository.PostosRepository;


@RestController
@RequestMapping("/postos")
@CrossOrigin("*")
public class PostosController {
	
	@Autowired
	private PostosRepository postosRepository;
	
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Postos> cadastrarPosto (@RequestBody Postos posto){
		return ResponseEntity.status(HttpStatus.CREATED).body(postosRepository.save(posto));
	}
	
}
