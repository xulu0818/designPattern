package adapter;

public class CoffeeMachine {

    public void makeCoffee(IVoltage110V voltage110V) {
        if (voltage110V.output110V() == 110) {
            System.out.println("start making coffee");
        }
    }
}
