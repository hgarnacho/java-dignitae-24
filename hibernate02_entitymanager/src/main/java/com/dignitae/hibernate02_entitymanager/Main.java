package com.dignitae.hibernate02_entitymanager;

import com.dignitae.hibernate02_entitymanager.dao.ProductDao;
import com.dignitae.hibernate02_entitymanager.model.ProductEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        //Creamos el objeto EntityManagerFactory vinculado a una unidad de persistencia
        //Si está configurado para ello, el esquema físico se creará en este momento
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        ProductDao productDao = new ProductDao(entityManager);

        //Creamos un producto
        ProductEntity product = new ProductEntity();
        product.setMarca("Marca Ejemplo");
        product.setModelo("Modelo Ejemplo");
        product.setPrecio(120.99);
        product.setStock(100);
        product.setTipo("Tipo ejemplo");

        //Persistimos el objeto product en la bd
        if( 0 != productDao.add(product) ) {
            System.out.println("Producto insertado correctamente");
        }
        
        //Modificamos un objeto
        ProductEntity product2 = new ProductEntity("Marca2", "Modelo2", 200, 20L, "Tipo");
        productDao.add(product2);
        product2.setMarca("Marca modificado");
        product2.setModelo("Modelo modificado");
        if( 0 != productDao.update(product2) ){
            System.out.println("Producto modificado correctamente");
        }

        ProductEntity product3 = new ProductEntity("Marca3", "Modelo3", 200, 20L, "Tipo 3");
        productDao.add(product3);
        productDao.delete(3);

        ProductEntity productoBuscar = productDao.findById(1L);
        if(null != productoBuscar){
            System.out.println("Producto encontrado: " + productoBuscar.toString());
        }

        //Cerramos el objeto EntityManager
        if (null != entityManager  && entityManager.isOpen()) {
            entityManager.close();
        }

        //Cerramos el objeto EntityManagerFactory
        if (null != entityManagerFactory && entityManagerFactory.isOpen()) {
            entityManagerFactory.close();
        }      

        
    }
}