package com.orangetalents.vacina.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orangetalents.vacina.model.Vacinas;

@Repository
public interface VacinasRepository extends JpaRepository<Vacinas, Long> {
	
	public Optional<Vacinas> findByNomeVacinaContainingIgnoreCase (String nomeVacina);

}

