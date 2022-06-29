package org.example.src.Manager;

import org.example.src.Product.Book;
import org.example.src.Product.Smartphone;
import org.example.src.domain.Product;
import org.example.src.repository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {

    ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);

    Product book1 = new Book(1, "Книга 1", 100, "Автор 1");
    Product book2 = new Book(2, "Книга 2", 200, "Автор 2");
    Product smartphone1 = new Smartphone(1, "Телефон 1", 10_000, "Производитель 1");
    Product smartphone2 = new Smartphone(2, "Телефон 2", 20_000, "Производитель 2");


    @BeforeEach
    public void SetUp() {
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);
    }

    @Test
    public void shouldFindNameBook() {

        Product[] expected = {book1};
        Product[] actual = manager.searchBy("Книга 1");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindNamePhone() {

        Product[] expected = {smartphone2};
        Product[] actual = manager.searchBy("Телефон 2");

        Assertions.assertArrayEquals(expected, actual);
    }
}