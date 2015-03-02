//=================================================
// Class Example using Math Class
// March 2, 2015
// CMPSC 111, Spring 2015
// Janyl Jumadinova
//
// Purpose:  Define class GradeBook with a member method displayMessage
//=================================================


public class GradeBook {

    private String courseName = "Music101";

    public void setCourseName (String name)
    {
        courseName = name;
    }

    public String getCourseName()
    {
        return courseName;
    }
    // method to display a welcome message
    public void displayMessage(String name) {
        System.out.println("Welcome to the Grade Book for "+name);
    }
}
