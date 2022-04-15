package factory.factoryMethod.factory;

import factory.factoryMethod.pizza.Pizza;


public abstract class AbsFactory {

    // use a method to create product
    public abstract Pizza createPizza(String type);

    public Pizza newOrderPizza(String type) {
        Pizza pizza = null;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
