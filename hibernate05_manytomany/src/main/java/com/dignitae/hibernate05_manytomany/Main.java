package com.dignitae.hibernate05_manytomany;

import com.dignitae.hibernate05_manytomany.dao.CourseDao;
import com.dignitae.hibernate05_manytomany.dao.StudentDao;
import com.dignitae.hibernate05_manytomany.model.CourseEntity;
import com.dignitae.hibernate05_manytomany.model.StudentEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        
        //Creamos el objeto EntityManagerFactory vinculado a una unidad de persistencia
        //Si está configurado para ello, el esquema físico se creará en este momento
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        StudentEntity student1 = new StudentEntity();
        student1.setName("Hector");

        CourseEntity course1 = new CourseEntity();
        course1.setName("Python");

        CourseEntity course2 = new CourseEntity();
        course2.setName("MongoDB");
        
        //IMPORTANTE: primero se deben persistir las dos entidades relacionadas

        //Persistimos el estudiante
        StudentDao studentDao = new StudentDao(entityManager);
        studentDao.add(student1);        

        //Persistimos los cursos
        CourseDao courseDao = new CourseDao(entityManager);
        courseDao.add(course1);
        courseDao.add(course2);
        
        //Asociamos los cursos al estudiante
        student1.addCourse(course1);
        student1.addCourse(course2);
        
        //Persistimos en la tabla intermedia
        //Podríamos hacerlo de 2 formas: 
        //1: agregando el curso al estudiante ya existente y haciendo update 
        studentDao.update(student1);
        //2: Creando un DAO para la tabla intermedia y añadiendo la fila

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