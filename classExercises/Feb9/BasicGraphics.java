//=================================================
// Class Example using Graphics
// February 9, 2015
// Grant Skinner
// 
// Purpose: Illustrate Graphics class methods
//=================================================
import javax.swing.*;
import java.awt.*;

public class BasicGraphics extends javax.swing.JApplet  {
	public void paint(Graphics g) {
        	/* Draw the square. */
          	g.setColor(Color.red);
          	g.fillRect(10, 20, 40, 40);
		g.setColor(Color.blue);
		g.fillRect(40, 40, 20, 20);
		g.setColor(Color.green);
		g.drawOval(100, 100, 50, 50);
		g.setColor(Color.black);
		g.drawLine(150, 10, 10, 150); 
		g.setColor(Color.magenta);
		g.drawArc(200 , 200, 100, 100, 190, 70);
        }  // end paint()

	public static void main(String[] args)
    	{
        	JFrame window = new JFrame("Grant Skinner");

      		// Add the drawing canvas and do necessary things to
     		// make the window appear on the screen!
        	window.getContentPane().add(new BasicGraphics());
        	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	window.setVisible(true);
		window.setSize(600, 400);
        	
        	//window.pack();
    	}

} // end class BasicGraphics
