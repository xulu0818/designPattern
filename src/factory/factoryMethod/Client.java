package factory.factoryMethod;

import factory.factoryMethod.factory.AbsFactory;
import factory.factoryMethod.factory.LAFactory;
import factory.factoryMethod.factory.NYFactory;

public class Client {
    public static void main(String[] args) {
        String type1 = "cheese";
        AbsFactory laCheese = new LAFactory();
        laCheese.newOrderPizza(type1);

        String type2 = "greek";
        AbsFactory nyGreek = new NYFactory();
        nyGreek.newOrderPizza(type2);

    }
}
