package factory.simpleFactory;

import factory.simpleFactory.pizza.CheesePizza;
import factory.simpleFactory.pizza.GreekPizza;
import factory.simpleFactory.pizza.Pizza;

public class SimpleFactory {
    // use a factory class to CREATE product
    // separate the creation and the other process
    public static Pizza createPizza(String name) {
        Pizza pizza = null;
        if (name.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("greekPizza");
        } else if (name.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("cheesePizza");
        }
        return pizza;
    }
}
