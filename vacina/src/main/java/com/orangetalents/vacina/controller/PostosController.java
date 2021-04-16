package com.orangetalents.vacina.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.orangetalents.vacina.model.Postos;
import com.orangetalents.vacina.service.PostosService;


@RestController
@RequestMapping("/postos")
@CrossOrigin("*")
public class PostosController {
	
	@Autowired
	private PostosService postosService;
	
	
	@PostMapping("/cadastrar/{idVacina}")
	public ResponseEntity<Postos> cadastrar 
	(@Valid @RequestBody  Postos posto,
			@PathVariable Long idVacina,
			@RequestParam int estoque){
		return ResponseEntity.status(HttpStatus.CREATED).body(postosService.cadastrarPosto(posto, idVacina, estoque));
	}

}
