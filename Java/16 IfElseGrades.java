public class IfElseGrades {
  
    public static void main(String[] args) {
    
        	int grade = 0;
        	Scanner sc = new Scanner (System.in);
        
        	System.out.println("Enter Student Grade:");
        	grade = sc.nextInt();
        
        	if ( grade >= 90 ) 
				System.out.println( "A" ); 
			else if (grade >= 80)
				System.out.println( "B" ); 
        else if (grade >= 70)
            System.out.println( "C" );
        else if (grade >= 60)
            System.out.println( "D" );
        else if (grade >= 50)
            System.out.println( "E" );
        else
            System.out.println( "F" );
    }  
}
