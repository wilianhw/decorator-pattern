package org.example.product;

public class MariaMaria extends Pizza {

    public MariaMaria() {
        this.description = "Maria Maria";
    }

    @Override
    public double cost() {
        return 8.99;
    }
}
