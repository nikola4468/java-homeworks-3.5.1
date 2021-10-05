package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    @Test
    public void shouldMatches() {
        Smartphone smartphone = new Smartphone(4, "название 4", 4000, "компания 1");
        assertTrue(smartphone.matches("компания 1"));
        assertFalse(smartphone.matches("компания 2"));

    }

}