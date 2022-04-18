package visitor;

public interface Visitor {
    public double visit(Liquor liquor);
    public double visit(Necessity necessity);
    public double visit(Tobacco tobacco);
}
