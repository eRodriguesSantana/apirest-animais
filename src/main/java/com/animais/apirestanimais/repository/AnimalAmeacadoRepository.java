package com.animais.apirestanimais.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.animais.apirestanimais.models.AnimalAmeacado;

public interface AnimalAmeacadoRepository extends JpaRepository<AnimalAmeacado, Long> {
	
	AnimalAmeacado findById(long id);

}
