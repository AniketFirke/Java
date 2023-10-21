import java.util.Scanner;
public class Example_EvenOdd {

    
    public static void main(String[] args) {


			int num;
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a number: ");
			num = input.nextInt();

			if(num%2 == 0)
			{
				System.out,println("The number " + num + "is even.");
			}
			else
			{
				System.out,println("The number " + num + "is odd.");
			}


    }
    
}