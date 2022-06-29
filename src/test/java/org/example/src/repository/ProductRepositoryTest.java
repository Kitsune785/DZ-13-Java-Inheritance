package org.example.src.repository;

import org.example.src.Product.Book;
import org.example.src.Product.Smartphone;
import org.example.src.domain.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductRepositoryTest {

    ProductRepository repo = new ProductRepository();

    Product book1 = new Book(1, "Книга 1", 100, "Автор 1");
    Product book2 = new Book(2, "Книга 2", 200, "Автор 2");

    Product smartphone1 = new Smartphone(3, "Телефон 1", 10_000, "Производитель 1");
    Product smartphone2 = new Smartphone(4, "Телефон 2", 20_000, "Производитель 2");

    @BeforeEach
    public void SetUp() {
        repo.addProduct(book1);
        repo.addProduct(smartphone1);
        repo.addProduct(smartphone2);
        repo.addProduct(book2);
    }

    @Test
    public void removeProductById() {

        repo.removeById(book1.getId());
        repo.removeById(smartphone1.getId());

        Product[] expected = {smartphone2, book2};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }
}
