//=================================================
// Class Example using Random Class
// February 16, 2015
// CMPSC 111, Spring 2015
// Janyl Jumadinova
// 
// Purpose: Generate random integer and floating point numbers
//=================================================

import java.util.Random;


public final class RandomNumber {
  
  public static void main(String[] args)
  	{
    	int randomInt;

    	//note a single Random object will be reused 
   		Random randomGenerator = new Random();

   		// Generate a random integer
		randomInt = randomGenerator.nextInt();
		System.out.println("A random integer: "+randomInt);

		// Generate a random integer in the range 0..10.
      	randomInt = randomGenerator.nextInt(10);
    	System.out.println("A random integer from 0 to 9: "+randomInt);


      	// Generate a random integer in the range 0..99.
      	randomInt = randomGenerator.nextInt(100);
    	System.out.println("A random integer from 0 to 99: "+randomInt);

   		 
  }
  
}
