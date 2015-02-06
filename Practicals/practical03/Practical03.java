//****************
//Grant Skinner
//February 6, 2015
//Purpose: Create a Mad Libs Program
//****************

import java.util.Scanner;
import java.util.Date;

public class Practical03
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
	
		String noun, noun2, verb, adj, adv, prep;
		int num1, num2;
		double num3;
	
		System.out.print("Enter a singular noun: ");
		noun = scan.next();
		
		System.out.print("Enter another singular noun: ");
		noun2 = scan.next();

		System.out.print("Enter an adjective: ");
		adj = scan.next();
		
		System.out.print("Enter a verb ending in \"ing\": ");
		verb = scan.next();
		
		System.out.print("Enter a preposition: ");
		prep = scan.next();
		
		System.out.print("Enter a non-zero whole number: ");
		num1 = scan.nextInt();
		
		System.out.print("Enter another non-zero whole number: ");
		num2 = scan.nextInt();
		
		System.out.print("Enter any number: ");
		num3 = scan.nextDouble();
		
		System.out.println("__________________________");
		System.out.println("\nElementary School Reading");
		System.out.println("\nOnce upon a time there was a "+noun+" that liked to spend its days "+verb+" "+prep+" "+adj+" things. One day it found "+num1+" other "+noun+"s and started making friends by doing that with them. This angered the "+num2+" "+noun2+"s nearby. So the "+noun2+"s invaded their village and ordered the "+noun+"s to pay them "+num3+" dollars to leave. Will the "+noun+"s give into the demands of the "+noun2+"s, or will there be war? Find out next time!");
	}
}
		
