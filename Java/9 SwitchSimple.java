public class Example_SimpleSwitch 
{   
    public static void main(String[] args) 
	 {   
    	Scanner input = new Scanner (System.in);

      int grade=0; 

      System.out.printf("Enter integer grade of student between 0 to 100");
      grade = input.nextInt();

     	switch(grade/10)
      {
      	case 9:
      	case 10:
      		System.out.println("Student Achieved A Grade");
		      break;
         case 8:
      		System.out.println("Student Achieved B Grade");
            break;
         case 7:
      		System.out.println("Student Achieved C Grade");
            break;
         case 6:
      		System.out.println("Student Achieved D Grade");
            break;
         case 5:
      		System.out.println("Student Achieved E Grade");
            break;
         default:
      		System.out.println("Student Failed");
            break;
      }                 
   } 
}


