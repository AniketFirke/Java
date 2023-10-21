Rectangle.java

public class Rectange
{
	private int length;
	private int width;

	public void setLength (int l)
	{
		length = l;	
	}

	public void setWidth(int w)
	{
		width = w;
	}

	public int getLength()
	{
		return (length);
	}
	public int getWidth()
	{
		return (width);
	}
	public int perimeter ()
	{

		int peri = 2*(length + width);
		return (peri);
		
	}

	public int area()
	{
		int a1 = length * width;
		return (a1);
	}

}


Test.java

public class Test
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();

		int l, w;

		System.out.println("Enter Lenght and width of Rectangle1:");
		l = input.nextInt();
		w = input.nextInt();

		r1.setLength(l);
		r1.setWidth(w);

		System.out.println("Rectangle 1 length = " + r1.getLength() + " width = " + 				r1.getWidth());

	System.out.println("Area = " + r1.area());
	System.out.println("Perimeter = " + r1.perimeter());
		
		
		System.out.println("Enter Lenght and width of Rectangle 2:");
		l = input.nextInt();
		w = input.nextInt();


		r2.setLength(l);
		r2.setWidth(w);

		System.out.println("Rectangle 2 length = " + r2.getLength() + " width = " + 							r2.getWidth());

		int area2 = r2.area();
		System.out.println("Area = " + area2);
		
		int peri2 = r2.perimeter();
		System.out.println("Perimeter = " + peri2);
	
	}
}


Save both classes in separate files.
Compile separately.
Run Test.java

