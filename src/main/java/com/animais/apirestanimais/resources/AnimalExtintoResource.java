package com.animais.apirestanimais.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.animais.apirestanimais.models.AnimalExtinto;
import com.animais.apirestanimais.repository.AnimalExtintoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api-animais")
@Api(value="API REST Animais Extintos")
@CrossOrigin(origins="*")
public class AnimalExtintoResource {

	@Autowired
	AnimalExtintoRepository animalExtintoRepository;
	
	@GetMapping("/extinto")
	@ApiOperation(value="Retorna uma lista de dados de animais extintos")
	public List<AnimalExtinto> listaAnimaisExtintos() {
		return animalExtintoRepository.findAll();
	}

	@GetMapping("/extinto/{id}")
	@ApiOperation(value="Retorna dados de um animal extinto de acordo com o seu ID de cadastro")
	public AnimalExtinto mostraAnimalExtintoUnico(@PathVariable(value="id") long id){
		return animalExtintoRepository.findById(id);
	}

	@PostMapping("/extinto")
	@ApiOperation(value="Inclui o registro de dados de um animal extinto")
	public AnimalExtinto salvaAnimalExtinto(@RequestBody AnimalExtinto animalExtinto) {
		return animalExtintoRepository.save(animalExtinto);
	}
	
	@DeleteMapping("/extinto")
	@ApiOperation(value="Exclui o registro de dados de um animal extinto")
	public void deletaAnimalExtinto(@RequestBody AnimalExtinto animalExtinto) {
		animalExtintoRepository.delete(animalExtinto);
	}
	
	@PutMapping("/extinto")
	@ApiOperation(value="Atualiza informações do registro de um animal extinto")
	public AnimalExtinto atualizaAnimalExtinto(@RequestBody AnimalExtinto animalExtinto) {
		return animalExtintoRepository.save(animalExtinto);
	}
}
