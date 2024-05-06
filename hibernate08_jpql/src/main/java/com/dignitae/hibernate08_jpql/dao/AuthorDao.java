package com.dignitae.hibernate08_jpql.dao;

import com.dignitae.hibernate08_jpql.model.AuthorEntity;

import jakarta.persistence.EntityManager;

public class AuthorDao {

    private EntityManager entityManager;

    public AuthorDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public long add(AuthorEntity a) {       
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();

            // Guardar el autor en la base de datos
            entityManager.persist(a);

            // Commit transacción
            entityManager.getTransaction().commit();
            System.out.println("Autor guardado exitosamente con ID: " + a.getId());
            return a.getId();

        } catch (Exception e) {
            // En caso de error, hacer rollback de la transacción
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
            return 0;
        }
    }

    public AuthorEntity findById(Long authorId){
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();
    
            // Buscar el autor en la base de datos por su ID
            AuthorEntity authorEntity = entityManager.find(AuthorEntity.class, authorId);

            // Commit transacción
            entityManager.getTransaction().commit();
            
            if (authorEntity != null) {
                System.out.println("Autor encontrado con ID: " + authorId);
            } else {
                System.out.println("No se encontró el autor con ID: " + authorId);
            }
    
            return authorEntity;
    
        } catch (Exception e) {
            // En caso de error, hacer rollback de la transacción
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
            return null;
        }
    }

    public long update(AuthorEntity updatedAuthor) {       
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();

            // Actualizar el autor en la base de datos
            AuthorEntity existingAuthor = entityManager.find(AuthorEntity.class, updatedAuthor.getId());
            if (existingAuthor != null) {
                existingAuthor.setName(updatedAuthor.getName());
                existingAuthor.setBooks(updatedAuthor.getBooks());
                //Llamamos al método de actualización del entityManager
                entityManager.merge(existingAuthor);
            } else {
                // Manejar el caso en que el autor no existe
                System.out.println("No se encontró el autor con ID: " + updatedAuthor.getId());
                return 0;
            }

            // Commit transacción
            entityManager.getTransaction().commit();
            System.out.println("Autor actualizado exitosamente con ID: " + updatedAuthor.getId());
            return updatedAuthor.getId();

        } catch (Exception e) {
            // En caso de error, hacer rollback de la transacción
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
            return 0;
        }
    }

    public boolean delete(long authorId) {       
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();
    
            // Buscar el autor en la base de datos por su ID
            AuthorEntity authorEntity = entityManager.find(AuthorEntity.class, authorId);
            if (authorEntity != null) {
                // Eliminar el autor de la base de datos
                entityManager.remove(authorEntity);
                System.out.println("Autor eliminado exitosamente con ID: " + authorId);
            } else {
                // Manejar el caso en que el autor no existe
                System.out.println("No se encontró el autor con ID: " + authorId);
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

