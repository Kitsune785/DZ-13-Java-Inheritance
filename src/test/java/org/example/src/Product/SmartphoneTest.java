package org.example.src.Product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartphoneTest {

    @Test
    void shouldShowNameSmartphone() {
        Smartphone smartphone = new Smartphone();
        smartphone.setName("Телефон 1");

        String expected = ("Телефон 1");
        String actual = smartphone.getName();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowMakerSmartphone() {
        Smartphone smartphone = new Smartphone();
        smartphone.setMaker("Производитель 1");

        String expected = ("Производитель 1");
        String actual = smartphone.getMaker();

        assertEquals(expected, actual);
    }
}
