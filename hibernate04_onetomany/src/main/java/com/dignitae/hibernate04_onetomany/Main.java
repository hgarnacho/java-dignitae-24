package com.dignitae.hibernate04_onetomany;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import com.dignitae.hibernate04_onetomany.dao.DepartamentDao;
import com.dignitae.hibernate04_onetomany.dao.EmployeeDao;
import com.dignitae.hibernate04_onetomany.model.DepartmentEntity;
import com.dignitae.hibernate04_onetomany.model.EmployeeEntity;;

public class Main {
    public static void main(String[] args) {
        //Creamos el objeto EntityManagerFactory vinculado a una unidad de persistencia
        //Si está configurado para ello, el esquema físico se creará en este momento
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        DepartmentEntity department1= new DepartmentEntity();
        department1.setName("Departamento 1");

        DepartamentDao departmentDao = new DepartamentDao(entityManager);
        departmentDao.add(department1);
    
        EmployeeEntity employee1 = new EmployeeEntity();
        employee1.setName("Héctor");
        employee1.setDepartment(department1);
        
        EmployeeDao employeeDao = new EmployeeDao(entityManager);
        employeeDao.add(employee1);

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