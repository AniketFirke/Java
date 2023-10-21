

package example_gradebook_paraconst;

public class GradeBook {
    private String courseName;
      
    GradeBook(String name) //parameterized Constructor
    {
        courseName = name;
    }
    
    public void setCourseName(String name)
    {
        courseName = name;
    }
    public String getCourseName()
    {
        return courseName;
    }
    public void displayMessage()
    {
        System.out.println("Welcome to GradeBook of " + getCourseName());
    }

}
