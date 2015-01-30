//***************************
// Grant Skinner
// CMPSC 111 Jumidinova
// September 19 2014
// Practical 3: Making a mad lib program
//***************************

import java.util.Date;
import java.util.Scanner;

public class Practical03
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in); 
		System.out.println("Grant Skinner" + new Date());
		System.out.println("Practical 03");

		//----------------------------
		// A Mad Lib for your enjoyment
		//----------------------------
		
		// Variables
		System.out.print("Enter a singular noun: " );
		String noun = scan.next();
		System.out.print("Enter an adjective: " );
		String adj = scan.next();
		System.out.print("Enter another adjective " );
		String adj2 = scan.next();
		System.out.print("Enter a non-zero whole number: " );		
		int num1 = scan.nextInt();
		System.out.print("Enter another non-zero whole number: " );
		int num2 = scan.nextInt();
		System.out.print("Enter any number: ");
		double num3 = scan.nextDouble();
		System.out.print("Enter a singular verb: ");
		String verb = scan.next();
 															
		System.out.println("If you own "+num1+" "+adj+" "+noun+"s,");
		System.out.println("and you purchase "+num2+" "+adj2+" "+noun+"s,");
		System.out.println("how many more "+noun+"s "+"do you need to enjoy "+num3+" "+noun+"s?");
		System.out.println(" ");
		System.out.println("Answer: You need "+((num3)-(num1 + num2))+" more "+noun+"s.");
		
	}
}
