package es.cabsa.javadevelopers.services;

import java.util.List;

import es.cabsa.javadevelopers.es.cabsa.javadevelopers.dto.AnimalDTO;

public interface AnimalService {
	
	List<AnimalDTO> getAnimals();
	List<AnimalDTO> findByfood(String food);
	List<AnimalDTO> findByAnimal(String animal);
	
}
