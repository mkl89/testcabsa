package es.cabsa.javadevelopers.dao;

import java.util.List;

import es.cabsa.javadevelopers.es.cabsa.javadevelopers.dto.AnimalDTO;

public interface AnimalDAO {

	List<AnimalDTO> findAll();
	List<AnimalDTO> findByfood(String food);
	List<AnimalDTO> findByAnimal(String animal);
}
