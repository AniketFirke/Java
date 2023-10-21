public class CounterControlledWhile
{
	public static void main(String args[])
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