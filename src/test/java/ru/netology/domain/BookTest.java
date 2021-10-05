package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    public void shouldMatches() {
        Book book = new Book(1, "название 1", 1000, "автор 1");
        assertTrue(book.matches("автор 1"));
        assertFalse(book.matches("автор 2"));

    }
}