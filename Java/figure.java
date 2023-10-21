abstract class figure 
{
    protected double dim 1;
    protected double dim2;
    
    Figure (double a, double b) 
    { 
        dim 1=a;
        dim 2=b;
    }
    abstract double area ();
}
class Rectangle extends Figuref Rectangle
{
     Rectangle(double a, double bl Super (a,b)
     {
          super(a,b);
     }
     double area ()
     {
          System.out.println("Inside gred for Rectangle");
          return dim 1 * dim 2;
     }
}
 class Triangle ExtendsFigure 
{
   Triangle (double a, double b)
   {
       super(a,b);
   }
   double area ()
   {
       System.out("Inside the area of Triangle");
       return dim1*dim/2;
   }
}
class cincle extends Figure
{
    Circle (double a, double b)
    { 
        Super(a, b);
    }
    double area()
    {
        System.out.printh ("Inside area of circle");
        return 3.14* dim 1 *dim 1;
    }
}
public class Example_Abstract Class Sub Class Ref
{ 
    public static void main (String []ags)
    Rectangle "Rectange few (10,10); 
    Triangle t = new Triangle (10,8); 
    Circle C = new Circle (25,0);
    
     Figure f;
     
     F = r;
     System.out.