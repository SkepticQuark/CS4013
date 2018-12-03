import java.util.ArrayList;

/**
   A vending machine.
*/
public class VendingMachine
{  
   private ArrayList<Product> products;
   public CoinSet coins;
   public CoinSet currentCoins;

   /**
      Constructs a VendingMachine object.
   */
   public VendingMachine()
   { 
      products = new ArrayList<Product>();
      coins = new CoinSet();
      currentCoins = new CoinSet();
   }
   
   //ADD REMAINING CODE HERE
   
   /**
   		Method to add coin to array
   		@param c a Coin object
   */
   public void addCoin( Coin c){
	   currentCoins.addCoin(c);
	   coins.addCoin(c);
   }
   
   /**
   		Method to remove money
   	*/
   public double removeMoney(){
	   double moneyRemoved = coins.removeMoney();
	   return moneyRemoved;
   }
   
   /**
   		Method that buys a product
   		@param p product from array
   	*/
   public void buyProduct(Product p){
	   if (products.contains(p))
	   		products.remove(p);
	else
			System.out.print("Error: Product unavailable.");		
   }
   
   /**
   		Method to add product
   		@param p product
   		@param q quantity number
   	*/
   public void addProduct(Product p, int q){
	   for(int i = 0; i < q; i++)
	   {
		   products.add(p);
	   }
   }
	   
   public Product[] getProductTypes(){
	   ArrayList<Product> tempProducts = new ArrayList<Product>();
	   int count = 0;
	   for (int i = 0; i < products.size(); i++)
	   {
		   Product p = products.get(i);
		   boolean contains = false;
		   
		   if(!(tempProducts.contains(p))){
			   tempProducts.add(p);
		   }
	   }
	   Product[] temp = new Product[tempProducts.size()];
	   tempProducts.toArray(temp);
	   return temp;
   }
}