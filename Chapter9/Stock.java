package Chapter9;

/**
 * Created by averychen on 4/3/17.
 */
public class Stock {

    /**
     *            Stock
     *------------------------------
     * symbol: String
     * name: String
     * previousClosingPrice: double
     * currentPrice: double
     */

    // Define the stock class
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    // Construct a stock with a specified symbol and name
    Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
    }

    // Return the percentage changed from previousClosingPric eto currentPrice
    double getChangePercentage(){

        return ((currentPrice - previousClosingPrice)/previousClosingPrice) * 100;
    }
}

class TestStock {

    /** Main Method **/
    public static void main(String[] args) {
        // Create a Stock object with the stock
        // Symbol ORCL, the name Oracle Corporation
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;
        double percentageChange = stock.getChangePercentage();

        // Display the price-change percentage
        System.out.println("Stock name: " + stock.name);
        System.out.println("Stock symbol: " + stock.symbol);
        System.out.println("Change in Stock Percentage: " + percentageChange + "%");

    }
}
