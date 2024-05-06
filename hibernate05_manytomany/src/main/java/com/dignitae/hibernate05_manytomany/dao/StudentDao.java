package com.dignitae.hibernate05_manytomany.dao;

import com.dignitae.hibernate05_manytomany.model.CourseEntity;
import com.dignitae.hibernate05_manytomany.model.StudentEntity;

import jakarta.persistence.EntityManager;

public class StudentDao {

    private EntityManager entityManager;

    public StudentDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public long add(StudentEntity s) {       
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();

            // Guardar el estudiante en la base de datos
            entityManager.persist(s);

            // Commit transacción
            entityManager.getTransaction().commit();
            System.out.println("estudiante guardado exitosamente con ID: " + s.getId());
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

    public StudentEntity findById(Long studentId){
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();
    
            // Buscar el estudiante en la base de datos por su ID
            StudentEntity studentEntity = entityManager.find(StudentEntity.class, studentId);

            // Commit transacción
            entityManager.getTransaction().commit();
            
            if (studentEntity != null) {
                System.out.println("estudiante encontrado con ID: " + studentId);
            } else {
                System.out.println("No se encontró el estudiante con ID: " + studentId);
            }
    
            return studentEntity;
    
        } catch (Exception e) {
            // En caso de error, hacer rollback de la transacción
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
            return null;
        }
    }

    public long update(StudentEntity updatedStudent) {       
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();

            // Actualizar el estudiante en la base de datos
            StudentEntity existingStudent = entityManager.find(StudentEntity.class, updatedStudent.getId());
            if (existingStudent != null) {
                existingStudent.setName(updatedStudent.getName());
                existingStudent.setCourses(updatedStudent.getCourses());
                //Llamamos al método de actualización del entityManager
                entityManager.merge(existingStudent);
            } else {
                // Manejar el caso en que el estudiante no existe
                System.out.println("No se encontró el estudiante con ID: " + updatedStudent.getId());
                return 0;
            }

            // Commit transacción
            entityManager.getTransaction().commit();
            System.out.println("Estudiante actualizado exitosamente con ID: " + updatedStudent.getId());
            return updatedStudent.getId();

        } catch (Exception e) {
            // En caso de error, hacer rollback de la transacción
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
            return 0;
        }
    }

    public boolean delete(long studentId) {       
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();
    
            // Buscar el estudiante en la base de datos por su ID
            StudentEntity studentEntity = entityManager.find(StudentEntity.class, studentId);
            if (studentEntity != null) {
                // Eliminar el estudiante de la base de datos
                entityManager.remove(studentEntity);
                System.out.println("Estudiante eliminado exitosamente con ID: " + studentId);
            } else {
                // Manejar el caso en que el estudiante no existe
                System.out.println("No se encontró el estudiante con ID: " + studentId);
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