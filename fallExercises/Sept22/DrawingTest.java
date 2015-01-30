import javax.swing.*;

public class DrawingTest
{
    public static void main(String[] args)
    {
        	JFrame window = new JFrame("Janyl Jumadinova ");

      	// Add the drawing canvas and do necessary things to
     	// make the window appear on the screen!
        	window.getContentPane().add(new BasicGraphics());
        	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	window.setVisible(true);
        	window.pack();
    }
}

