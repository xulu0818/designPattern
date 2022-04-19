package mediator;

public class GoldmanColleague extends Colleague {

    public GoldmanColleague(Mediator mediator) {
        super(mediator);
        System.out.println("Goldman signed up with the stock exchange");
    }
}
