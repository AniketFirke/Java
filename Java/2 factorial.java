import java.util.Scanner;

public class example
{
	public static void main(String args[])
	{
		Scanner input = new Scanner (System.in);
		
		int num, fact = 1;
		
		System.out.println("Enter a number:");
		num = input.nextInt();

		for(int i = 1;i<=num; i++)
		{
			fact = fact * i;
		}
	
		System.out.println("factorial of " + num " is " + fact);

	}
}

