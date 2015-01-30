//*******************************************
// Grant Skinner
// CMPSCI 111 Spring 2015
// Lab2
// Date: January 30, 2015 
// Purpose: To compute and print the first N odd numbers.
//*******************************************

import java.util.Date; // needed to print today's date
import java.util.Scanner; // needed to scan in data
public class Lab2
{
	//mainmethod
	public static void main(String[] args)
	{		
		Scanner scan = new Scanner(System.in); //creates scanner
		System.out.println("Grant Skinner\nLab2\n" + new Date() + "\n");
		//variables
		System.out.print("How Many odd numbers do you want? ");
		int initial = 0; // to help the calculation
		int N = scan.nextInt(); // the number of odds requested
		int listodds = 0; // the other part of the calculation
		while(listodds<N) // to stop at the right number
		{ 
			initial++; // adds 1 each time
			if ( initial %2 != 0 ) // to divide by 2 and check for odds
			{ 
				System.out.print( initial + " " ); 
				listodds++;
			}
		}
		System.out.println(); // to keep the terminial window orgainized
	}
} 	
