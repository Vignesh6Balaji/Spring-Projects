package com.restwocon.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.restwocon.model.Alien;

@RepositoryRestResource(path = "aliens")
public interface AlienRepo extends JpaRepository<Alien, Integer>{
	
}
