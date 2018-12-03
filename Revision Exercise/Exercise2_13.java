
/**
 * Exercise 2.13 is a financial application applying compound interest of 5%
 * to a given amount and return the new amount with interest applied after 6 months
 * 
 * @author Murdo Mackenzie 16152522 
 * @version 28-09-18
 */
import java.util.Scanner;

public class Exercise2_13
{
    public static void main(String []args)
    {
        //create scanner
        Scanner input = new Scanner(System.in);
        
        //prompt user for amount and create original amount
        System.out.print("Enter the monthly saving amount: ");
        double amount = input.nextDouble();
        
        //calculate first month
        double amountnew = amount * (1+0.00417);
        
        //for loop to calculate the other 5 months
        for(int i = 4; i >= 0; i--)
        {
            amountnew = (amount+amountnew)*(1+0.00417);
        }
        
        //display result
        System.out.printf("After the sixth month, the account value is €%.2f", amountnew);
    }
}
