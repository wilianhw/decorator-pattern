package org.example.toppings;

import org.example.product.Pizza;
import org.example.product.PizzaSize;

public abstract class ToppingDecorator extends Pizza {
    public abstract String getDescription();
    public abstract PizzaSize getPizzaSize();
}
