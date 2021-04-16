package com.orangetalents.vacina.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orangetalents.vacina.model.Postos;
import com.orangetalents.vacina.model.Usuarios;
import com.orangetalents.vacina.model.Vacinas;
import com.orangetalents.vacina.repository.PostosRepository;
import com.orangetalents.vacina.repository.UsuariosRepository;
import com.orangetalents.vacina.repository.VacinasRepository;


@Service
public class UsuariosService {
	
	@Autowired
	private UsuariosRepository repository;
	
	@Autowired
	private VacinasRepository vacinasRepository;
	
	@Autowired
	private PostosRepository postosRepository;
	
	public Optional<Usuarios> cadastrar(Usuarios usuario, Long idVacina, Long idPosto) {
        Optional<Usuarios> cpfExistente = repository.findByCpf(usuario.getCpf());
        Optional<Usuarios> emailExistente = repository.findByEmail(usuario.getEmail());
        Optional<Vacinas> vacinaExistente = vacinasRepository.findById(idVacina);
        Optional<Postos> postoExistente = postosRepository.findById(idPosto);
        if(cpfExistente.isPresent() && emailExistente.isPresent()) {
            return Optional.empty();
        }if(vacinaExistente.isPresent() && postoExistente.isPresent()) {
        	vacinaExistente.get().setDataAplicacao(new java.sql.Date(System.currentTimeMillis()));
        	postoExistente.get().setEstoque(postoExistente.get().getEstoque()-1);
        	usuario.setVacinadoCom(vacinaExistente.get());
        	usuario.setVacinadoEm(postoExistente.get());
        	
        }
        return Optional.ofNullable(repository.save(usuario));
    }

}
