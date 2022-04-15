package factory.factoryMethod.factory;

import factory.factoryMethod.pizza.*;

public class NYFactory extends AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else if (orderType.equals("greek")) {
            pizza = new NYGreekPizza();
        }
        return pizza;
    }
}
