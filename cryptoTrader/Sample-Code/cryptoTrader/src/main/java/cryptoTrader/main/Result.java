package cryptoTrader.main;

import cryptoTrader.main.Strategy;
import java.util.Date;

enum TradeResult { TRADE, NOTRADE, FAIL }

public class Result {
    private String trader; // broker associated with trade
    private Strategy strategy; // strategy used for trade
    private String cryptocoin; // coin traded (or not traded)
    private TradeResult action; // direction of trade: 0 for sell, 1 for buy, -1 for no action taken
    private float price; // price of cryptocoin at time of trade
    private long date; // millisecond epoch time of trade signature

    public Result (String trader, Strategy strategy, String cryptocoin, TradeResult action, float price, long date) {
        this.trader = trader;
        this.strategy = strategy;
        this.cryptocoin = cryptocoin;
        this.action = action;
        this.price = price;
        this.date = date;
    }

    @Override
    public String toString () {
        Date requestDate = new Date(this.date);
        String buffer = "";
        
    }

}
