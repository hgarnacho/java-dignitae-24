package com.dignitae.hibernate03_onetoone;

import com.dignitae.hibernate03_onetoone.dao.UserDao;
import com.dignitae.hibernate03_onetoone.model.AccountEntity;
import com.dignitae.hibernate03_onetoone.model.UserEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class Main {
    public static void main(String[] args) {
        
        //Creamos el objeto EntityManagerFactory vinculado a una unidad de persistencia
        //Si está configurado para ello, el esquema físico se creará en este momento
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        UserEntity user = new UserEntity();
        user.setName("Héctor");
        user.setSurname("Garnacho");
        
        AccountEntity accountEntity = new AccountEntity();
        accountEntity.setLogin("login");
        accountEntity.setPassword("1234");

        user.setAccount(accountEntity);
        accountEntity.setUser(user);

        UserDao userDao = new UserDao(entityManager);
        userDao.add(user);

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