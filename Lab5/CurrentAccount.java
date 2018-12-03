import java.util.*;
import java.time.*;

/**
 *	Class file for the creation of a current account that is a subclass of BankAccount and allows for the account to be
 *	overdrawn up to the amount of the overdraft limit.
 * 	@author Murdo Mackenzie 16152522
 */

public class CurrentAccount extends BankAccount {
	//create data fields
	private String name;
	private int id;
	private double balance;
	private double overdraftLimit = 1000;
	private static double annualInterestRate;
	private LocalDateTime dateCreated = LocalDateTime.now();
	
	/* No-arg constructor */
	public CurrentAccount()
	{
		
	}
	
	/* Constructor with arguments (ID and balance) for creation of currrent account */
	public CurrentAccount(int id, double balance)
	{
		super(id,balance);
	}
	
	/* Constructor with arguments for name, ID and balance */
	public CurrentAccount(String name, int id, double balance)
	{
		super(name,id,balance);
	}
	
	/* Override withdraw method to handle the overdraft limit. */
	public void withdraw(double amount, double overdraftLimit)
	{
		if ((getBalance() + overdraftLimit) >= amount)
		{
			setBalance(getBalance() - amount);
		}
		else
			System.out.print("error");
	}
	
	/* toString method */
	public String toString()
	{
		return super.toString() + "," + this.overdraftLimit;
	}   
}
