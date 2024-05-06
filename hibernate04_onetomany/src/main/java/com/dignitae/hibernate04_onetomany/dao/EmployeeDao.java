package com.dignitae.hibernate04_onetomany.dao;

import com.dignitae.hibernate04_onetomany.model.EmployeeEntity;
import jakarta.persistence.EntityManager;

public class EmployeeDao {

    private EntityManager entityManager;

    public EmployeeDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public long add(EmployeeEntity s) {       
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();

            // Guardar el empleado en la base de datos
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

    public EmployeeEntity findById(Long employeeId){
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();
    
            // Buscar el empleado en la base de datos por su ID
            EmployeeEntity employee = entityManager.find(EmployeeEntity.class, employeeId);

            // Commit transacción
            entityManager.getTransaction().commit();
            
            if (employee != null) {
                System.out.println("Departamento encontrado con ID: " + employeeId);
            } else {
                System.out.println("No se encontró el empleado con ID: " + employeeId);
            }
    
            return employee;
    
        } catch (Exception e) {
            // En caso de error, hacer rollback de la transacción
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
            return null;
        }
    }

    public long update(EmployeeEntity updatedEmployee) {       
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();

            // Actualizar el empleado en la base de datos
            EmployeeEntity existingEmployee = entityManager.find(EmployeeEntity.class, updatedEmployee.getId());
            if (existingEmployee != null) {
                existingEmployee.setName(updatedEmployee.getName());
                existingEmployee.setDepartment(updatedEmployee.getDepartment());
                //Llamamos al método de actualización del entityManager
                entityManager.merge(existingEmployee);
            } else {
                // Manejar el caso en que el empleado no existe
                System.out.println("No se encontró el empleado con ID: " + updatedEmployee.getId());
                return 0;
            }

            // Commit transacción
            entityManager.getTransaction().commit();
            System.out.println("Empleado actualizado exitosamente con ID: " + updatedEmployee.getId());
            return updatedEmployee.getId();

        } catch (Exception e) {
            // En caso de error, hacer rollback de la transacción
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
            return 0;
        }
    }

    public boolean delete(long employeeId) {       
        try {
            // Comenzar transacción
            entityManager.getTransaction().begin();
    
            // Buscar el empleado en la base de datos por su ID
            EmployeeEntity employee = entityManager.find(EmployeeEntity.class, employeeId);
            if (employee != null) {
                // Eliminar el empleado de la base de datos
                entityManager.remove(employee);
                System.out.println("Curso eliminado exitosamente con ID: " + employeeId);
            } else {
                // Manejar el caso en que el empleado no existe
                System.out.println("No se encontró el empleado con ID: " + employeeId);
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
