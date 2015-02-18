//==========================================
// Janyl Jumadinova
// Class Exercise
// February 16, 2015
//
// Purpose: This program uses various methods 
// of the String class
// ==========================================
public class StringExample
{

   public static void main(String args[])
   {
      // declare a variable named word of type String
      String word;

      //assign the string to the variable:
      word = "Alexander";

      //perform some actions on the string:

      //1. retrieve the length by calling the
      //length method:
      int length = word.length();
      System.out.println("Length: " + length);
	//2. substring
	String word2 = word.substring(0, 4);
	System.out.println("word 2 is: "+word2);
	//3. char at index 5
	char letter = word.charAt(5);
	System.out.println("char "+letter);

     
   }
}
