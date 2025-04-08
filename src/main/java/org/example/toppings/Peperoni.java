package org.example.toppings;

import org.example.product.Pizza;
import org.example.product.PizzaSize;

public class Peperoni extends ToppingDecorator {
    Pizza pizza;

    public Peperoni(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Peperoni";
    }

    @Override
    public PizzaSize getPizzaSize() {
        return pizza.getPizzaSize();
    }

    @Override
    public double cost() {
        if (pizza.getPizzaSize().equals(PizzaSize.SMALL)) {
            return pizza.cost() + 0.75;
        }
        if (pizza.getPizzaSize().equals(PizzaSize.MEDIUM)) {
            return pizza.cost() + 1.00;
        }
        return 1.25 + pizza.cost();
    }
}
