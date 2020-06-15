package com.generation.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.clinica.model.FichaModel;

import java.util.List;


@Repository
public interface FichaRepository extends JpaRepository<FichaModel, Long> {
	public List<FichaModel> findAllBycodFichaContainingIgnoreCase(String codFicha);
}
