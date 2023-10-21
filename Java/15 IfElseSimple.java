public class Example_SimpleIfElse {

        public static void main(String[] args) {
   
        int grade = 0;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter Student Grade:");
        grade = sc.nextInt();
        
        if ( grade >= 90 ) 
            System.out.println( "Passed" ); 
		  else 
            System.out.println( "Failed" ); 
    }  
    
}