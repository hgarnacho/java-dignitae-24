package com.dignitae.springboot07_mvcthymeleaf.services;

import java.util.List;
import com.dignitae.springboot07_mvcthymeleaf.entities.ProductoEntity;

public interface ProductoService {

    public void clearProductos();
    public List<ProductoEntity> getProductos();
    public void addProducto(ProductoEntity pe);
    public ProductoEntity updateProducto(Long Id, ProductoEntity pe);
    public void deleteProducto(Long id);
    public ProductoEntity findProductoById(Long Id);
    public void increaseStock(int cantidad);
    public List<ProductoEntity> addProductosDemo(int numeroProductos);

}
