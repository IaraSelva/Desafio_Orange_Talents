package com.orangetalents.vacina.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orangetalents.vacina.model.Usuarios;
import com.orangetalents.vacina.repository.UsuariosRepository;
import com.orangetalents.vacina.service.UsuariosService;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuariosController {
	
	@Autowired
	private UsuariosService service;
	
	@Autowired UsuariosRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Usuarios>> listarTodos(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping("/cadastrar/novo/{idVacina}/{idPosto}")
	public ResponseEntity<Usuarios> cadastrarUsuario 
	(@Valid @RequestBody Usuarios usuario,
			@PathVariable Long idVacina,
			@PathVariable Long idPosto){
		Optional<Usuarios> existente = service.cadastrar(usuario, idVacina, idPosto);
		if(existente.isEmpty()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}else {
			return ResponseEntity.status(HttpStatus.CREATED).body(existente.get());	
		}
	}

}
