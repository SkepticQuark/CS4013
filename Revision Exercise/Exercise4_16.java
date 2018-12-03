/**
 * Exercise 4.16 reads an integer and displays it's smallest prime factors in
 * ascending order. e.g 60, output would be 2,3,5
 *
 * @author Murdo Mackenzie 16152522 
 * @version 28-09-18
 */
import java.io.*;
import java.lang.Math;

public class Exercise4_16 {
    //function to print all prime factors for number n 
    public static void primeFactors(int n) 
    { 
        //Print the number of 2s that divide n 
        while (n%2==0) 
        { 
            System.out.print(2 + " "); 
            n /= 2; 
        } 
  
        // n must be odd at this point.  So we can skip one element (Note i = i +2) 
        for (int i = 3; i <= Math.sqrt(n); i+= 2) 
        { 
            //While i divides n, print i and divide n 
            while (n%i == 0) 
            { 
                System.out.print(i + " "); 
                n /= i; 
            } 
        } 
  
        //condition to handle the case whien n is a prime number greater than 2 
        if (n > 2) 
            System.out.print(n); 
    } 
    //main method to pass in argument
    public static void main (String[] args) 
    { 
        int n = 60; 
        primeFactors(n); 
    }    
}
