
package example_gradebook_countercontrolled;

import java.util.*;

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
    
    public void determineClassAverage()
    {
        Scanner sc = new Scanner(System.in);
        
        int total = 0;
        int gradeCounter = 1;
        int grade;
        float average;
        
        while (gradeCounter <= 10)
        {
            System.out.println("Enter Grade of Student " + gradeCounter + ": ");
            grade = sc.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }
        
        average = (float)total/10;
        System.out.println("Total of 10 student grades =" + total);
        System.out.println("Class Average = " + average);
    }
}
