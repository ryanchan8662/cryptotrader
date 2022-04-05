package cryptoTrader.main;

import java.util.HashMap;
import cryptoTrader.utils.DataFetcher;

public class Trade {
    private String trading_client;
    private String[] coin_list;
    private HashMap<String, Integer> coin_prices;
    private Strategy broker_strategy;

    public Trade (String trading_client, String[] coin_list, Strategy strategy_used) {
        this.coin_list = new String[coin_list.length]; // not sure how this links to and uses strategy
        this.trading_client = trading_client;
        int pointer = 0;
        for (String i : this.coin_list) this.coin_list[pointer++] = i; // make a copy of variables to prevent PBR from messing things up
        this.broker_strategy = strategy_used; // record strategy used for later evaluation
    }

    public void performTrade () {
        // coin_prices must hold prices of all subscribed coins at this point BEFORE evaluation
        
    }

    public void giveData () { // intakes coin prices, distributes to strategy and itself?
        // provides data to strategy and trade
        // should be modified to use arraylist or hashmap rather than pair array?
    }
}

