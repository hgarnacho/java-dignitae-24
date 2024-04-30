package com.dignitae.hibernate02_onetoone.dao;

import com.dignitae.hibernate02_onetoone.model.AccountEntity;

import jakarta.persistence.EntityManager;

public class AccountDao {

    private EntityManager entityManager;

    public AccountDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public long add(AccountEntity a) {
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();

            // Guardar el producto en la base de datos
            entityManager.persist(a);

            // Commit transacción
            entityManager.getTransaction().commit();
            System.out.println("Usuario guardado exitosamente con ID: " + a.getId());
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

}
