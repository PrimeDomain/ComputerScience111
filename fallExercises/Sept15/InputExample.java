//**********************
// Grant Skinner
// September 15, 2014
// CMPSC 111 Professor Jumadinova
// Input Example - class exercise
//**********************
import java.util.Scanner;

public class InputExample
{ 
	public static void main (String args[])
	{
		int num1, num2=10;
		float num3;
		double num4;
		String str;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter an integer");
		num1 = in.nextInt();

		//System.out.println("The result of addition "+(num1+num2));

		//System.out.println("Enter your name");
		//str = in.nextLine();
		//System.out.println("You entered "+str);

		// Get the last digit of num1 and print it out
		
		System.out.println("The last digit of that integer is " + num1 % 10 + " " );
		// Get the last two digits of num1 and print it out
		
		System.out.println("The last two digits of that integer are " + (num1 % 100));
		System.out.println("Enter a float");
		num3 = in.nextFloat();
	
		System.out.println("The result of addition " +(num1+num3));
		num2 = (int) (num1 + num3);
		System.out.println("The value of num2 is "+num2);
	}
}
