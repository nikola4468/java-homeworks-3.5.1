package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {

    @Test
    public void shouldMatches() {
        Book book = new Book(1, "название 1", 1000, "автор 1");
        assertEquals(true, book.matches("автор 1"));
        assertEquals(false, book.matches("автор 2"));

    }
}