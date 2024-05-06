package com.dignitae.hibernate05_manytomany.dao;

import com.dignitae.hibernate05_manytomany.model.CourseEntity;

import jakarta.persistence.EntityManager;

public class CourseDao {

    private EntityManager entityManager;

    public CourseDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public long add(CourseEntity s) {       
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();

            // Guardar el curso en la base de datos
            entityManager.persist(s);

            // Commit transacción
            entityManager.getTransaction().commit();
            System.out.println("curso guardado exitosamente con ID: " + s.getId());
            return s.getId();

        } catch (Exception e) {
            // En caso de error, hacer rollback de la transacción
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
            return 0;
        }
    }

    public CourseEntity findById(Long courseId){
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();
    
            // Buscar el curso en la base de datos por su ID
            CourseEntity courseEntity = entityManager.find(CourseEntity.class, courseId);

            // Commit transacción
            entityManager.getTransaction().commit();
            
            if (courseEntity != null) {
                System.out.println("Curso encontrado con ID: " + courseId);
            } else {
                System.out.println("No se encontró el curso con ID: " + courseId);
            }
    
            return courseEntity;
    
        } catch (Exception e) {
            // En caso de error, hacer rollback de la transacción
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
            return null;
        }
    }

    public long update(CourseEntity updatedCourse) {       
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();

            // Actualizar el curso en la base de datos
            CourseEntity existingCourse = entityManager.find(CourseEntity.class, updatedCourse.getId());
            if (existingCourse != null) {
                existingCourse.setName(updatedCourse.getName());
                existingCourse.setStudents(updatedCourse.getStudents());
                //Llamamos al método de actualización del entityManager
                entityManager.merge(existingCourse);
            } else {
                // Manejar el caso en que el curso no existe
                System.out.println("No se encontró el curso con ID: " + updatedCourse.getId());
                return 0;
            }

            // Commit transacción
            entityManager.getTransaction().commit();
            System.out.println("Estudiante actualizado exitosamente con ID: " + updatedCourse.getId());
            return updatedCourse.getId();

        } catch (Exception e) {
            // En caso de error, hacer rollback de la transacción
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
            return 0;
        }
    }

    public boolean delete(long courseId) {       
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();
    
            // Buscar el curso en la base de datos por su ID
            CourseEntity courseEntity = entityManager.find(CourseEntity.class, courseId);
            if (courseEntity != null) {
                // Eliminar el curso de la base de datos
                entityManager.remove(courseEntity);
                System.out.println("Curso eliminado exitosamente con ID: " + courseId);
            } else {
                // Manejar el caso en que el curso no existe
                System.out.println("No se encontró el curso con ID: " + courseId);
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
