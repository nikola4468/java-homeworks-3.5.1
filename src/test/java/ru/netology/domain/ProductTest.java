package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductTest {
    @Test
    public void shouldUseEquals() {
        Product first = new Product(1, "Java I", 1000);
        Product second = new Product(1, "Java I", 1000);
        assertEquals(first, second);
    }

    @Test
    public void shouldMatches() {
        Product first = new Product(1, "Java I", 1000);
        assertEquals(true, first.matches("Java I"));
        assertEquals(false, first.matches("Java II"));

    }
}