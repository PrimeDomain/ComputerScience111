//=================================================
// Class Example using Graphics
// February 11, 2015
// Janyl Jumadinova
// Original submission by Allison Cabo in CMPSC 111, Fall 2014
// Purpose: To create a unique drawing.
//=================================================
import javax.swing.*;
import java.awt.*;

public class Drawing extends JApplet  {
	public void paint(Graphics page)
	{
		final int WIDTH = 600;
		final int HEIGHT = 400;

		page.setColor(Color.cyan);
		page.fillRect( 0, 0, WIDTH, HEIGHT);

	}
	
	// main method
	public static void main(String[] args)
    	{
        	JFrame window = new JFrame("Janyl Jumadinova ");

      		// Add the drawing canvas and do necessary things to
     		// make the window appear on the screen!
        	window.getContentPane().add(new Drawing());
        	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	window.setVisible(true);
		window.setSize(600, 400);
        	
        	//window.pack();
    	}

} // end class 
