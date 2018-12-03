/**
 * Exercise 5.5 has a method displayLargestNumber which takes 3 numbers and finds
 * and prints the largest.
 *
 * @author Murdo Mackenzie 16152522 
 * @version 28-09-18
 */
import java.util.Scanner;

public class Exercise5_5 {
    /* Main method */
    public static void main(String[] args)
    {
        //Create scanner
        Scanner input = new Scanner(System.in);

	//Prompt the user to enter three numbers
	System.out.print("Enter three numbers: ");
	double number1 = input.nextDouble();
	double number2 = input.nextDouble();
	double number3 = input.nextDouble();

	//display largest number
	displayLargestNumber(number1, number2, number3);
    }    
    /* Method to display largest number */
    public static void displayLargestNumber(double num1, double num2, double num3)
    {
        //if and else used to find largest number and print result inc. if equal
        if(num1 > num2 && num1 > num3)
            System.out.printf("%f is largest.", num1);
        else if(num2 > num1 && num2 > num3)
            System.out.printf("%f is largest.", num2);
        else  if(num3 > num1 && num3 > num2)
            System.out.printf("%f is largest.", num3);
        else
            System.out.println("Entered numbers are equal.");
    }
}
