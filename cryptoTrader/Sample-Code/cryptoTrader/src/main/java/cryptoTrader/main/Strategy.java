package cryptoTrader.main;

import java.util.HashMap;

enum TradeResult { TRADE, NOTRADE, FAIL }

public class Strategy {
    private String[] usedCoins;

    public TradeResult evaluate (HashMap<String, Integer> prices) {

        // fake strategy: if all prices are above 10

        for (String currentCoin : usedCoins) {
            Integer coinPrice = prices.get(currentCoin);
            if (coinPrice == null) { // if coin required by strategy does not exist in given prices, yay!
                System.out.printf("%s coin was not given in to strategy.", currentCoin);
                return (TradeResult.FAIL);
            }
            // if coin does exist in given list, evaluate in respect to strategy - logic for each strategy will be different
            if (prices.get(currentCoin) < 10) return (TradeResult.NOTRADE); // if below 10, strategy will not be valid/triggered 
        } return (TradeResult.TRADE); // for this strategy, if all of them are simply above 10 the strategy may be successfully evaluated, returned as 1
    }

    @Override
    public String toString () {
        String buffer = "";

        return (buffer);
    }

}