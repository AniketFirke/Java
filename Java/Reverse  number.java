import java.util.Scanner;
 
public class Number  
{
 
    // Main driver method
    public static void main(String[] args)
    {
        // creating variables
        int num, rem;
 
        // Creating variables and initializing at same time
        int rev = 0, sum = 0;
 
        // Using scanner to take input from user
        // Scanner sc = new Scanner(System.in);
 
        // Remove comments from lineNo20
        // to take dynamic user input
 
        // Displaying message
        System.out.println("Enter the number: 25 ");
 
        // Taking input from user
        // num = sc.nextInt();
 
        // Hard coded input
        num = 25;
 
        // Do-while loop for iteration over digits of number
        do {
 
            // Step1: Modulo with 10 to get last digit
            rem = num % 10;
 
            // Step2: Reverse the number
            rev = rev * 10 + rem;
 
            // Sum of the digits of number
            sum = sum + rem;
 
            // Step3: Dividing number by 10 to lose last
            // digit
            num = num / 10;
        }
 
        // Condition check
        // Remember: By this time 1 iteration is over even
        // if conditions false
        while (num > 0);
 
        // Printing the reverse number
        System.out.println("\nReverse of given number: "
                           + rev);
 
        // Summing up digits of number as shown in above
        // steps
        System.out.println("\nSum of digits of given number: "
                           + sum);
    }
}



Output:-
Enter the number: 25 
Reverse of given number: 52
Sum of digits of given number: 7