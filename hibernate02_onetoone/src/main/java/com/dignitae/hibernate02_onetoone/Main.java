package com.dignitae.hibernate02_onetoone;

import com.dignitae.hibernate02_onetoone.dao.AccountDao;
import com.dignitae.hibernate02_onetoone.dao.UserDao;
import com.dignitae.hibernate02_onetoone.model.AccountEntity;
import com.dignitae.hibernate02_onetoone.model.UserEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        //Creamos el objeto EntityManagerFactory vinculado a una unidad de persistencia
        //Si está configurado para ello, el esquema físico se creará en este momento
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        UserDao userDao = new UserDao(entityManager);
        AccountDao accountDao = new AccountDao(entityManager);

        UserEntity user = new UserEntity("Héctor", "Garnacho");

        AccountEntity account = new AccountEntity("hector", "1234");

        user.setAccount(account);
        account.setUser(user);

        userDao.add(user);


        //===================================================================================

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