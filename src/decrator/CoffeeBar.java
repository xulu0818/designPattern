package decrator;

public class CoffeeBar {

    public static void main(String[] arags) {
        Drink coffee = new LongBlack();
        double cost = coffee.cost();
        System.out.println(cost);

        coffee = new Milk(coffee);
        double cost2 = coffee.cost();
        System.out.println(cost2);

        coffee = new Chocolate(coffee);
        double cost3 = coffee.cost();
        System.out.println("total: " + coffee.cost());

        Drink espresso = new Espresso();
        System.out.println("espresspo: "  + espresso.cost());

        espresso = new Chocolate(espresso);
        System.out.println("espresspo Chocolate: "  + espresso.cost());
    }
}
