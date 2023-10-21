import java.util.*;
public class Exception_Handing
{	
	public static int div(int n,int d)
		{
			return n/d;
		}
	 public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			boolean contuinueLoop = true;
			do
			{
				try
				{
					System.out.println("please enter a numberator");
					int n = sc.nextInt();
					System.out.println("please enter denominator");
					int d = sc.nextInt();
 
					int result = div(n,d);
					System.out.printf("Result : %d/%d = %d\n",n,d,result);
					contuinueLoop = false;
				}
				catch (InputMismatchException inputMismatchException)
				{
					System.err.printf("\nException : %s\n",inputMismatchException);
							sc.nextLine();
					System.out.println("You must enter integers . Please try again\n");
				}
				catch (ArithmeticException arithmeticException)
				{
					System.err.printf("\nException : %s\n",arithmeticException);
					System.out.println("Zero is invalid denominator . Please try again\n");
				}	
			}
			while(contuinueLoop);
		}			
}