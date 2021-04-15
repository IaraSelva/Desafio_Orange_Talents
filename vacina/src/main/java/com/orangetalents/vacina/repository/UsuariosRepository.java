package com.orangetalents.vacina.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orangetalents.vacina.model.Usuarios;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, Long>{
	
	public Optional<Usuarios> findByEmail (String email);
	
	public Optional<Usuarios> findByCpf (String cpf);

}
