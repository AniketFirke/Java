import java.util.Scanner;
public class GradeBook
{
	private String courseName;
	
	public void setCourseName(String name)
	{
		courseName = name;
	}
	piblic void getCourseName()
	{
		return courseName;
	}
	public void displayMessage()
	{
		System.out.println("Wellcome to the grade book for\n%s!\n"getCourseName());
	}
}


public class GradeBookTest
{
	public static void main(String args[])
	{
		Scanner input =  new Scanner(System.in);
		
		GradeBook myGradeBook = new GradeBook();

		System.out.printf("Intial course name is: %s\n\n",myGradeBook.getCourseName());
		
		System.out.println ("Please enter the course name:");
		String theName = input.nextLine();
		System.out.println ();

		myGradeBook.displayMessage();
	}
}