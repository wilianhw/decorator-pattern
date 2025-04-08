package org.example.product;

public class Mess extends Pizza {
    public Mess() {
        this.description = "Mess";
    }

    @Override
    public double cost() {
        return 7.99;
    }
}
