package com.dignitae.hibernate04_onetomany.dao;

import com.dignitae.hibernate04_onetomany.model.DepartmentEntity;
import jakarta.persistence.EntityManager;

public class DepartamentDao {

    private EntityManager entityManager;

    public DepartamentDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public long add(DepartmentEntity s) {       
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();

            // Guardar el departamento en la base de datos
            entityManager.persist(s);

            // Commit transacción
            entityManager.getTransaction().commit();
            System.out.println("Departamento guardado exitosamente con ID: " + s.getId());
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

    public DepartmentEntity findById(Long departmentId){
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();
    
            // Buscar el departamento en la base de datos por su ID
            DepartmentEntity department = entityManager.find(DepartmentEntity.class, departmentId);

            // Commit transacción
            entityManager.getTransaction().commit();
            
            if (department != null) {
                System.out.println("Departamento encontrado con ID: " + departmentId);
            } else {
                System.out.println("No se encontró el departamento con ID: " + departmentId);
            }
    
            return department;
    
        } catch (Exception e) {
            // En caso de error, hacer rollback de la transacción
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
            return null;
        }
    }

    public long update(DepartmentEntity updatedDepartment) {       
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();

            // Actualizar el departamento en la base de datos
            DepartmentEntity existingDepartment = entityManager.find(DepartmentEntity.class, updatedDepartment.getId());
            if (existingDepartment != null) {
                existingDepartment.setName(updatedDepartment.getName());
                existingDepartment.setEmployees(updatedDepartment.getEmployees());
                //Llamamos al método de actualización del entityManager
                entityManager.merge(existingDepartment);
            } else {
                // Manejar el caso en que el departamento no existe
                System.out.println("No se encontró el Departamento con ID: " + updatedDepartment.getId());
                return 0;
            }

            // Commit transacción
            entityManager.getTransaction().commit();
            System.out.println("Departamento actualizado exitosamente con ID: " + updatedDepartment.getId());
            return updatedDepartment.getId();

        } catch (Exception e) {
            // En caso de error, hacer rollback de la transacción
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
            return 0;
        }
    }

    public boolean delete(long departmentId) {       
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();
    
            // Buscar el departamento en la base de datos por su ID
            DepartmentEntity department = entityManager.find(DepartmentEntity.class, departmentId);
            if (department != null) {
                // Eliminar el departamento de la base de datos
                entityManager.remove(department);
                System.out.println("Curso eliminado exitosamente con ID: " + departmentId);
            } else {
                // Manejar el caso en que el departamento no existe
                System.out.println("No se encontró el departamento con ID: " + departmentId);
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
