import java.util.*;
import java.time.*;

/**
 *	Class SavingsAcccount extends BankAccount and allows for the creation of a savings account
 * 	@author Murdo Mackenzie 16152522
 */
 
public class SavingsAccount extends BankAccount {
	//create data fields
	private String name;
	private int id;
	private double balance;
	private static double annualInterestRate;
	private LocalDateTime dateCreated = LocalDateTime.now();
	
	/* no-args constructor */
	public SavingsAccount()
	{
		
	}
	
	/* constructor with arguments for ID and balance of savings account */
	public SavingsAccount(int id, double balance)
	{
		super(id,balance);
	}
	
	/* constructor with arguments for name, ID and balance of savings account */
	public SavingsAccount(String name, int id, double balance)
	{
		super(name,id,balance);
	}
	
	/* withdraw method to remove money from the account with checks to not overdraw */
	public void withdraw(double amount)
	{
		if(getBalance()>=amount)
		{
			setBalance(getBalance() - amount);
		}
		else
			System.out.print("Error");
		
	}
	
	/* toString method */
	public String toString()
	{
		return super.toString();
	}    
}
