//--------------------
// Grant Skinner
// Class Exercise
// February 18, 2015
//
// Purpose: To help the user create
// a random new identity
//---------------------
import java.util.Scanner;
import java.util.Random;

public class NewIdentity
{
	public static void main(String[]args)
	{
		String firstName, lastName, job, eyewear;
		int age;
		float salary;
		boolean glasses;
		
		// create an instance of the scanner
		Scanner scan = new Scanner(System.in);

		// create an instance of the Random class
		Random rand = new Random();

		// get the user's input
		System.out.println("Please enter a first name: ");
		firstName = scan.nextLine();
		System.out.println("Please enter a last name: ");
		lastName = scan.nextLine();
		System.out.println("Please enter your dream job: ");
		job = scan.nextLine();
		System.out.println("Please enter an integer: ");
		age = scan.nextInt();
		System.out.println("Please enter a floating point number: ");
		salary = scan.nextFloat();
		
		// randomly change user's input
		// get the length of the character in the firstName
		int length = firstName.length();
		// get the position of the character int the firstName
		int position = rand.nextInt(length);
		System.out.println("Random position chosen is "+position);
		// pick a character at that position
		char randomLetter = firstName.charAt(position);
		System.out.println("Random letter at position " +position+" is "+randomLetter);
		int random0or1 = rand.nextInt(2);
		// replace all of the selected characters with 'a'
		firstName = firstName.replace(randomLetter,'a');
		// append 'ov' to the lastName string
		lastName = lastName.concat("ov");
		// change the job to upper case
		job = job.toUpperCase();
		// assign a value for age
		age = rand.nextInt(age);
		// assign a value for salary
		salary = rand.nextFloat()*salary+1000;
		if (random0or1 == 0)
		glasses = false;
		else 
		glasses = true;
		if (glasses == true)
		eyewear = "do";
		else
		eyewear = "do not";
		
		System.out.println("Your new name is "+firstName+" "+lastName+", and you are "+age
			+" years old. You work as a "+job+" making $"+salary+" a year. You "+eyewear+
				" wear glasses.");
	}
}
