import java.util.*;
 
public class Conversion {
  public static void main(String[] args) {
    float temperature;
    Scanner in = new Scanner(System.in);      
 
    System.out.println("Enter temperature in Fahrenheit");
    temperature = in.nextInt();
 
    temperature = ((temperatue - 32)*5)/9;
 
    System.out.println("Temperature in Celsius = " + temperature);
	
    float length;
    System.out.println("Enter a length in Inches");
    length = in.nextInt();

    length = ((length * 2.54));
    System.out.println("Length in Centimeters = " + length);
  }
}
