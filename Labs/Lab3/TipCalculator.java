//*********************
//Grant Skinner
//February 5, 2015
//Lab 3 Tip Calculator
//*********************

import java.util.Date;
import java.util.Scanner; 
import java.text.DecimalFormat;
public class TipCalculator
{
	public static void main(String []args)
	{
		String name;
		float bill, tip, tipamt;
		int people;
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Grant Skinner\nLab3\n" + new Date() + "\n");
		
		System.out.print("Please enter your name: ");
		name = scan.nextLine();
		
		System.out.println( name + ", welcome to the Tip Calculator!");
		
		System.out.print("Please enter the amount of your bill: ");
		bill = scan.nextFloat();
		
		System.out.print("Please enter the percentage that you want to tip: ");
		tip = scan.nextFloat();
		
		System.out.println("Your original bill was $"+bill);
		
		tipamt = (bill*tip/100);
		System.out.println("Your tip amount is $"+df.format(tipamt));
		
		System.out.println("Your total bill is $"+df.format(bill+tipamt));
		
		System.out.print("How many people will be splitting the bill? ");
		people = scan.nextInt();

		System.out.println("Each person should pay $"+df.format((bill+tipamt)/people));
		System.out.println("Have a nice day! Thank you for using our service.");
	}
}
		 


