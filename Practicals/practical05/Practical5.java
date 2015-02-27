/************************************
 Honor Code: The work I am submitting is
 a result of my own thinking and efforts.
 Grant Skinner
 CMPSC 111
 27 February 2015
 Practical 5

 Basic Input with a dialog box
************************************/

import javax.swing.JOptionPane;

public class Practical5
{
    public static void main ( String[] args )
    {

		// display a dialog with a message
		JOptionPane.showMessageDialog( null, "Welcome to the Game, Are you Ready?");
        JOptionPane.showMessageDialog( null, "You have reached a Bridge, Proceed?" );
        JOptionPane.showMessageDialog( null, "A troll stops you and says"+
                "\"If you want to pass you must answer my questions three!\"");
		// prompt user to enter name
		String name = JOptionPane.showInputDialog("Troll: What is your name?");
        String nameanswer = String.format ("Hmmm, "+name+"... what a strange name.");
        JOptionPane.showMessageDialog(null, nameanswer);
        String quest = JOptionPane.showInputDialog("Troll: What is your quest?");
		String questanswer = String.format ("Ah! "+quest+"\nA most noble quest indeed!");
        JOptionPane.showMessageDialog(null, questanswer);
        String color = JOptionPane.showInputDialog("Troll: What is your favorite color?");
        String coloranswer = String.format(color+"! That is a terrible color!"+
                " Humans are so strange.");
        JOptionPane.showMessageDialog(null, coloranswer);//create a message
		String message = String.format ("Troll: Okay, "+name+
                " You may cross the bridge...");
		JOptionPane.showMessageDialog(null, message);
        JOptionPane.showMessageDialog(null, "You have successfully crossed the bridge!");
    } //end main
}  //end class Practical5
