package org.example.src.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    void shouldShowId() {
        Product product = new Product();
        product.setId(1);

        int expected = 1;
        int actual = product.getId();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowName() {
        Product product = new Product();
        product.setName("Продукт 1");

        String expected = ("Продукт 1");
        String actual = product.getName();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowPrice() {
        Product product = new Product();
        product.setPrice(100);

        int expected = 100;
        int actual = product.getPrice();

        assertEquals(expected, actual);
    }
}
