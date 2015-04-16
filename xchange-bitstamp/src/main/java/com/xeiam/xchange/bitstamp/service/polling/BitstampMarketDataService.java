package com.xeiam.xchange.bitstamp.service.polling;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import com.xeiam.xchange.Exchange;
import com.xeiam.xchange.bitstamp.BitstampAdapters;
import com.xeiam.xchange.currency.CurrencyPair;
import com.xeiam.xchange.dto.marketdata.OrderBook;
import com.xeiam.xchange.dto.marketdata.Ticker;
import com.xeiam.xchange.dto.marketdata.Trades;
import com.xeiam.xchange.dto.trade.LimitOrder;
import com.xeiam.xchange.service.polling.marketdata.PollingMarketDataService;

/**
 * @author Matija Mazi
 */
public class BitstampMarketDataService extends BitstampMarketDataServiceRaw implements PollingMarketDataService {

	/**
	 * Constructor
	 *
	 * @param exchange
	 */
	public BitstampMarketDataService(Exchange exchange) {

		super(exchange);

	}

	@Override
	public Ticker getTicker(CurrencyPair currencyPair, Object... args) throws IOException {

		return BitstampAdapters.adaptTicker(getBitstampTicker(), currencyPair);
	}

	@Override
  public OrderBook getOrderBook(CurrencyPair currencyPair, Object... args) throws IOException {
	if(!currencyPair.baseSymbol.equals("BTC") || !currencyPair.counterSymbol.equals("USD")){
		return new OrderBook(new Date(), new ArrayList<LimitOrder>(), new ArrayList<LimitOrder>());
	}
    return BitstampAdapters.adaptOrderBook(getBitstampOrderBook(), currencyPair, 1000);
  }

	@Override
	public Trades getTrades(CurrencyPair currencyPair, Object... args) throws IOException {

		return BitstampAdapters.adaptTrades(getBitstampTransactions(args), currencyPair);
	}

}
