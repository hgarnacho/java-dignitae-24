package com.dignitae.hibernate06_cascada;

import com.dignitae.hibernate06_cascada.dao.AuthorDao;
import com.dignitae.hibernate06_cascada.dao.BookDao;
import com.dignitae.hibernate06_cascada.model.AuthorEntity;
import com.dignitae.hibernate06_cascada.model.BookEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        //Al borrar un autor queremos que se eliminen todos sus libros
        
        //Creamos el objeto EntityManagerFactory vinculado a una unidad de persistencia
        //Si está configurado para ello, el esquema físico se creará en este momento
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        //Creamos y persistimos un autor
        AuthorEntity author = new AuthorEntity();
        author.setName("Gabriel García Márquez");
        AuthorDao authorDao = new AuthorDao(entityManager);
        authorDao.add(author);

        //Creamos y persistimos 3 libros
        BookEntity book1 = new BookEntity();
        BookEntity book2 = new BookEntity();
        BookEntity book3 = new BookEntity();
        book1.setTitle("100 años de soledad");
        book1.setAuthor(author);
        book2.setTitle("El amor en los tiempos del cólera");
        book2.setAuthor(author);
        book3.setTitle("Crónica de una muerte anunciada");
        book3.setAuthor(author);

        BookDao bookDao = new BookDao(entityManager);
        bookDao.add(book1);
        bookDao.add(book2);
        bookDao.add(book3);

        //Asignamos los libros al autor
        author.addBook(book1);
        author.addBook(book2);
        author.addBook(book3);
        

        //Borramos en cascada. al eliminar el autor se eliminan todos sus libros
        authorDao.delete(1);

    }
}