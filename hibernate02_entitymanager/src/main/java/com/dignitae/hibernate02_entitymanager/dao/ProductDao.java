package com.dignitae.hibernate02_entitymanager.dao;

import com.dignitae.hibernate02_entitymanager.model.ProductEntity;

import jakarta.persistence.EntityManager;

public class ProductDao {

    private EntityManager entityManager;

    public ProductDao(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public long add(ProductEntity product){
        try{
            
            entityManager.getTransaction().begin();
            entityManager.persist(product);
            entityManager.getTransaction().commit();
            System.out.println("Objeto ProductEntity persistido con Id: " + product.getId());
            return product.getId();

        } catch(Exception e){

            if(entityManager.getTransaction().isActive()){
                entityManager.getTransaction().rollback();
            }

            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }

    public long update(ProductEntity product){
        try{

            entityManager.getTransaction().begin();
            ProductEntity productToUpdate = entityManager.find(ProductEntity.class, product.getId());

            if(null != productToUpdate){
                
                productToUpdate.setMarca(product.getMarca());
                productToUpdate.setModelo(product.getModelo());
                productToUpdate.setPrecio(product.getPrecio());
                productToUpdate.setStock(product.getStock());
                productToUpdate.setTipo(product.getTipo());
                entityManager.merge(productToUpdate);
                entityManager.getTransaction().commit();
                System.out.println("Producto actualizado correctamente con Id: " + product.getId());

                return productToUpdate.getId();

            } else {
                System.out.println("No se encontro el objeto ProductEntity con Id: " + product.getId());
                return 0;
            }


        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            return 0;
        }        
    }

    public long delete(long productId){
        try{
            
            entityManager.getTransaction().begin();
            ProductEntity productToDelete = entityManager.find(ProductEntity.class, productId);

            if(null != productToDelete){
                entityManager.remove(productToDelete);
                entityManager.getTransaction().commit();
                System.out.println("Producto eliminado correctamente con Id: " + productId);
                return productId;
            } else {            
                System.out.println("No se encontro el objeto ProductEntity con Id: " + productId);
                return 0;
            }

        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }

    public ProductEntity findById(Long productId){
        try{

            entityManager.getTransaction().begin();
            ProductEntity product = entityManager.find(ProductEntity.class, productId);
            entityManager.getTransaction().commit();

            if(null != product){
                System.out.println("Producto encontrado con Id: " + productId);
    
            } else {
                System.out.println("No se encontro el objeto con Id: " + productId);
            }

            return product;

        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

}
