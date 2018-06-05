package edu.KevinChen.advancedjava.assignment2;

import edu.KevinChen.advancedjava.assignment2.StockQuote;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * JUnit tests for the BasicStockService class
 *
 * @author Kevin Chen
 */

public class StockQuoteTest {

    private double StockPrice;
    private String StockSymbol;

    @Before
    public void setup() {
        StockPrice = 100.00;
        StockSymbol = "Basic";
    }

    @Test
    public void testStockQuoteConstruction() {
        StockQuote stockQuote = new StockQuote(StockPrice, StockSymbol);

        assertEquals("The Price is Correct", stockQuote.getStockPrice(), 100.00);
        assertEquals("The Symbol is correct", stockQuote.getStockSymbol(), "Basic");

    }
}
