import java.util.Scanner;
public class Array_Avg
{
	public static void main(String args[ ])
	{
		int [ ] a  = new int [10];
		Scanner sc = new Scanner(System.in);	
		int total = 0;
		float avg = 0;		

		for(int i = 0; i < 10; i++)
		{
			System.out.println("Enter marks for student : " + i+1);
			a[i] = sc.nextInt();

			total = total + a[i];
		}

		avg = (float) total/10;
		System.out.println("Average marks = " + avg);
	}
}




















public class Example_Array_VariableLengthArgList {

    public static double average(double... numbers)
    {
        double total = 0.0;
        
        for(double d : numbers)
            total = total + d;
        
        return total/numbers.length;
    }
    
    public static void main(String[] args) {
        
        double d1 = 10.0;
        double d2 = 20.0;
        double d3 = 30.0;
        double d4 = 40.0;
    
    System.out.printf("d1=%.1f\nd2=%.1f\nd3=%.1f\nd4=%.1f\n\n", d1,d2,d3,d4);
    
    System.out.printf("Average of d1 and d2 is %.1f\n", average(d1,d2));
    System.out.printf("Average of d1, d2 and d3 is %.1f\n", average(d1,d2, d3));
    System.out.printf("Average of d1, d2, d3 and d4 is %.1f\n", average(d1,d2, d3, d4));
    
    }
    
}
