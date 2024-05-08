package com.dignitae.springboot14_mapeorelaciones.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dignitae.springboot14_mapeorelaciones.entities.FabricanteEntity;

@Repository
public interface FabricanteRepository extends JpaRepository<FabricanteEntity, Long> {

}
