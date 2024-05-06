package com.dignitae.hibernate07_sql.dao;

import java.util.List;

import jakarta.persistence.Query;

import com.dignitae.hibernate07_sql.model.BookEntity;

import jakarta.persistence.EntityManager;

public class BookDao {

    private EntityManager entityManager;

    public BookDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public long add(BookEntity b) {       
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();

            // Guardar el libro en la base de datos
            entityManager.persist(b);

            // Commit transacción
            entityManager.getTransaction().commit();
            System.out.println("Libro guardado exitosamente con ID: " + b.getId());
            return b.getId();

        } catch (Exception e) {
            // En caso de error, hacer rollback de la transacción
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
            return 0;
        }
    }

    public BookEntity findById(Long bookId){
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();
    
            // Buscar el libro en la base de datos por su ID
            BookEntity bookEntity = entityManager.find(BookEntity.class, bookId);

            // Commit transacción
            entityManager.getTransaction().commit();
            
            if (bookEntity != null) {
                System.out.println("Libro encontrado con ID: " + bookId);
            } else {
                System.out.println("No se encontró el libro con ID: " + bookId);
            }
    
            return bookEntity;
    
        } catch (Exception e) {
            // En caso de error, hacer rollback de la transacción
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
            return null;
        }
    }

    public long update(BookEntity updatedBook) {       
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();

            // Actualizar el libro en la base de datos
            BookEntity existingBook = entityManager.find(BookEntity.class, updatedBook.getId());
            if (existingBook != null) {
                existingBook.setTitle(updatedBook.getTitle());
                existingBook.setAuthor(updatedBook.getAuthor());
                
                //Llamamos al método de actualización del entityManager
                entityManager.merge(existingBook);
            } else {
                // Manejar el caso en que el libro no existe
                System.out.println("No se encontró el libro con ID: " + updatedBook.getId());
                return 0;
            }

            // Commit transacción
            entityManager.getTransaction().commit();
            System.out.println("Libro actualizado exitosamente con ID: " + updatedBook.getId());
            return updatedBook.getId();

        } catch (Exception e) {
            // En caso de error, hacer rollback de la transacción
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
            return 0;
        }
    }

    public boolean delete(long bookId) {       
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();
    
            // Buscar el libro en la base de datos por su ID
            BookEntity bookEntity = entityManager.find(BookEntity.class, bookId);
            if (bookEntity != null) {
                // Eliminar el libro de la base de datos
                entityManager.remove(bookEntity);
                System.out.println("Libro eliminado exitosamente con ID: " + bookId);
            } else {
                // Manejar el caso en que el libro no existe
                System.out.println("No se encontró el libro con ID: " + bookId);
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

    public List<BookEntity> selectSQL(String sqlQuery) {
        Query query = this.entityManager.createNativeQuery(sqlQuery, BookEntity.class);
        List<BookEntity> results = (List<BookEntity>)query.getResultList();
        return results;
    }


}
