import java.util.ArrayList;

/**
   A set of coins.
*/
public class CoinSet
{  
   private ArrayList<Coin> set;

   /**
      Constructs a CoinSet object.
   */
   public CoinSet()
   {  
      set = new ArrayList<Coin>();
   }
   
   //ADD REMAINING CODE HERE
   
   /**
   		Method to add coin to array
   		@param c a Coin object
    */
   public void addCoin(Coin c){
	   set.add(c);
   }
   
   /**
   		get and return total
   	*/
   public double getTotal(){
	   double tot = 0;
	   for (int i = 0; i < set.size(); i++)
	   {
		   tot += set.get(i).getValue();
	   }
	   return tot;
   }
   
   /**
   		Method to remove money
    */
   public double removeMoney(){
	   double t = this.getTotal();
	   set.clear();
	   return t;
   }
}