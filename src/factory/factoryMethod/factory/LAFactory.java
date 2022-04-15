package factory.factoryMethod.factory;

import factory.factoryMethod.pizza.LACheesePizza;
import factory.factoryMethod.pizza.LAGreekPizza;
import factory.factoryMethod.pizza.Pizza;

public class LAFactory extends AbsFactory {


    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new LACheesePizza();
        } else if (orderType.equals("greek")) {
            pizza = new LAGreekPizza();
        }
        return pizza;
    }
}
