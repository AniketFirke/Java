import java.util.Scanner;
public class example_exceptionhandling{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        try
        {
            System.out.println("please enter an integer numerator:");
            int numerator=input.nextInt();
            System.out.println("please enter an integer denominator:");
            int denominator=input.nextInt();

            int result=division(numerator,denominator);
            System.out.printf("\n Result:%d/%d=%d\n",numerator,denominator,result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("division by zero:"+e);
        }
        System.out.println("after catch statement");
    }
    public static int division(int numerator,int denominator)
    {
        return(numerator/denominator);
    }
}