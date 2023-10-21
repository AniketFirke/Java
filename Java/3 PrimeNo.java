import java.util.Scanner;

public class PrimeNo
{
	public static void main(String args[])
	{
		Scanner input = new Scanner (System.in);
		
		int num;
		boolean flag = false;
		
		System.out.println("Enter a number:");
	
		num = input.nextInt();

		for(int i = 2;i<=num/2; i++)
		{
			if(num%i == 0)
			{
				flag = true;
				System.out.println("Number is not prime");
				break;
		}
   } // end of for loop
	
		if(flag==false)
			System.out.println("Number is prime");

	}
}




 





