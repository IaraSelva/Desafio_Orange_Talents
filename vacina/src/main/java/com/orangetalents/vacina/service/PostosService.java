package com.orangetalents.vacina.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orangetalents.vacina.model.Estoque;
import com.orangetalents.vacina.model.Postos;
import com.orangetalents.vacina.model.Vacinas;
import com.orangetalents.vacina.repository.EstoqueRepository;
import com.orangetalents.vacina.repository.PostosRepository;
import com.orangetalents.vacina.repository.VacinasRepository;

@Service
public class PostosService {
	
	@Autowired
	private PostosRepository postosRepository;
	@Autowired
	private VacinasRepository vacinasRepository;
	@Autowired
	private EstoqueRepository estoqueRepository;
	
	/*public Optional<Postos> alterarEstoque (Estoque estoque){
		Optional<Vacinas> existente = vacinasRepository.findById(estoque.getId());
		if(existente.isPresent()) {
			return existente.get().setEstoque(estoque.getEstoque());
		}
		return null;
	}*/

}
