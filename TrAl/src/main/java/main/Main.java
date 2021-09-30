package main;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiWebSocketClient;
import com.binance.api.client.domain.market.CandlestickInterval;

public class Main {

	public static void main(String[] args) {
		
		BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance();
		BinanceApiWebSocketClient wsClient = factory.newWebSocketClient();
		
		wsClient.onCandlestickEvent("xrpusdt", CandlestickInterval.FIFTEEN_MINUTES, 
				response -> System.out.println(response));

	}

}
