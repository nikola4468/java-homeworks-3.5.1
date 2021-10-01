package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmartphoneTest {
    @Test
    public void shouldMatches() {
        Smartphone smartphone = new Smartphone(4, "название 4", 4000, "компания 1");
        assertEquals(true, smartphone.matches("компания 1"));
        assertEquals(false, smartphone.matches("компания 2"));

    }

}