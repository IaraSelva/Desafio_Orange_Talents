package com.orangetalents.vacina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orangetalents.vacina.model.Vacinas;
import com.orangetalents.vacina.repository.VacinasRepository;

@RestController
@RequestMapping("/vacinas")
@CrossOrigin("*")
public class VacinasController {
	
	@Autowired
	public VacinasRepository vacinasRepository;
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Vacinas> cadastrarVacina (@RequestBody Vacinas vacina){
		return new ResponseEntity<Vacinas>(vacinasRepository.save(vacina),HttpStatus.OK);
	}

}
