package cryptoTrader.main;

import java.util.ArrayList;

public class SubsystemUI {
    private ArrayList<TradingClient> activeClients;

    public createClient () {
        this.activeClients = new ArrayList<TradingClient>();
    }

    public TradingClient createClient (String clientName, String[] clientCoins, String clientStrategy) { // trading client factory

        TradingClient newClient = new TradingClient(clientName, clientCoins, clientStrategy);
        this.activeClients.add(newClient);
        return (newClient);
    }
}
