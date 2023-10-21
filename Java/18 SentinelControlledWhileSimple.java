public class SentinelControlledWhile
{
	public static void main(String args[])
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