//***************************
// Grant Skinner
// CMPSCI 111 Spring 2015
// Lab #5
// Date: 19 February 2015
//
// The purpose of this program is to manipulate DNA sequences
// **************************


import java.util.Random;
import java.util.Date;
import java.util.Scanner;

public class DnaManipulation
{
    public static void main(String[] args)
    {
       //variable declaration
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String dnaString, dnaComplement, dnaStringplus, dnaStringminus, dnaStringmorph,
               chemicals;
        int length, location, location2, location3;
        char chem, chem2, chem3;
    // print my name and the date
    System.out.println("Grant Skinner\nLab 5 Dna Manipulation\n"+
        new Date() +"\n-------------------\n");
   // scanning in a Dna Sequence
    System.out.print("Please enter a string using only 'A','C','T', and 'G': ");
    dnaString = scan.next();
   // convert to upper case for future conversions
    dnaString = dnaString.toUpperCase();
   // converting to complement so original remains unchanged
    dnaComplement = dnaString;
   // make T and C lowercase to not get replaced in future
    dnaComplement = dnaComplement.replace('T','a');
    dnaComplement = dnaComplement.replace('C','g');
   // replace A and G for complement
    dnaComplement = dnaComplement.replace('A','T');
    dnaComplement = dnaComplement.replace('G','C');
   // make lowercase from before uppercase to finish
    dnaComplement = dnaComplement.replace('g','G');
    dnaComplement = dnaComplement.replace('a','A');
   //prints complement
    System.out.println("Complement of "+dnaString+" is "+dnaComplement);
    // directory of possible chemicals to be randomly chosen
    chemicals = "ACTG";
    // assigns random chemical for adding
    chem = chemicals.charAt(rand.nextInt(4));
   // determines length of the string entered
    length = dnaString.length();
   // determines the 3 random locations needed for manipulation
    location = rand.nextInt(length);
    location2 = rand.nextInt(length);
    location3 = rand.nextInt(length);
    // assigns random character in string to be removed
    chem2 = dnaString.charAt(location2);
   // assigns random chemical to be swapped
    chem3 = chemicals.charAt(rand.nextInt(4));
   // prints all conversions
    dnaStringplus = dnaString.substring(0,location+1) +chem+
        dnaString.substring(location+1);
    System.out.println("Inserting "+chem+" at position "+(location+1)+" gives "+
            dnaStringplus);
    dnaStringminus = dnaString.substring(0,location2)+ dnaString.substring(location2+1);
    System.out.println("Removing "+ chem2+" at position "+(location2)+" gives "+
            dnaStringminus);
    dnaStringmorph = dnaString.substring(0,location3)+chem3+
        dnaString.substring(location3+1);
    System.out.println("Changing position "+location3+" gives "+dnaStringmorph);


    }
}

