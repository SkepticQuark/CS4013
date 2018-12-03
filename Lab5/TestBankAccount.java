import java.util.*;
import java.time.*;

/**
 * Class file that uses anarraylist of type bank account
 * @author Murdo Mackenzie 16152522
 */

public class TestBankAccount {
 	public static void main(String [] args)
	{
		ArrayList <BankAccount> accounts = new ArrayList<BankAccount>(); //create arraylist
		
		//create bank accounts of each type
		CurrentAccount c1 = new CurrentAccount("Fred Flintstone",1,2750);
		SavingsAccount s1 = new SavingsAccount("Kermit The Frog",2,6000);
		
		//add to the arraylist
		accounts.add(c1);
		accounts.add(s1);
		
		//set annual interest rate
		BankAccount.setAnnualInterestRate(0.1);
		
		//test withdraws and deposits of each account
		c1.withdraw(300,"Car Loan");
		c1.deposit(2500,"Payday");		
		s1.withdraw(1518,"University Fee");
		s1.deposit(200,"Birthday");
		
		//print details of accounts
		System.out.println("Name ID");
		for (int i = 0; i < accounts.size(); i++)
		{
			System.out.println(accounts.get(i).toString());
			System.out.println();
		}
		
	}   
}