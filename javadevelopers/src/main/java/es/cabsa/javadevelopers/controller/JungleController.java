package es.cabsa.javadevelopers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.cabsa.javadevelopers.es.cabsa.javadevelopers.dto.AnimalDTO;
import es.cabsa.javadevelopers.services.AnimalService;

@RestController
@RequestMapping(value="/v1") //versión 1 del controlador
public class JungleController {

  @Autowired
  AnimalService animalService;
	
  @GetMapping(value="/jungle")
  public List<AnimalDTO> findAll() {
	  return animalService.getAnimals();
  }

  @GetMapping(value = "/animal/{animal}")
  public List<AnimalDTO> findByAnimal(@PathVariable("animal") String animal) {
      return animalService.findByAnimal(animal);
  }
  
  @GetMapping(value = "/food/{food}")
  public List<AnimalDTO> findByfood(@PathVariable("food") String food) {
      return animalService.findByfood(food);
  }

  
}
