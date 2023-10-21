abstract class X
{
	abstract void callMe();
	public void callMeto()
	{
 	    System.out.println("This is concreat function in class X");
	}
	abstract int Add(int x1 , int y1);

}
class Y extends X 
{
     
	void callMe()
	{
	    System.out.println("class Y is implementation of CallME");
	}
	    int Add(int x1,int y1)
	{
	    return(x1+y1);	
	}
}
class z
{
	 void callMe()
	{
	    System.out.println("class Z implementation of CallMe");
	}
    	int Add(int x1,int y1)
	{
	    int ans=2*(x1+y1);
	
	
	public void sayHello()
	{
	    System.out.println("Welcome to abstract class learning");
	}
}
public class Test
{
	public static void main(String args[])
	{
	
	    Y y = new Y();
	    y.callMe();
	    y.callMeto();
	}
}