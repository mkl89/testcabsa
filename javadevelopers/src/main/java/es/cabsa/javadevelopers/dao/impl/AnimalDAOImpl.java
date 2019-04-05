package es.cabsa.javadevelopers.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import es.cabsa.javadevelopers.dao.AnimalDAO;
import es.cabsa.javadevelopers.es.cabsa.javadevelopers.dto.AnimalDTO;

@Repository
public class AnimalDAOImpl implements AnimalDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private String QUERY_ALL="SELECT animal.name as animal,animal.legs as legs,food.name as food FROM JUNGLE.ANIMAL animal INNER JOIN JUNGLE.FOOD food ON animal.id = food.id ";
    private String QUERY_BY_FOOD=QUERY_ALL+" WHERE food.name=?";
    private String QUERY_BY_ANIMAL=QUERY_ALL+" WHERE animal.name=?";
	
	public List<AnimalDTO> findAll() {
		return jdbcTemplate.query(QUERY_ALL,
                new BeanPropertyRowMapper<>(AnimalDTO.class));
	}

	@Override
	public List<AnimalDTO> findByfood(String food) {
		return jdbcTemplate.query(QUERY_BY_FOOD,
				new Object[] { food.toLowerCase() },
                new BeanPropertyRowMapper<>(AnimalDTO.class));
	}

	@Override
	public List<AnimalDTO> findByAnimal(String animal) {
		return jdbcTemplate.query(QUERY_BY_ANIMAL,
				new Object[] { StringUtils.capitalize(animal.toLowerCase()) },
                new BeanPropertyRowMapper<>(AnimalDTO.class));
	}
	
}
