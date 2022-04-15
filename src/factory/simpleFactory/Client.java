package factory.simpleFactory;

public class Client {

    public static void main(String[] args) {
        String type1 = "cheese";
        OrderPizza pizzaOrder = new OrderPizza();
        pizzaOrder.orderPizza(type1);

        String type2 = "greek";
        OrderPizza pizzaOrder2 = new OrderPizza();
        pizzaOrder.orderPizza(type2);

    }
}
