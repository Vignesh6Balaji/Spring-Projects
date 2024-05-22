package com.bootjpa.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootjpa.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>{
	
	List<Alien> findByaName(String aName);
	List<Alien> findByaIdGreaterThan(int aId);
}
