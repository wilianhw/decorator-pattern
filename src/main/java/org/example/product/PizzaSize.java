package org.example.product;

public enum PizzaSize {
    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large");

    private final String size;

    PizzaSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
