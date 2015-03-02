//***************
//Grant Skinner
//CMPSC 111
//Lab 6
//
//Purpose: To create a Compound Calculator program
//***************

import java.util.Date;
import java.util.Scanner;
import java.util.Random;
import java.text.NumberFormat;
    // importing for Date, Scanner, RNG, and Number Formatting
public class CompoundCalculator
{
    public static void main(String[] args)
    {
            // declaring variables for scanning and RNG
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
            // declaring variables for equations
        double A, B, C, D, P, r;
        int t, n;
            // declaring number format variables
        NumberFormat dollars = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
            // prints Name, Lab name and Date
        System.out.println("Grant Skinner\nLab 6 Compound Calculator\n"+new Date()+"\n------------------\n");
            // Begins Scanning for inputs
        System.out.print("How much money have you borrowed? : ");
        P = scan.nextDouble();
        System.out.print("How many years do you want to pay back the loan? : ");
        t = scan.nextInt();
        System.out.print("How many times does your interest compound in a year? : ");
        n = scan.nextInt();
            // Finding the right interest rate using RNG and printing it formatted
        r = ((rand.nextDouble()*.14)+.01);
        System.out.println("Your annual interest rate is "+percent.format(r));
            // Calculations
        B = Math.pow((1 + (r/n)),(n*t));
        A = (P*B);

        D = Math.pow((Math.E),(r*t));
        C = (P*D);

            // All required Outputs
        System.out.println("Principal: "+dollars.format(P));
        System.out.println("Years: "+t);
        System.out.println("Yearly compounds: "+n);
        System.out.println("After "+t+" years you owe "+dollars.format(A));
        System.out.println("Compounded Continuously, You would owe "
                +dollars.format(C)+" instead.");
    }
}
