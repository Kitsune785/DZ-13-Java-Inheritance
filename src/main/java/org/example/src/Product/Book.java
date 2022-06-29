package org.example.src.Product;

import org.example.src.domain.Product;

public class Book extends Product {

    private String author;

    public Book(int id, String name, int price, String author) {
        super(id, name, price);
        this.author = author;
    }

    public Book() {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean matches(String search){
        if (super.matches(search)){
            return true;
        }
        return author.equalsIgnoreCase(search);
    }
}