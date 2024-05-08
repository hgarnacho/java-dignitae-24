package com.dignitae.springboot07_mvcthymeleaf.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="pedido")
public class PedidoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="fecha")
	@CreatedDate
	private Date fechaHoraCreacion;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private ClienteEntity cliente;

    // Relación OneToMany con la entidad LineaPedido
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private List<LineaPedidoEntity> lineasPedido = new ArrayList<>();

    public PedidoEntity() {        
        this.fechaHoraCreacion = new Date();
        this.cliente = null;
    }
    
    public PedidoEntity(ClienteEntity cliente) {        
        this.fechaHoraCreacion = new Date();
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public Date getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    public void setFechaHoraCreacion(Date fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }

    public ClienteEntity getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEntity cliente) {
        this.cliente = cliente;
    }

    public List<LineaPedidoEntity> getLineasPedido() {
        return lineasPedido;
    }

    public void setLineasPedido(List<LineaPedidoEntity> lineasPedido) {
        this.lineasPedido = lineasPedido;
    }

    @Override
    public String toString() {
        return "PedidoEntity [id=" + id + ", fechaHoraCreacion=" + fechaHoraCreacion + ", cliente=" + cliente
                + ", lineasPedido=" + lineasPedido + "]";
    }

    public void addLineaPedido(ProductoEntity pe, Integer unidades){    
        if (this.id == null) {
            throw new IllegalStateException("El ID del pedido no puede ser null. El pedido debe haberse persistido antes de añadir lineas de pedido.");
        }    
        this.lineasPedido.add(new LineaPedidoEntity(pe, unidades, this));
    }
   
}
