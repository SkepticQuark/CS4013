/**
 *  Stock.java allows for the creation of a stock object which contains a symbol,
 *  name, previousClosingPrice and currentPrice. It also contains a method to
 *  calculate the percentage change between the pervious closing price and current
 *  price of the stock.
 * 
 * @author Murdo Mackenzie 16152522
 */
public class Stock {
    //create our data fields as instance variables and make private
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    //create a constructor with arguments
    public Stock(String newSymbol, String newName){
		symbol = newSymbol;
		name = newName;
    }
     
    //return name
    public String getName(){
        return name;
    }
    
    //set a new previousClosingPrice
    public void setClosingPrice(double previousClosingPrice){
        this.previousClosingPrice = previousClosingPrice;
    }
	
    //set a new currentPrice
    public void setCurrentPrice(double currentPrice){
        this.currentPrice = currentPrice;
    }
    
    //return the percentage change between the previousClosingPrice and currentPrice
    public double getChangePercent(){
        return ((previousClosingPrice - currentPrice)/currentPrice)*100;
    }
}
