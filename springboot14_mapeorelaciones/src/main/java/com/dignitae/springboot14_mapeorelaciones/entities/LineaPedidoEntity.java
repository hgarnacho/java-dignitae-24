package com.dignitae.springboot14_mapeorelaciones.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="linea_pedido")
public class LineaPedidoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    //Importante, este es un campo de la relación
    @Column(name="unidades")
    private Integer unidades;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private ProductoEntity producto;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private PedidoEntity pedido;

    public LineaPedidoEntity() {
        this.producto = null;
        this.unidades = 0;
        this.pedido = null;
    }

    public LineaPedidoEntity(ProductoEntity producto, Integer unidades, PedidoEntity pedido) {
        this.producto = producto;
        this.unidades = unidades;
        this.pedido = pedido;
    }

    public Long getId() {
        return id;
    }

    public ProductoEntity getProducto() {
        return producto;
    }

    public void setProducto(ProductoEntity producto) {
        this.producto = producto;
    }

    public PedidoEntity getPedido() {
        return pedido;
    }

    public void setPedido(PedidoEntity pedido) {
        this.pedido = pedido;
    }

    public Integer getUnidades() {
        return unidades;
    }

    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "LineaPedidoEntity [id=" + id + ", producto=" + producto + ", unidades=" + unidades + ", pedido=" + pedido + "]";
    }

}
