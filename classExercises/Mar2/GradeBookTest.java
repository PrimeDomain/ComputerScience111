//=================================================
// Class Example using Math Class
// March 2, 2015
// CMPSC 111, Spring 2015
// Janyl Jumadinova
//
// Purpose:  Create a class GradeBookTest to instantiate GradeBook class
//=================================================
import java.util.Scanner;

public class GradeBookTest {
    public static void main (String args[]) {
        GradeBook myGradeBook  = new GradeBook ();
        Scanner in = new Scanner (System.in);

        System.out.println("Initial course name is "
                +myGradeBook.getCourseName());
        System.out.println("Please enter a course name");
        String courseName = in.nextLine();

        myGradeBook.setCourseName(courseName);

        System.out.println("Before!");
        myGradeBook.displayMessage(courseName);
        System.out.println("After!");
    }
}
