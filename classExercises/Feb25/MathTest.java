//=================================================
// Class Example using Math Class
// February 25, 2015
// CMPSC 111, Spring 2015
// Janyl Jumadinova
//
// Purpose: Experiment with various methods from the Math class
//=================================================

import java.util.Scanner;
public class MathTest
{
  	public static void main ( String args[] )
 	{
 		double value, value1;
 		Scanner scan = new Scanner ( System.in );
 		System.out.print ( "Enter number: " );

 		value = scan.nextDouble();

 		System.out.println ("abs: "+Math.abs(value));
 		System.out.println ("ceil: "+Math.ceil(value));
 		System.out.println ("sqrt: "+Math.sqrt(value));
 		System.out.println ("Pi: "+Math.PI);

        System.out.println ("floor: "+ Math.floor(value));
 	    System.out.println ("Enter another number: ");
        value1 = scan.nextDouble();

        System.out.println("power: "+Math.pow(value, value1));

        System.out.println("random: "+Math.random());
    }
}
