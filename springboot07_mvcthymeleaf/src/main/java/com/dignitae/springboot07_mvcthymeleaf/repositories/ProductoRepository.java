package com.dignitae.springboot07_mvcthymeleaf.repositories;

import org.springframework.stereotype.Repository;

import com.dignitae.springboot07_mvcthymeleaf.entities.ProductoEntity;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoEntity, Long> {

}