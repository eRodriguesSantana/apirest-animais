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

import com.animais.apirestanimais.models.AnimalAmeacado;
import com.animais.apirestanimais.repository.AnimalAmeacadoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api-animais")
@Api(value="API REST Animais Ameaçados")
@CrossOrigin(origins="*")
public class AnimalAmeacadoResource {

	@Autowired
	AnimalAmeacadoRepository animalAmeacadoRepository;

	@GetMapping("/ameacado")
	@ApiOperation(value="Retorna uma lista de dados de animais ameaçados de extinção")
	public List<AnimalAmeacado> listaAnimaisAmeacados() {
		return animalAmeacadoRepository.findAll();
	}

	@GetMapping("/ameacado/{id}")
	@ApiOperation(value="Retorna dados de um animal ameaçado de extinção de acordo com o seu ID de cadastro")
	public AnimalAmeacado mostraAnimalAmeacadoUnico(@PathVariable(value="id") long id){
		return animalAmeacadoRepository.findById(id);
	}

	@PostMapping("/ameacado")
	@ApiOperation(value="Inclui o registro de dados de um animal ameaçado de extinção")
	public AnimalAmeacado salvaAnimalAmeacado(@RequestBody AnimalAmeacado animalAmeacado) {
		return animalAmeacadoRepository.save(animalAmeacado);
	}
	
	@DeleteMapping("/ameacado")
	@ApiOperation(value="Exclui o registro de dados de um animal ameaçado de extinção")
	public void deletaAnimalAmeacado(@RequestBody AnimalAmeacado animalAmeacado) {
		animalAmeacadoRepository.delete(animalAmeacado);
	}
	
	@PutMapping("/ameacado")
	@ApiOperation(value="Atualiza informações do registro de um animal ameaçado de extinção")
	public AnimalAmeacado atualizaAnimalAmeacado(@RequestBody AnimalAmeacado animalAmeacado) {
		return animalAmeacadoRepository.save(animalAmeacado);
	}
}
