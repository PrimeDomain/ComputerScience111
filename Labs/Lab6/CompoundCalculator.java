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

public class CompoundCalculator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        double A, B, C, D, P, r, t, n;

        NumberFormat dollars = NumberFormat.getCurrencyInstance;
        NumberFormat percent = NumberFormat.getPercentInstance;

        System.out.println("Grant Skinner\nLab 6 Compound Calculator\n"+new Date()+"\n------------------\n");
        System.out.print("How much money have you borrowed? : ");
        P = scan.nextDouble();
        System.out.print("How many years do you want to pay back the loan? : ");
        t = scan.nextDouble();
        System.out.print("How many times does your interest compound in a year? : ");
        n = scan.nextDouble();
        r = ((rand.nextDouble()*.14)+.01);
        System.out.println("Your annual interest rate is "+percent.format(r));
        B = Math.pow((1 + (r/n)),(n*t));
        A = (P*B);
        A = dollars.format(A);
        D = Math.pow((Math.E),(r*t));
        C = (P*C);
        C = dollars.format(C);
        System.out.println("Principal: "+P);
        System.out.println("Years: "+t);
        System.out.println("Yearly compounds: ");
        System.out.println("After "+t+" years Your owe "+A);
        System.out.println("Compounded Continuously, You would owe "+C+"instead.");
    }
}
