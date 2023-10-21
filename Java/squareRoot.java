import java.util.Scanner;  
public class Main   
{  
    public static void main(String[] args)    
    {
        //Take input from the user
        //Create an instance of the Scanner class
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a number: ");  
        int n = sc.nextInt();  
        System.out.println("The square root of "+ n+ " is: "+squareRoot(n));  
    }  
    //user-defined method to find the square root  
    public static double squareRoot(int num)   
    {  
        //temporary variable  
        double temp;  
        double sqrtroot=num/2;  
        do   
        {  
            temp=sqrtroot;  
            sqrtroot=(temp+(num/temp))/2;  
        }   
        while((temp-sqrtroot)!= 0);  
        return sqrtroot;
	}
}