package com.dignitae.springboot14_mapeorelaciones.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column(name="nombre")
    private String nombre;

    @Column(name="apellidos")
    private String apellidos;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<PedidoEntity> pedidos;

    public ClienteEntity() {
        this.nombre="";
        this.apellidos="";
        this.pedidos = new ArrayList<>();
    }

    public ClienteEntity(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.pedidos = new ArrayList<>();
    }

    public ClienteEntity(String nombre, String apellidos, List<PedidoEntity> pedidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.pedidos = pedidos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "ClienteEntity [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
    }
    
    public void addPedido(PedidoEntity pe){
        this.pedidos.add(pe);
    }

    public void removePedido(PedidoEntity pe){
        this.pedidos.remove(pe);
    }

    public void clearPedidos(){
        this.pedidos.clear();
    }

}
