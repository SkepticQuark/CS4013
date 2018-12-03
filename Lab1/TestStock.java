/**
 *  Teststock.java tests stock.java by creating an object with given values for
 *  each data field and then printing the symbol, name and calling getChangePercent
 * 
 * @author Murdo Mackenzie 16152522
 */
public class TestStock {
    public static void main(String[] args){
            /*Test stock.java by creating a new object stock and giving it values for each data field */
            Stock stock = new Stock("LKSS", "Limerick Software Solutions");
            //print out results and set closing and opening prices to get percentage change
            System.out.println("Stock Name: " +stock.getName());
			stock.setClosingPrice(79.45);
			stock.setCurrentPrice(79.65);
            System.out.println("Percentage Change: " +stock.getChangePercent());            
            
    }        
}
