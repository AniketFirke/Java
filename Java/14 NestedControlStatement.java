public class Example_NestedControlSt {

 
    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;
        int result;
        
        while (studentCounter <= 10)
        {
            System.out.println("Enter result : 1=pass, 2 = fail :");
            result = sc.nextInt();
            
            if (result == 1)
                passes = passes + 1;
            else
                failures = failures + 1;

            studentCounter = studentCounter + 1;
        }
        
        System.out.printf("\nPassed = %d\nFailed = %d", passes, failures);
    }
    
}
