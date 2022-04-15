package factory.simpleFactory;

import factory.simpleFactory.pizza.Pizza;

public class OrderPizza {
    public Pizza pizza = null;
    public String name = "";

    public Pizza orderPizza(String name) {
        pizza = SimpleFactory.createPizza(name);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
