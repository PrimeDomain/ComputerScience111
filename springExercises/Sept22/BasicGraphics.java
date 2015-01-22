import javax.swing.JApplet;
import java.awt.*;

public class BasicGraphics extends javax.swing.JApplet  {
   	public void paint(Graphics g) {
   		/* Draw the square. */
   		g.setColor(Color.red);
   		g.fillOval(10, 20, 40, 40);
  	}  // end paint()
} // end class BasicGraphics
