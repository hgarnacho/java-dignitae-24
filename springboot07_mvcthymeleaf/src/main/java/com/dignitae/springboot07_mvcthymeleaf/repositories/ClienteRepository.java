package com.dignitae.springboot07_mvcthymeleaf.repositories;

import org.springframework.stereotype.Repository;

import com.dignitae.springboot07_mvcthymeleaf.entities.ClienteEntity;

import org.springframework.data.jpa.repository.JpaRepository;;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {

}
