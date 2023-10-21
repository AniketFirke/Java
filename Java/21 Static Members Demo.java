public class MyClass {

   public static int x;
   public int y;

   public static void sample()
	{
   	System.out.println("Hello from static function");

      x  = 10;
      System.out.println(“x = ” + x);
   
     //System.out.println(“y = ” + y); - error since sample() is static and cannot access not 														//static variables (instance variables)

     //sayHello(); - error since sample() is static and cannot access non static function

   }
  
  public void sayHello() {
  
       Sytem.out.println(“Hello from regular function");
  }

}

public class MyClassTest
{
   public static void main(String args[])
   {
			MyClass.sample();
			MyClass.x  = 40;	

		 	MyClass c1 = new MyClass();
		 	c1.sayHello();
			c1.y = 30;
			
   }
}




Examples of Java Library static functions

Math.max()
Math.min()
Math.pow()
math.sqrt()
Math.log()
Math.log10()
Math.exp()


Examples of Java Library non-static functions

Scanner sc = new Scanner(System.in);
int x = sc.nextInt();

















