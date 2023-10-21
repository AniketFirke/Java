import java.util.Scanner;

public class Primeno 
{

    public static void main(String[] args) 
    {
        int i = 0;
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        boolean flag = false;
        num = sc.nextInt();

        for (i = 2; i <= num / 2; i++) 
        {
            if (num % i == 0) {
                System.out.println("Number is not prime");
                flag = true;
                break;
            }

        }
        if (flag == false)
            System.out.println("Number is prime");

    }
}



Output:
Enter a number:
8
Number is not prime

Enter a number:
7
Number is prime
