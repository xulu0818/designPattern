package mediator;

public class Client {
    public static void main(String[] args) {

        StockMediator nyse = new StockMediator(); // new york stock exchange

        GoldmanColleague goldmanColleague = new GoldmanColleague(nyse);
        JPMorganColleague jpMorganColleague = new JPMorganColleague(nyse);

        goldmanColleague.saleOffer("paypal", 100);
        goldmanColleague.saleOffer("google", 50);

        jpMorganColleague.buyOffer("paypal", 100);
        jpMorganColleague.buyOffer("netflix", 10);

        goldmanColleague.saleOffer("netflix", 10);

        nyse.getStockOfferings();

    }
}
