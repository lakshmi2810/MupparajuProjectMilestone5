package com.mupparaju.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mupparaju.DMS.Models.Dog;

/**
 * 
 * @author S554962
 *
 */
public interface DogRepository extends CrudRepository<Dog,Integer> {
	List<Dog> findByName(String name);
}
