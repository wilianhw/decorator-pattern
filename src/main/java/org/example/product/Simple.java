package org.example.product;

public class Simple extends Pizza {
    public Simple() {
        this.description = "Mess";
    }

    @Override
    public double cost() {
        return 7.99;
    }
}
