package com.orangetalents.vacina.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orangetalents.vacina.model.Postos;

@Repository
public interface PostosRepository extends JpaRepository<Postos, Long> {
	
	public Optional<Postos> findByNomePostoContainingIgnoreCase (String nomePosto);

}
