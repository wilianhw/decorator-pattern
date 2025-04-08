package org.example.toppings;

import org.example.product.Pizza;
import org.example.product.PizzaSize;

public class Bacon extends ToppingDecorator {
    private final Pizza pizza;

    public Bacon(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Bacon";
    }

    @Override
    public PizzaSize getPizzaSize() {
        return pizza.getPizzaSize();
    }

    @Override
    public double cost() {
        if (pizza.getPizzaSize().equals(PizzaSize.SMALL)) {
            return pizza.cost() + 1.00;
        }
        if (pizza.getPizzaSize().equals(PizzaSize.MEDIUM)) {
            return pizza.cost() + 1.25;
        }
        return pizza.cost() + 1.50;
    }
}
