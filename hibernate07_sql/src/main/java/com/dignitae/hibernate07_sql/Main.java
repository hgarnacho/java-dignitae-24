package com.dignitae.hibernate07_sql;

import java.util.List;

import com.dignitae.hibernate07_sql.dao.AuthorDao;
import com.dignitae.hibernate07_sql.dao.BookDao;
import com.dignitae.hibernate07_sql.model.AuthorEntity;
import com.dignitae.hibernate07_sql.model.BookEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        
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

        List<BookEntity> books = bookDao.selectSQL("select *  from libro;");
        for (BookEntity book : books) {
            System.out.println(book);
        }

        List<Object[]> resultados = authorDao.obtenerAutoresConNumeroDeLibros();
        for (Object[] resultado : resultados) {
            AuthorEntity autor = (AuthorEntity) resultado[0];
            Long numeroDeLibros = (Long) resultado[1];
            System.out.println("Autor: " + autor.getName() + ", Número de libros: " + numeroDeLibros);
        }

    }
}