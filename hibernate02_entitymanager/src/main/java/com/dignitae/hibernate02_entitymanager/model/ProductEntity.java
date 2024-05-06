package com.dignitae.hibernate02_entitymanager.model;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


// Hibernate entity
@Entity
@Table(name = "producto")
public class ProductEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="marca")
    @NotBlank
    private String marca;
    @NotBlank
    private String modelo;
    @NotBlank
    @Positive
    private double precio;
    @PositiveOrZero
    private Long stock;

    public ProductEntity() {
        this.marca = "";
        this.modelo = "";
        this.precio = 0;
    }

    public ProductEntity(String marca, String modelo, double precio, Long stock) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.stock = stock;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void setStock(Long stock) {
        this.stock = stock;
    }

    public Long getId() {
        return id;
    }
    
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    public double getPrecio() {
        return precio;
    }

    public Long getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "CustomEntity [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", stock=" + stock + "]";
    }

}
