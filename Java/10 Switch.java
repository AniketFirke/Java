public class Example_Switch {

    
    public static void main(String[] args) {
        
    	Scanner input = new Scanner (System.in);
      int grade=0, gradeCounter = 0, total = 0; 
		int aCount, bCount, cCount, dCount, eCount, fCount;

      System.out.printf("Enter integer grades 1st student from 0 to 100 or -1 to terminate");
      grade = input.nextInt();

      while (grade != -1)
      {
	      total += grade;
         ++gradeCounter;

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
                   
        System.out.printf("Enter integer grades from 0 to 100 or -1 to terminate");
        grade = input.nextInt();                        
    }
 		if (gradeCounter > 0)
		{
	   	System.out.println("count=" + gradeCounter);
   		System.out.println("total=" + total);
			float avg = (float) total/gradeCounter;
			System.out.println("Agerage Grade =" + avg);
			System.out.println("Students in A grade =" + aCount + "\nB Grade=" + bCount +
				"\nC Grade = " + cCount + "\nD Grade = " + dCount + "\nE Grade = " + eCount +
				"\nFailed= " + fCount);
		}
 }
    
}
