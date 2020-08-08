package com.animais.apirestanimais.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.animais.apirestanimais.models.AnimalExtinto;

public interface AnimalExtintoRepository extends JpaRepository<AnimalExtinto, Long> {
	
	AnimalExtinto findById(long id);
}
