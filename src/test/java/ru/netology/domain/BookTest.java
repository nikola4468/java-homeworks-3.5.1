package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BookTest {

    @Test
    public void shouldMatchesTr() {
        Book book = new Book(1, "название 1", 1000, "автор 1");
        assertTrue(book.matches("автор 1"));
    }

    @Test
    public void shouldMatchesFa() {
        Book book = new Book(1, "название 1", 1000, "автор 1");
        assertFalse(book.matches("автор 2"));
    }
}