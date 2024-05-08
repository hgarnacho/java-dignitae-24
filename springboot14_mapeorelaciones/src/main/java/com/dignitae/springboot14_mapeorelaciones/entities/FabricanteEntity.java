package com.dignitae.springboot14_mapeorelaciones.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="fabricante")
public class FabricanteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column(name="nombreclear")
    private String nombre;

    @ManyToMany(mappedBy = "fabricantes")
    private List<ProductoEntity> productos;

    public FabricanteEntity(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public FabricanteEntity(String nombre, List<ProductoEntity> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<ProductoEntity> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductoEntity> productos) {
        this.productos = productos;
    }

    public void addProducto(ProductoEntity pe){
        this.productos.add(pe);
    }

    public void removeProducto(ProductoEntity pe){
        this.productos.remove(pe);
    }

    public void clearProductos(){
        this.productos.clear();
    }
    
}

