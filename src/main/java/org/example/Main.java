package org.example;

import org.example.product.MariaMaria;
import org.example.product.Simple;
import org.example.product.Pizza;
import org.example.product.PizzaSize;
import org.example.product.Special;
import org.example.toppings.Bacon;
import org.example.toppings.Cheese;
import org.example.toppings.Peperoni;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new MariaMaria();
        pizza1.setPizzaSize(PizzaSize.SMALL);
        pizza1 = new Cheese(pizza1);
        pizza1 = new Bacon(pizza1);
        System.out.println(pizza1.getDescription() + " $" + pizza1.cost());

        Pizza pizza2 = new Special();
        pizza2.setPizzaSize(PizzaSize.LARGE);
        pizza2 = new Cheese(pizza2);
        pizza2 = new Bacon(pizza2);
        pizza2 = new Peperoni(pizza2);
        System.out.println(pizza2.getDescription() + " $" + pizza2.cost());

        Pizza pizza3 = new Simple();
        pizza3.setPizzaSize(PizzaSize.MEDIUM);
        pizza3 = new Cheese(pizza3);
        System.out.println(pizza3.getDescription() + " $" + pizza3.cost());
    }
}