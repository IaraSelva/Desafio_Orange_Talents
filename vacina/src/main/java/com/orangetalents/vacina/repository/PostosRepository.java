package com.orangetalents.vacina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orangetalents.vacina.model.Postos;

@Repository
public interface PostosRepository extends JpaRepository<Postos, Long> {

}
