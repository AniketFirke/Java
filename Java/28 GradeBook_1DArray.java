public class GradeBook {
    private String courseName;
    private int [] grades;
      
    GradeBook(String name, int [] gradesArray) //parameterized Constructor
    {
        courseName = name;
        grades = gradesArray;
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

    public void processGrades()
    {
        outputGrades();
        System.out.println("Class Average = " + getAverage());
        System.out.println("Lowest Grade =" + getMinimum() + "\nHighest Grade ="+ getMaximum());
        outputBarChart();
    }
    
    public int getMinimum()
    {
        int lowGrade = grades[0];
        for(int grade: grades)
        {
            if (grade < lowGrade)
                lowGrade = grade;
        }
        return lowGrade;
    }

    public int getMaximum()
    {
        int highGrade = grades[0];
        for(int grade: grades)
        {
            if (grade > highGrade)
                highGrade = grade;
        }
        return highGrade;
    }

    public double getAverage()
    {
        int total = 0;
        for(int grade: grades)
            total += grade;
        return (double) total/grades.length;
    }
    
    public void outputBarChart()
    {
        System.out.println( "Grade distribution:" );
        int[] frequency = new int[ 11 ];
        for ( int grade : grades )
            ++frequency[ grade / 10 ];
        for ( int count = 0; count < frequency.length; count++ )
        {
            // output bar label ( "00-09: ", ..., "90-99: ", "100: " )
            if ( count == 10 )
                System.out.printf( "%5d: ", 100 );
            else
                System.out.printf( "%02d-%02d: ",count * 10, count * 10 + 9 );

            // print bar of asterisks
            for ( int stars = 0; stars < frequency[ count ]; stars++ )
                System.out.print( "*" );

            System.out.println(); // start a new line of output
        } // end outer for
    } // end method outputBarChart

    public void outputGrades()
    {
        System.out.println( "The grades are:\n" );
        
        //output each student's grade
        for ( int student = 0; student < grades.length; student++ )
            System.out.printf( "Student %2d: %3d\n",student + 1, grades[ student ] );
    } // end method outputGrades
}


public class Example_Array_GradeBook1D {

    public static void main(String[] args) {
        int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
    
        GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming",gradesArray );
        myGradeBook.displayMessage();
        myGradeBook.processGrades();
    
    }
    
}
