package com.stock.info.com.stock.info;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Map;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.quotes.stock.StockDividend;
import yahoofinance.quotes.stock.StockQuote;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	String[] symbols = new String[] {"INTC","AAPL","MSFT","ORCL","FEYE","CMI",
    										"KHC","JNJ","CVS","MCD","FB","GD","LB",
    										"KO","PEP","T","MO","SJM","ITW","BP","TXN",
    										 "ADI","QCOM","IBM","SO","EXC","NEE","D","DUK",
    										 "XOM","PSX","CVX","HSY","GIS","TSN","MKC","PEP","LMB",
    										 "PG","CLX","GM","F","BA"};
    	
    	Stock stk =null;
    	for(int i = 0;i < symbols.length;i++) {
    		 stk = YahooFinance.get(symbols[i]);	
    	if(stk.getDividendHistory().size()==0) {
    		System.out.println(stk.getName() + " " + "does not pay dividend");
    	}
    	else {
    		System.out.println(stk.getName() +" " + stk.getDividendHistory().get(3).getAdjDividend());
    	}
    
    	}
    	}
    	
    	
    	
    	
    
    	
    	
    	//BigDecimal peg = stock.getStats().getPeg();
    	//int index = stock.getDividendHistory().size()-1;
    	//BigDecimal dividend = stock.getDividendHistory().get(index).getAdjDividend();
    	
    	//System.out.println(dividend.multiply(new BigDecimal(4))+""+stock.getQuote());
    	
    }

