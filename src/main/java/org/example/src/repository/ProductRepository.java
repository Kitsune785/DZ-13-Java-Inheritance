package org.example.src.repository;

import org.example.src.domain.Product;

public class ProductRepository {

    private Product[] product = new Product[0];

    public void addProduct(Product item) {
        int length = product.length + 1;
        Product[] tmp = new Product[length];
        System.arraycopy(product, 0, tmp, 0, product.length);
        int finalIndex = tmp.length - 1;
        tmp[finalIndex] = item;
        product = tmp;
    }

    public Product[] removeById(int id) {
        int length = product.length - 1;
        Product[] tmp = new Product[length];
        int index = 0;
        for (Product item : product) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        product = tmp;
        return product;
    }

    public Product[] findAll() {
        return product;
    }
}