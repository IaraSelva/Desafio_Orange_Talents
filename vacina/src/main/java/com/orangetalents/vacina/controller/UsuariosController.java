package com.orangetalents.vacina.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orangetalents.vacina.model.Usuarios;
import com.orangetalents.vacina.service.UsuariosService;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuariosController {
	
	@Autowired
	private UsuariosService service;
	
	@PostMapping("/cadastrar/novo")
	public ResponseEntity<Usuarios> cadastrarUsuario (@Valid @RequestBody Usuarios usuario){
		Optional<Usuarios> existente = service.cadastrar(usuario);
		if(existente.isEmpty()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}else {
			return ResponseEntity.status(HttpStatus.CREATED).body(existente.get());	
		}
	}

}
