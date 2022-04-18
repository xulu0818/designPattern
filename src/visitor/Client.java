package visitor;

public class Client {
    public static void main(String[] args) {
        Visitor taxVisitor = new TaxVisitor();
        Necessity milk = new Necessity(3.22);
        Tobacco cigars = new Tobacco(10.40);
        Liquor vodka = new Liquor(20.99);

        System.out.println("the total price for milk: " + milk.accept(taxVisitor));
        System.out.println("the total price for cigars: " + cigars.accept(taxVisitor));
        System.out.println("the total price for vodka: " + vodka.accept(taxVisitor));
    }
}
