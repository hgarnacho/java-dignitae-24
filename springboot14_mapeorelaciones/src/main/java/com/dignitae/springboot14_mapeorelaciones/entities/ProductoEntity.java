package com.dignitae.springboot14_mapeorelaciones.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="producto")
public class ProductoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column(name="marca")
    private String marca;
    
    @Column(name="modelo")
    private String modelo;

    @Column(name="stock")
    private Integer stock;

    // Relación ManyToMany con la entidad Fabricante
    @ManyToMany
    @JoinTable(name = "fabricante_producto",
        joinColumns = @JoinColumn(name = "producto_id"),
        inverseJoinColumns = @JoinColumn(name = "fabricante_id"))
        private List<FabricanteEntity> fabricantes;

    // Relación OneToMany con la entidad LineaPedido
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<LineaPedidoEntity> lineasPedido = new ArrayList<>();

    public ProductoEntity() {
        this.marca = "";
        this.modelo = "";
        this.stock = 0;
        this.fabricantes = new ArrayList<>();;
    }

    public ProductoEntity(String marca, String modelo, Integer stock, List<FabricanteEntity> fabricantes) {
        this.marca = marca;
        this.modelo = modelo;
        this.stock = stock;
        this.fabricantes = fabricantes;
    }

    public ProductoEntity(String marca, String modelo, Integer stock) {
        this.marca = marca;
        this.modelo = modelo;
        this.stock = stock;
        this.fabricantes = new ArrayList<>();;
    }

    public Long getId() {
        return id;
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

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "ProductoEntity [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", stock=" + stock + "]";
    }

    public void addFabricante(FabricanteEntity fe){
        this.fabricantes.add(fe);
    }

    public void removeFabricante(FabricanteEntity fe){
        this.fabricantes.remove(fe);
    }

    public void clearFabricantes(){
        this.fabricantes.clear();
    }

}


