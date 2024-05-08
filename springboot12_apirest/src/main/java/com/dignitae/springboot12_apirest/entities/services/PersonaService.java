package com.dignitae.springboot12_apirest.entities.services;

import java.util.List;

import com.dignitae.springboot12_apirest.entities.PersonaEntity;

public interface PersonaService {

	public List<PersonaEntity> findAll();
	
	public PersonaEntity save(PersonaEntity person);
	
	public PersonaEntity findById(Long id);
	
	public void delete(PersonaEntity person);

    public void initializeDemoData();
}