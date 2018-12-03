/**
 * Exercise 2.25 is a payroll program that takes information about an employee
 * and prints a payroll statement
 *
 * @author Murdo Mackenzie 16152522 
 * @version 28-09-18
 */
import java.util.Scanner;

public class Exercise2_25
{
    public static void main(String[] args)
    {
        //create scanner
        Scanner input = new Scanner(System.in);
        
        //prompt user to give name
        System.out.print("Enter employee's name:");
        String name = input.nextLine();
        
        //prompt user to give hours worked
        System.out.print("Enter number of hours worked in a week:");
        double hours = input.nextDouble();
        
        //prompt user to give hourly pay
        System.out.print("Enter hourly pay rate:");
        double rate = input.nextDouble();
        
        //prompt user for federal tax rate and also convert to percent
        System.out.print("Enter federal tax withholding rate:");
        double fedrate = input.nextDouble();
        double fedpercent = fedrate*100;
        
        //prompt user for state tax rate and also convert to percent
        System.out.print("Enter state tax withholding rate:");
        double staterate = input.nextDouble();
        double statepercent = staterate*100;
        
        //calculate necessary figures for payroll statement
        double gross = hours*rate;
        double fedtax = gross*fedrate;
        double statetax = gross*staterate;
        double deductions = fedtax+statetax;
        double net = gross-deductions;
        
        //print out payroll statement
        System.out.println("Employee Name:"+name);
        System.out.printf("Hours Worked: %.1f", hours);
        System.out.printf("\nPay rate:  $%.2f", rate);
        System.out.printf("\nGross Pay:  $%.2f\n", gross);
        System.out.println("Deductions:");
        System.out.printf("\tFederal Witholding (%.1f%%): $%.2f", fedpercent, fedtax);
        System.out.printf("\n\tState Withholding (%.1f%%): $%.2f", statepercent, statetax);
        System.out.printf("\n\tTotal Deduction: $%.2f", deductions);
        System.out.printf("\nNet Pay: $%.2f", net);

    }
}
