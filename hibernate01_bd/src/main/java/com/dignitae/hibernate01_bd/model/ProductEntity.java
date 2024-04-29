package com.dignitae.hibernate01_bd.model;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class ProductEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "marca")
    @NotBlank
    private String marca;

    @Column(name = "modelo")
    @NotBlank
    private String modelo;

    @Column(name = "precio")
    @PositiveOrZero
    private double precio;

    @Column(name = "stock")
    @PositiveOrZero
    private long stock;

    public ProductEntity(@NotBlank String marca, @NotBlank String modelo, @PositiveOrZero double precio,
            @PositiveOrZero long stock) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.stock = stock;
    }

    public ProductEntity() {
        this.marca = "Sin Marca";
        this.modelo = "Sin Modelo";
        this.precio = 0;
        this.stock = 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public long getStock() {
        return stock;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "ProductEntity [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", stock="
                + stock + "]";
    }

}
