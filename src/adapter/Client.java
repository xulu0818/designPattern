package adapter;

public class Client {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.makeCoffee(new VoltageAdapter());
    }
}
