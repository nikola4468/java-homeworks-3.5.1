package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SmartphoneTest {
    @Test
    public void shouldMatchesTr() {
        Smartphone smartphone = new Smartphone(4, "название 4", 4000, "компания 1");
        assertTrue(smartphone.matches("компания 1"));
    }

    @Test
    public void shouldMatchesFa() {
        Smartphone smartphone = new Smartphone(4, "название 4", 4000, "компания 1");
        assertFalse(smartphone.matches("компания 2"));
    }
}