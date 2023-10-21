public class testrtc
{
public static void main(String [] args)
{
	rectangles r=new rectangles(10,10);
	triangle t=new triangle (10,8);
	circles c=new circles(5,0);

	figure f;
	
	f=r;
	System.out.println("area of rectangle"+f.area());
	
	
	f=t;
	System.out.println("area of triangle"+f.area());

	
	f=c;
	System.out.println("area of circle"+f.area());
}
}