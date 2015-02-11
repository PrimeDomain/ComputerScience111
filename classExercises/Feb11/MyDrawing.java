//=================================================
// Class Example using Graphics
// February 11, 2015
// Grant Skinner
// Original submission by Allison Cabo in CMPSC 111, Fall 2014
// Purpose: To create a unique drawing.
//=================================================
import javax.swing.*;
import java.awt.*;

public class MyDrawing extends JApplet  {
	public void paint(Graphics page)
	{
		final int WIDTH = 600;
		final int HEIGHT = 400;
		
		//background
		page.setColor(Color.cyan);
		page.fillRect( 0, 0, WIDTH, HEIGHT);
	
		//big basket
		page.setColor(Color.black);
		page.fillRect( 325, 250, 80, 80);
		//handles	
		page.fillRect( 325, 200, 5, 50);
		page.fillRect( 350, 200, 5, 50);
		page.fillRect( 375, 200, 5, 50);
		page.fillRect( 400, 200, 5, 50);
		// balloon
		page.setColor(Color.red);
		page.fillOval( 265, 30, 200, 200);
		// clouds
		page.setColor(Color.white);
		page.fillOval( 30, 140, 90, 90);	
		page.fillOval( 55, 130, 90, 90);
		page.fillOval( 60, 160, 90, 90);
		// birds
		page.setColor(Color.black);
		page.fillOval( 100, 200, 50, 19);
		page.fillOval( 125, 200, 50, 19);
		
		page.fillArc( 500, 50, 100, 50, 90, 180);
		// sun
		page.setColor(Color.yellow);
		page.fillOval( 5, 5, 70, 70);
		page.drawLine( 20, 80, 10, 130);
		page.drawLine( 75, 75, 120, 120);
		page.drawLine( 85, 30, 140, 25);
	}
	
	// main method
	public static void main(String[] args)
    	{
        	JFrame window = new JFrame("Janyl Jumadinova ");

      		// Add the drawing canvas and do necessary things to
     		// make the window appear on the screen!
        	window.getContentPane().add(new MyDrawing());
        	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	window.setVisible(true);
		window.setSize(600, 400);
        	
        	//window.pack();
    	}

} // end class 
