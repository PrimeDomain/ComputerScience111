//***************
// Honor Code: The work I am submitting is
// a result of my own thinking and efforts.
//Grant Skinner
//CMPSC 111
//Lab 6 part 2
//
//Purpose: To create a Compound Calculator with A Graphical User Interface
//***************

import javax.swing.JOptionPane;
import java.util.Date;
import java.util.Random;
import java.text.NumberFormat;
    // importing for Date, Scanner, RNG, and Number Formatting
public class CompoundCalcGUI
{
    public static void main(String[] args)
    {
            // declaring variables for RNG
        Random rand = new Random();
            // declaring variables for equations
        double A, B, C, D, P, r;
        int t, n;
            // declaring number format variables
        NumberFormat dollars = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
            // prints Name, Lab name and Date
        JOptionPane.showMessageDialog( null, "Welcome to the Compound Calculator!");
        String pString = JOptionPane.showInputDialog("How much money have you borrowed?");
        Double pDouble = Double.valueOf(pString);
        P = pDouble.doubleValue();
        String tString = JOptionPane.showInputDialog("How many years do you want to pay back the loan?");
        Integer tInt = Integer.valueOf(tString);
        t = tInt.intValue();
        String nString = JOptionPane.showInputDialog("How many times will your interest compound in a year?");
        Integer nInt = Integer.valueOf(nString);
        n = nInt.intValue();
            // Finding the right interest rate using RNG and printing it formatted
        r = ((rand.nextDouble()*.14)+.01);
        Double R = Double.valueOf(r);
        String Interest = (percent.format(R));
        String interestrate = String.format("Your annual Interest rate is "+Interest);
        JOptionPane.showMessageDialog( null, interestrate);

            // Calculations
        //B = Math.pow((1 + (r/n)),(n*t));
        //A = (P*B);

        //D = Math.pow((Math.E),(r*t));
        //C = (P*D);

            // All required Outputs
        //String Output = String.format("You Borrowed "+dollars.format(P)+" at a annual rate of "
        //        +percent.format(r)+" compounded "+n+" times per year. After "
        //        +t+" years you owe "+dollars.format(A)+". Compounded continuously, You would owe "
        //        +dollars.format(C)+" instead.");
        //JOptionPane.showMessageDialog( null, Output);
    }
}


