package com.dignitae.hibernate03_onetoone.dao;

import com.dignitae.hibernate03_onetoone.model.UserEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UserDao {

    private EntityManager entityManager;

    public UserDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public long add(UserEntity u) {
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();

            // Guardar el producto en la base de datos
            entityManager.persist(u);

            // Commit transacción
            entityManager.getTransaction().commit();
            System.out.println("Usuario guardado exitosamente con ID: " + u.getId());
            return u.getId();

        } catch (Exception e) {
            // En caso de error, hacer rollback de la transacción
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
            return 0;
        }
    }

}