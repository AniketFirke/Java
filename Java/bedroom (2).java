
\\error program


public class Room
{
    protected int length;
    protected int breadth;
    Room (int a , int b)
    {
        length = a;
        breadth = b;
    }
        int area()
    {
        return (length * breadth);
    }
}
 class bedroom extends Room
 {
    private int fourthheight;
    
    bedroom ( int l, int b , int h);
    {
        super(l.b);
        heighth = h;
    }
        int Volume1()
        {
            return (length * breadth * height);
        }
 }
public class Example_inheritance 
{
      public static void main (string args [])
      {
             BedRoom b = new BedRoom(10,20,30);
             int area = b. area();
             int Vol = b.volume();
             System.out.println ("Area = " + area);
             System.out.println("volume = " + vol);
       }
}