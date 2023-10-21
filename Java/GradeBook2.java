/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example_gradebook_sentinelcontrolled;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
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
        
        int total=0;
        int gradeCounter=0;
        int grade;
        double average;
        
        System.out.println("Enter grade or -1 to quit");
        grade = sc.nextInt();
        
        while (grade != -1)
        {
            total = total + grade;
            gradeCounter = gradeCounter + 1;
            
            System.out.println("Enter grade to continue or -1 to quit");
            grade = sc.nextInt();            
        }
       
        if (gradeCounter != 0)
        {
            average = (double) total/gradeCounter;
            
            System.out.printf("\nTotal of %d grades is = %d", gradeCounter, total);
            System.out.printf("\nClass Average is %.2f", average);
        
        }
        
    }
}
