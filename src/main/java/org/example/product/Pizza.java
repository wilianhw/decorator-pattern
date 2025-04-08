package org.example.product;

public abstract class Pizza {
    String description = "Unknown Pizza";
    PizzaSize pizzaSize;

    public String getDescription() {
        return description;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(PizzaSize size) {
        this.pizzaSize = size;
    }

    public abstract double cost();
}
