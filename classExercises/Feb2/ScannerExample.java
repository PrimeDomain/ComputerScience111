//**********************
// Grant Skinner
// February 2, 2015
// CMPSC 111 Professor Jumadinova
// Purpose: To Practice using Scanners
//**********************
import java.util.Scanner;

public class ScannerExample
{ 
	public static void main (String args[])
	{
		Scanner input = new Scanner (System.in);
			
		//variables
		String food, hobby;
		int num;
		int sum;
		double decimal;
				 
		System.out.print("Enter your favorite food");
		food = input.nextLine();
		
		System.out.print("Enter your hobby ");
		hobby = input.nextLine();
		
		System.out.println("You entered " +food+ " and "+hobby);

		System.out.println("Enter a number: ");
		num = input.nextInt();
		
		System.out.println("num "+num+", pre increment "+(++num)+", post increment "+(num++));
		
		sum = num++;
		System.out.println("Sum is " +sum);
		
		sum = ++num;
		System.out.println("Sum is " +sum);
		
		System.out.println("Enter a number with a decimal: ");
		
		decimal = input.nextDouble();
		System.out.println("Your number with a decimal is "+decimal);
	}
}
