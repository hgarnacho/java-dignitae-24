package com.dignitae.hibernate02_entitymanager;

import com.dignitae.hibernate02_entitymanager.dao.ProductDao;
import com.dignitae.hibernate02_entitymanager.model.ProductEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    
    public static void main(String[] args){
     
        //Creamos el objeto EntityManagerFactory vinculado a una unidad de persistencia
        //Si está configurado para ello, el esquema físico se creará en este momento
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        //Creamos un DAO para ProductEntity
        ProductDao productDao = new ProductDao(entityManager);        

        //Creamos dos objetos de tipo ProductEntity
        ProductEntity productEntity = new ProductEntity("Marca", "Modelo", 100, 10L);
        ProductEntity productEntity2 = new ProductEntity("Marca2", "Modelo2", 200, 20L);
        
        //Persistimos en la BD la entidad product
        //productDao.add(productEntity);
        productDao.add(productEntity);
        
        //Persistimos un segundo producto
        productDao.add(productEntity2);

        //Modificamos el segundo producto
        productEntity2.setModelo("Modelo modificado");
        productEntity2.setMarca("Marca modificada");
        productEntity2.setPrecio(1000);
        productEntity2.setStock(1000L);
        
        productDao.update(productEntity);

        //Buscamos un producto por Id
        ProductEntity productEntity3 = productDao.findById(1L);
        if(null != productEntity3){
            System.out.println(productEntity3);
        }

        //Añadimos un nuevo elemento que posteriormente borraremos
        ProductEntity productEntity4 = new ProductEntity("Marca borrar", "Modelo borrar", 1000, 10L);
        productDao.add(productEntity4);

        //Borramos el producto que acabamos de añadir
        productDao.delete(productEntity4.getId());

        //Cerramos el objeto EntityManager
        if (entityManager != null && entityManager.isOpen()) {
            entityManager.close();
        }

        //Cerramos el objeto EntityManagerFactory
        if (entityManagerFactory != null && entityManagerFactory.isOpen()) {
            entityManagerFactory.close();
        }

    }

}