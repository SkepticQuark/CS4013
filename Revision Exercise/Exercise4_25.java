/**
 * Exercise 4.25 sums the series 1+(1+2)+(1+2+3)+...+(1+2+3+...+n) where n is
 * given by the user
 *
 * @author Murdo Mackenzie 16152522 
 * @version 28-09-18
 */
import java.util.Scanner;

public class Exercise4_25 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
       //prompt user to enter n
       System.out.print("Enter n:");
       int n = input.nextInt();
       
       //create a final sum int
       int sum = 0;
       
       //for loops to sum series for given n
       for (int i = 1 ; i <= n ; i++) 
            for (int j = 1 ; j <= i ; j++) 
                sum += j; 
       
       //print sum
       System.out.println("Sum of series:"+sum);
    }
}
