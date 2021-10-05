package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductManagerTest {
    ProductManager manager = new ProductManager();
    Book book1 = new Book(1, "название 1", 1000, "автор 1");
    Book book2 = new Book(2, "название 2", 2000, "автор 2");
    Book book3 = new Book(3, "название 3", 3000, "автор 3");
    Smartphone smartphone1 = new Smartphone(4, "название 4", 4000, "компания 1");
    Smartphone smartphone2 = new Smartphone(5, "название 5", 5000, "компания 2");
    Smartphone smartphone3 = new Smartphone(6, "название 6", 6000, "компания 3");
    Book book4 = new Book(7, "название 7", 7000, "автор 4");

    @BeforeEach
    public void setUp() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
    }

    @Test
    public void shouldSearchByNameSmart() {

        Product[] actual = manager.searchBy("название 5");
        Product[] expected = new Product[]{smartphone2};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByNameBook() {

        Product[] actual = manager.searchBy("название 2");
        Product[] expected = new Product[]{book2};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByCompanySmart() {

        Product[] actual = manager.searchBy("компания 1");
        Product[] expected = new Product[]{smartphone1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByAuthorBook() {

        Product[] actual = manager.searchBy("автор 3");
        Product[] expected = new Product[]{book3};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNoSearchBy() {

        Product[] actual = manager.searchBy("название 8");
        Product[] expected = new Product[]{};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByProduct() {
        Product product = new Product(8, "имя", 500);

        manager.add(product);

        Product[] actual = manager.searchBy("имя");
        Product[] expected = new Product[]{};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByDouble() {
        Book book5 = new Book(8, "название 4", 7000, "автор 4");
        manager.add(book5);

        Product[] actual = manager.searchBy("название 4");
        Product[] expected = new Product[]{smartphone1, book5};
        assertArrayEquals(expected, actual);
    }
}