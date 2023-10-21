/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example_gradebook_switchmultiselect;

import java.util.Scanner;


public class GradeBook {
    private String courseName;
    
    private int total;
    private int gradeCounter;
    private int aCount;
    private int bCount;
    private int cCount;
    private int dCount;
    private int eCount;
    private int fCount;
    
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
    
    public void inputGrades()
    {
        Scanner input = new Scanner (System.in);
        int grade=0;
        System.out.printf("Enter integer grades from 0 to 100 or -1 to terminate");
        grade = input.nextInt();
        while (grade != -1)
        {
            total += grade;
            ++gradeCounter;
            
            incrementLetterGradeCounter(grade);
            System.out.printf("Enter integer grades from 0 to 100 or -1 to terminate");
            grade = input.nextInt();                        
        }
            System.out.println("count=" + gradeCounter);
            System.out.println("total=" + total);

    }
    
    public void incrementLetterGradeCounter(int grade)
    {
        switch(grade/10)
        {
            case 9:
            case 10:
                    ++aCount;
                    break;
            case 8:
                   ++bCount;
                    break;
            case 7:
                ++cCount;
                break;
            case 6:
                ++dCount;
                   break;
            case 5:
                ++eCount;
                break;
            default:
                ++fCount;
                break;
        }
    
    }

    public void displayGradeReport()
    {
        System.out.println("Grade Report");
        
        if (gradeCounter !=0)
        {
            double avg = (double) total/gradeCounter;
            System.out.printf("\nTotal of %d grades is =%d", gradeCounter, total);
            System.out.printf("\nClass Avegare = %.2f", avg);
            
            System.out.println("\nA Grade Count =" + aCount);
            System.out.println("B Grade Count =" + bCount);
            System.out.println("C Grade Count =" + cCount);
            System.out.println("D Grade Count =" + dCount);
            System.out.println("E Grade Count =" + eCount);
            System.out.println("F Grade Count =" + fCount);
        
        }
    
    }
}
