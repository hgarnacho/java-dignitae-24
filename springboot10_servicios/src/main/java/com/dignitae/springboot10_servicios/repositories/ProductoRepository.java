package com.dignitae.springboot10_servicios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dignitae.springboot10_servicios.entities.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

    // Aquí puedes agregar métodos personalizados para consultas específicas si es necesario

    //Por ejemplo
    //@Transactional
    //@Modifying
    //@Query("UPDATE Producto p SET p.stock = p.stock + :num")
    //void aumentarStock(@Param("num") int num);
    
}