package cryptoTrader.main;

import java.util.ArrayList;
import cryptoTrader.utils.DataFetcher;
import cryptoTrader.gui.MainUI;

public class CoinList {
    private ArrayList<String> coinList; // list of subscribed coins used in trade
    public CoinList (String[] coins) {
        for (String i : coins) coinList.add(i);
    } // honestly i'm not really sure what this does
    
}
