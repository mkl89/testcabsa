package es.cabsa.javadevelopers.servives.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.cabsa.javadevelopers.dao.AnimalDAO;
import es.cabsa.javadevelopers.es.cabsa.javadevelopers.dto.AnimalDTO;
import es.cabsa.javadevelopers.services.AnimalService;


@Service
public class AnimalServiceImpl implements AnimalService{

	@Autowired
	AnimalDAO animalDao;
	
	public List<AnimalDTO> getAnimals() {
		return animalDao.findAll();
	}

	@Override
	public List<AnimalDTO> findByfood(String food) {
		return animalDao.findByfood(food);
	}

	@Override
	public List<AnimalDTO> findByAnimal(String animal) {
		return animalDao.findByAnimal(animal);
	}
	
}
