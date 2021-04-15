package com.orangetalents.vacina.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orangetalents.vacina.model.Usuarios;
import com.orangetalents.vacina.repository.UsuariosRepository;


@Service
public class UsuariosService {
	
	@Autowired
	private UsuariosRepository repository;
	
	public Optional<Usuarios> cadastrar(Usuarios usuario) {
        Optional<Usuarios> cpfExistente = repository.findByCpf(usuario.getCpf());
        Optional<Usuarios> emailExistente = repository.findByEmail(usuario.getEmail());
        if(cpfExistente.isPresent() && emailExistente.isPresent()) {
            return Optional.empty();
        }
        return Optional.ofNullable(repository.save(usuario));
    }

}
