package org.example.src.Product;

import org.example.src.domain.Product;

public class Smartphone extends Product {

    private String name;
    private String maker;

    public Smartphone(int id, String name, int price, String name1, String maker) {
        super(id, name, price);
        this.name = name1;
        this.maker = maker;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

}
