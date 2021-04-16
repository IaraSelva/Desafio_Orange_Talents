package com.orangetalents.vacina.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orangetalents.vacina.model.Postos;
import com.orangetalents.vacina.model.Vacinas;
import com.orangetalents.vacina.repository.PostosRepository;
import com.orangetalents.vacina.repository.VacinasRepository;

@Service
public class PostosService {
	
	@Autowired
	private PostosRepository postosRepository;
	@Autowired
	private VacinasRepository vacinasRepository;
		
	public Postos cadastrarPosto (Postos posto, Long idVacina, int estoque){
		Optional<Vacinas> existente = vacinasRepository.findById(idVacina);
		Postos cadastro = postosRepository.save(posto);
		if(existente.isPresent()) {
			cadastro.getVacinasDisponiveis().add(existente.get());
			cadastro.setEstoque(estoque);
		}
	
		return postosRepository.save(cadastro);
	}
}


