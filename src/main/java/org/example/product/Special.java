package org.example.product;

public class Special extends Pizza {
    public Special() {
        this.description = "Special";
    }

    @Override
    public double cost() {
        return 9.99;
    }
}
