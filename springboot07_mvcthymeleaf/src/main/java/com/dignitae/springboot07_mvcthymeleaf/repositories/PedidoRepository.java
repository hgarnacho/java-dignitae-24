package com.dignitae.springboot07_mvcthymeleaf.repositories;

import org.springframework.stereotype.Repository;

import com.dignitae.springboot07_mvcthymeleaf.entities.PedidoEntity;

import org.springframework.data.jpa.repository.JpaRepository;;

@Repository
public interface PedidoRepository extends JpaRepository<PedidoEntity, Long> {

}
