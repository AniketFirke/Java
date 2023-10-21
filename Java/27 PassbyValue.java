public class Sample{
    public static void main(String args)
  {
	int x = 10, y = 20;													x=10         y=20
	Sample2 s1 = new Sample2();
	System.out.println("x = " + x + " y = " + y);						x = 10 y = 20
	s1.doubleValue(x , y);
	System.out.println("x = " + x + " y = " + y);						x = 10  y = 20
  }
}

public class Sample2
{
	public void doubleValue(int a, int b)							a = 10            b = 20
	{
		a = a * 2;														a = 20		  
		b = b * 2;														b = 40
	}
}