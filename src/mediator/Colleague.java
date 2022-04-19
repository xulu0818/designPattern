package mediator;

public abstract class Colleague {
    private Mediator stockMediator;
    private int colleagueCode;

    public Colleague(Mediator mediator) {
        stockMediator = mediator;
        stockMediator.addColleague(this);
    }

    public void saleOffer(String stock, int share) {
        stockMediator.saleOffer(stock, share, this.colleagueCode);
    }

    public void buyOffer(String stock, int share) {
        stockMediator.buyOffer(stock, share, this.colleagueCode);
    }

    public void setColleagueCode(int collCode) {
        colleagueCode = collCode;
    }
}
