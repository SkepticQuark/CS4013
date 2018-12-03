import java.util.*;
import java.time.*;

/**
 *	Transaction class handles the information required to display a transaction
 * @author Murdo Mackenzie 16152522
 */

public class Transaction {
	//data fields needed for a transaction
	private String type;
	private String description;
	private double balance;
	private double amount;
	private LocalDateTime date = LocalDateTime.now();
	
	/* no-arg constructor */
	Transaction()
	{
		
	}
	
	/* constructor with arguments */
	Transaction(String type, double amt, double bal, String descr)
	{
		this.type = type;
		amount = amt;
		balance = bal;
		description = descr;
	}
	
	/* toString for transaction  */
	public String toString()
	{
		return this.type + ", " + this.date + ", " + this.description + ", " + this.amount + ", " + this.balance;
	}    
}
