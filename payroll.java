// Financial Application: Payroll 

// Write a program that reads the following information and prints a payroll statement:

// Employee Name (e.g., Smith)
// Number of hours worked in a week (e.g., 10)
// Hourly pay rate (e.g.,$9.75)
// Calculate the total gross pay and display it.

// An employee has deductions from the Gross pay salary like:

// Federal withholding (20.0%)
// State withholding (9.0%)
// Calculate and display the total deduction and Net pay of an Employee

// Sample output:

// Employee Name:

// Hours worked:

// Pay rate:

// Gross pay:

// Deductions:

//             Federal Withholding (20.0%):

//             State withholding (9.0%) :

//             Total Deduction:

// Net pay: 

import java.util.Scanner;

public class payroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int hours = sc.nextInt();
        double payrate = sc.nextDouble();
        double grosspay = (double)hours*payrate;
        double fed = 0.2*grosspay;
        double state = 0.09*grosspay;
        double net = grosspay - fed - state;
        System.out.println(name);
        System.out.println(hours);
        System.out.println(payrate);
        System.out.println(grosspay);
        System.out.println("Deductions:");
        System.out.println("\tFederal withholding(20%):"+fed+"\n\tState withholding (9.0%) :"+ state+"\n\tTotal Deduction:"+(fed+state));
        System.out.println(net);
        sc.close();
    }
}
