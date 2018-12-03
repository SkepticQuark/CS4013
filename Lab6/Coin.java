/**
   A coin with a monetary value.
*/
public class Coin
{
   private double value;
   private String name;

   /**
      Constructs a coin.
      @param aValue the monetary value of the coin.
      @param aName the name of the coin
   */
   public Coin(double aValue, String aName) 
   { 
      value = aValue; 
      name = aName;
   }

   //ADD REMAINING CODE HERE
   
   /**
   		Get value datafield
   	*/
   public double getValue(){
	   return value;
   }
   
   /**
   		toString method
   	*/
   public String toString(){
	   return this.value + "," + this.name;
   }
   
}