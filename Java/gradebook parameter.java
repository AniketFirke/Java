//error

import jav.util.Scanner;
class GradeBook
{
    public void displayMessage(String courseName)
    {
        System.out.printf("Welcome to the Grade Book for\n%s!\n",courseName);
    }
}

public class GradeBookTest
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        GradeBook myGradeBook = new GradeBook();
        
        System.out.println("Please enter the course name:");
        String nameOfCourse = input.nextLine();
        System.out.println();
        
        myGradeBook.displayMessage();
    }
}