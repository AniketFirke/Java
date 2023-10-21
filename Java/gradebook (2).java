class GradeBook
{
    public void displayMessage()
    {
        System.out.println("Welcome to the Grade Book!");
    }
}

public class GradeBookTest
{
    public static void main(String args[])
    {
        GradeBook myGradeBook = new GradeBook();
        
        myGradeBook.displayMessage();
    }
}