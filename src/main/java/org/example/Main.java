package org.example;

import org.example.product.MariaMaria;
import org.example.product.Pizza;
import org.example.product.PizzaSize;
import org.example.toppings.Bacon;
import org.example.toppings.Cheese;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new MariaMaria();
        pizza1.setPizzaSize(PizzaSize.SMALL);
        pizza1 = new Cheese(pizza1);
        pizza1 = new Bacon(pizza1);
        System.out.println(pizza1.getDescription() + " $" + pizza1.cost());
    }
}