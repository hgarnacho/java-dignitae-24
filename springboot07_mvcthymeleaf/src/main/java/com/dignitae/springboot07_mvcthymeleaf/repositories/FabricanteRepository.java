package com.dignitae.springboot07_mvcthymeleaf.repositories;

import org.springframework.stereotype.Repository;

import com.dignitae.springboot07_mvcthymeleaf.entities.FabricanteEntity;

import org.springframework.data.jpa.repository.JpaRepository;;

@Repository
public interface FabricanteRepository extends JpaRepository<FabricanteEntity, Long> {

}