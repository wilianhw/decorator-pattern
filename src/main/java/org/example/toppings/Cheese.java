package org.example.toppings;

import org.example.product.Pizza;
import org.example.product.PizzaSize;

public class Cheese extends ToppingDecorator {
    Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    public PizzaSize getPizzaSize() {
        return pizza.getPizzaSize();
    }

    @Override
    public double cost() {
        if (pizza.getPizzaSize().equals(PizzaSize.SMALL)) {
            return pizza.cost() + 0.50;
        }
        if (pizza.getPizzaSize().equals(PizzaSize.MEDIUM)) {
            return pizza.cost() + 0.75;
        }
        return 1.00 + pizza.cost();
    }
}
