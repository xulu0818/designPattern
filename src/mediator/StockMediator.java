package mediator;

import java.util.ArrayList;
import java.util.List;

public class StockMediator implements Mediator {

    private List<Colleague> colleagues;
    private List<StockOffer> stockBuyOffers;
    private List<StockOffer> stockSaleOffers;

    private int colleagueCode = 0;

    public StockMediator() {
        colleagues = new ArrayList<>();
        stockBuyOffers = new ArrayList<>();
        stockSaleOffers = new ArrayList<>();
    }


    @Override
    public void saleOffer(String stock, int shares, int collCode) {
        boolean stockSold = false;
        for (StockOffer stockOffer : stockBuyOffers) {
            if ((stockOffer.getStockSymbol() == stock) && (stockOffer.getStockShares() == shares)) {
                System.out.println(shares + " shares of " + stock
                        + " sold to colleague code " + stockOffer.getColleagueCode());
                stockSold = true;
            }
            if (stockSold) break;
        }
        if (!stockSold) {
            System.out.println(shares + " shares of " + stock + " added to inventory");
            stockSaleOffers.add(new StockOffer(shares, stock, collCode));
        }
    }

    @Override
    public void buyOffer(String stock, int shares, int collCode) {
        boolean stockBought = false;
        for (StockOffer stockOffer : stockSaleOffers) {
            if ((stockOffer.getStockSymbol() == stock) && (stockOffer.getStockShares() == shares)) {
                System.out.println(shares + " shares of " + stock
                        + " sold to colleague code " + stockOffer.getColleagueCode());
                stockBought = true;
            }
            if (stockBought) break;
        }
        if (!stockBought) {
            System.out.println(shares + " shares of " + stock + " added to inventory");
            stockBuyOffers.add(new StockOffer(shares, stock, collCode));
        }
    }

    @Override
    public void addColleague(Colleague newColleague) {
        colleagues.add(newColleague);
        colleagueCode++;
        newColleague.setColleagueCode(colleagueCode);

    }

    public void getStockOfferings() {
        System.out.println("stocks for sale:");

        for (StockOffer stockOffer : stockBuyOffers) {
            System.out.println(stockOffer.getStockShares() + " of " + stockOffer.getStockSymbol());
        }

        System.out.println("stocks for sale:");
        for (StockOffer stockOffer : stockSaleOffers) {
            System.out.println(stockOffer.getStockShares() + " of " + stockOffer.getStockSymbol());
        }
    }
}
