package com.dignitae.hibernate02_entitymanager.dao;
import com.dignitae.hibernate02_entitymanager.model.ProductEntity;

import jakarta.persistence.EntityManager;
public class ProductDao {

    private EntityManager entityManager;

    public ProductDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public long add(ProductEntity p) {       
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();

            // Guardar el producto en la base de datos
            entityManager.persist(p);

            // Commit transacción
            entityManager.getTransaction().commit();
            System.out.println("Producto guardado exitosamente con ID: " + p.getId());
            return p.getId();

        } catch (Exception e) {
            // En caso de error, hacer rollback de la transacción
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
            return 0;
        }
    }

    public ProductEntity findById(Long productId){
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();
    
            // Buscar el producto en la base de datos por su ID
            ProductEntity productEntity = entityManager.find(ProductEntity.class, productId);

            // Commit transacción
            entityManager.getTransaction().commit();
            
            if (productEntity != null) {
                System.out.println("Producto encontrado con ID: " + productId);
            } else {
                System.out.println("No se encontró el producto con ID: " + productId);
            }
    
            return productEntity;
    
        } catch (Exception e) {
            // En caso de error, hacer rollback de la transacción
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
            return null;
        }
    }

    public long update(ProductEntity updatedProduct) {       
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();

            // Actualizar el producto en la base de datos
            ProductEntity existingProduct = entityManager.find(ProductEntity.class, updatedProduct.getId());
            if (existingProduct != null) {
                existingProduct.setMarca(updatedProduct.getMarca());
                existingProduct.setModelo(updatedProduct.getModelo());
                existingProduct.setPrecio(updatedProduct.getPrecio());
                existingProduct.setStock(updatedProduct.getStock());
                //Llamamos al método de actualización del entityManager
                entityManager.merge(existingProduct);
            } else {
                // Manejar el caso en que el producto no existe
                System.out.println("No se encontró el producto con ID: " + updatedProduct.getId());
                return 0;
            }

            // Commit transacción
            entityManager.getTransaction().commit();
            System.out.println("Producto actualizado exitosamente con ID: " + updatedProduct.getId());
            return updatedProduct.getId();

        } catch (Exception e) {
            // En caso de error, hacer rollback de la transacción
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
            return 0;
        }
    }

    public boolean delete(long productId) {       
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();
    
            // Buscar el producto en la base de datos por su ID
            ProductEntity productEntity = entityManager.find(ProductEntity.class, productId);
            if (productEntity != null) {
                // Eliminar el producto de la base de datos
                entityManager.remove(productEntity);
                System.out.println("Producto eliminado exitosamente con ID: " + productId);
            } else {
                // Manejar el caso en que el producto no existe
                System.out.println("No se encontró el producto con ID: " + productId);
                return false;
            }
    
            // Commit transacción
            entityManager.getTransaction().commit();
    
            return true;
    
        } catch (Exception e) {
            // En caso de error, hacer rollback de la transacción
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
            return false;
        }
    }

}