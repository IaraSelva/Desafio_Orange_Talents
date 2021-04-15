package com.orangetalents.vacina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orangetalents.vacina.model.Vacinas;

@Repository
public interface VacinasRepository extends JpaRepository<Vacinas, Long> {

}

