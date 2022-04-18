package visitor;

public class TaxVisitor implements Visitor {
    @Override
    public double visit(Liquor liquor) {
        System.out.println("liquor tax: 0.18");
        return liquor.getPrice() * 0.18 + liquor.getPrice();

    }

    @Override
    public double visit(Necessity necessity) {
        System.out.println("necessity tax: 0");
        return necessity.getPrice() * 0 + necessity.getPrice();
    }

    @Override
    public double visit(Tobacco tobacco) {
        System.out.println("tobacco tax: 0.33");
        return tobacco.getPrice() * 0.33 + tobacco.getPrice();
    }
}
