import java.util.*;
import java.time.*;

/**
 * This class creates a BankAccount with relevant methods and data fields that are needed to store such information.
 * @author Murdo Mackenzie 16152522
 */

public class BankAccount {
	//create data fields
	private String name;
	private int id;
	private double balance;
	private static double annualInterestRate;
	private LocalDateTime dateCreated = LocalDateTime.now();
	protected ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	
	/* no-arg constructor */
	public BankAccount()
	{
		
	}
	
	/* constructor with arguments for ID and balance */
	public BankAccount(int id,double balance)
	{
		this.id = id;
		this.balance = balance;
	}
	
	/* constructor with arguments for name, ID and balance */
	public BankAccount(String name, int id, double balance)
	{
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
	
	/* getID method to return ID */
	public int getID()
	{
		return id;
	}
	
	/* getBalance method to return balance */
	public double getBalance()
	{
		return balance;
	}
	
	/* getAnnualInterestRate which returns annual interest rate */
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	
	/* setID method */
	public void setId(int newId)
	{
		this.id = newId;
	}
	
	/* setBalance method */
	public void setBalance(double newBalance)
	{
		this.balance = newBalance;
	}
	
	/* setAnnualInterestRate method */
	public static void setAnnualInterestRate(double newAIR)
	{
		annualInterestRate = newAIR;
	}
	
	/* getDateCreated method to return dateCreated */
	public LocalDateTime getDateCreated()
	{
		return dateCreated;
	}
	
	/* getMonthlyInterestRate divides AIR by 12 and returns monthly rate */
	public static double getMonthlyInterestRate()
	{
		double monthlyRate = annualInterestRate/12;
		return monthlyRate;
	}
	
	/* withdraw method to take money out of account */
	public void withdraw(double amount, String description)
	{
		Transaction tran = new Transaction("W",amount,getBalance(),description);
		balance -= amount;
		transactions.add(tran);
	}
	
	/* deposit method to put money into account */
	public void deposit(double amount,String description)
	{
		Transaction tran = new Transaction("D",amount,getBalance(),description);
		balance += amount;
		transactions.add(tran);
	}
	
	/* toString method */
	public String toString()
	{
		String trans = "";
		String info = "Type Date Description Amount Balance";
		for (Transaction t : transactions)
		{
			trans += t.toString() + ",\n";
		}
		return this.name + "," + this.id + "\n" + info + "\n" + trans;
	}    
}
