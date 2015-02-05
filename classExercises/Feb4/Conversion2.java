//****************
// Grant Skinner
// February 4, 2015
// Class Exercise CmpSci 111
//****************

import java.util.scanner

public class Conversion2
{
	public static void main(String[] args)
	{
		int num1, num2:
		float num3;
		
		Scanner scan = new Scanner (System.in);

		System.out.print("Enter a number " + num1);
		num1 = scan.nextInt();

		System.out.print("Enter another number ");
		num2 = scan.nextInt();
		
		System.out.print("Enter a floating point number ");
		num3 = scan.nextFloat();
		
		System.out.println("The result of addition of num1 and num3 " + (num1 + num3));
		System.out.println("The result of addition of num2 and num3: casting " + (num1+(int)num3));
		System.out.println("Multilication "+(num2*num3));

		double num =num1+num2;
		System.out.println("Num is "+num);

	}
}

	
