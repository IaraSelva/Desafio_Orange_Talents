package com.orangetalents.vacina.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orangetalents.vacina.model.Estoque;
import com.orangetalents.vacina.model.Postos;
import com.orangetalents.vacina.model.Vacinas;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Long> {

	public Optional<Estoque> findByVacina (Vacinas vacina);
	
	public Optional<Estoque> findByPosto (Postos posto);
}
