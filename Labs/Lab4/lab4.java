//=================================================
// Honor Code: The work I am submitting is 
// a result of my own thinking and efforts.

// Grant Skinner
// CMPSC 111 Spring 2015
// Lab 4
// Date: Feb 13 2015
// Purpose: to Create my own masterpiece with Graphics.
//=================================================
import java.awt.*;
import javax.swing.*;

public class lab4 extends JApplet
{
    //-------------------------------------------------
    // Use Graphics methods to add content to the drawing canvas
    //-------------------------------------------------
    public void paint(Graphics page)
    {
	final int WIDTH = 600;
	final int HEIGHT = 400;
	Color darkbrown = new Color ( 78, 46, 40);
	Color brown = new Color( 181, 101, 29);
	// create your drawing
	page.setColor(Color.black);
	page.fillRect(0 , 0, WIDTH, HEIGHT);
	page.setColor(darkbrown);
	page.fillRect( 10 , 10, 580, 380);
	page.setColor(brown);
	page.fillOval( 65, 40, 450, 300);
	page.fillOval( 30, 30, 30, 30);
	page.fillOval( 540, 340, 30, 30);
	page.fillOval( 30, 340, 30, 30);
	page.fillOval( 540, 30, 30, 30);
	page.setColor(Color.blue);
	page.fillOval( 260, 80, 50, 50);
	page.setColor(Color.white);
	page.fillOval( 160, 155, 50, 50);
	page.setColor(Color.green);
	page.fillOval( 210, 250, 50, 50);
	page.setColor(Color.red);
	page.fillOval( 310, 250, 50, 50);
	page.setColor(Color.black);
	page.fillOval( 360, 155, 50, 50);
    }

    // main method that runs the program
    public static void main(String[] args)
    {
        	JFrame window = new JFrame(" Grant Skinner ");

      		// Add the drawing canvas and do necessary things to
     		// make the window appear on the screen!
        	window.getContentPane().add(new lab4());
        	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	window.setVisible(true);
		window.setSize(600, 400);
        	
    }
}
