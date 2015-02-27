//=================================================
// Class Example using Math Class and formatting
// February 25, 2015
// CMPSC 111, Spring 2015
// Janyl Jumadinova
//
// Purpose: Experiment with various formatting approaches
//=================================================
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class MathTestFormat
{
  	public static void main ( String args[] )
 	{
 		double value;
 		Scanner i = new Scanner ( System.in );
 		System.out.print ( "Enter number: " );
 		value = i.nextDouble();
        // Round the output to three decimal places
        DecimalFormat fmt = new DecimalFormat(".###");
        System.out.println ("abs: " +fmt.format(value));

        NumberFormat fmt1 = NumberFormat.getPercentInstance();
        System.out.println("ceil: " +fmt1.format(value));

        NumberFormat fmt2 = NumberFormat.getCurrencyInstance();
 	    System.out.println("currency: "+fmt2.format(value));
    }
}
