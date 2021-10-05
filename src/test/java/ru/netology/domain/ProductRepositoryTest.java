package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductRepositoryTest {
    ProductRepository repository = new ProductRepository();
    Book book1 = new Book(1, "название 1", 1000, "автор 1");
    Book book2 = new Book(2, "название 2", 2000, "автор 2");
    Book book3 = new Book(3, "название 3", 3000, "автор 3");
    Smartphone smartphone1 = new Smartphone(4, "название 4", 4000, "компания 1");
    Smartphone smartphone2 = new Smartphone(5, "название 5", 5000, "компания 2");
    Smartphone smartphone3 = new Smartphone(6, "название 6", 6000, "компания 3");
    Book book4 = new Book(7, "название 4", 7000, "автор 4");

    @BeforeEach
    public void setUp() {
        repository.save(book1);
        repository.save(book2);
        repository.save(book3);
        repository.save(book4);
        repository.save(smartphone1);
        repository.save(smartphone2);
        repository.save(smartphone3);
    }

    @Test
    public void shouldFindByIdBook() {

        Product actual = repository.findById(3);
        Product expected = new Book(3, "название 3", 3000, "автор 3");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindByIdSmart() {

        Product actual = repository.findById(5);
        Product expected = new Smartphone(5, "название 5", 5000, "компания 2");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindByIdNo() {

        Product actual = repository.findById(8);
        assertEquals(null, actual);
    }

    @Test
    public void shouldRemoveById() {
        repository.removeById(4);

        Product[] actual = repository.findAll();
        Product[] expected = new Product[]{book1, book2, book3, book4, smartphone2, smartphone3};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveByNoId() {
        repository.removeById(8);

        Product[] actual = repository.findAll();
        Product[] expected = new Product[]{book1, book2, book3, book4, smartphone1, smartphone2, smartphone3};

        assertArrayEquals(expected, actual);
    }
}