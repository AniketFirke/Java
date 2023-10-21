Perimeter.java

public class Perimeter {
    private int length;
    private int width;
    
    Perimeter () //Default Contructor
    {
        length = 0;
        width = 0;
        System.out.println("Inside Default Constructor \n Instance Variables initialized");    

    }
    Perimeter (int l, int w)   //Paramterized Constructor 
    {
        length=l;
	width=w;
        System.out.println("Inside parameterized Constructor \n Instance Variables initialized");
    }
    
    Perimeter (int x)
    {
      length = x;
      width = x;
    }
    public void setData (int x, int y)
    {
      length=x;
		width = y;
    }

    public int cal_perimeter()
    {
      int peri = 2 * (length + width);
		return peri;
    }  
}


//PerimeterTest.java

import java.util.Scanner;

public class Example_Perimeter_ConstOverload {

    public static void main(String[] args) 
	 {
        Perimeter p1 = new Perimeter(); //Default constructor called length=0, width=0

        int x1, y1;
        
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter two numbers");
        x1 = input.nextInt();
        y1 = input.nextInt();

        p1.setData(x1,y1);
        System.out.println("Perimeter =" + p1.cal_perimeter());
        
        Perimeter p2 = new Perimeter(10,30);//parameterized constructor is called l=10, w=30
        System.out.println("Perimeter =" + p2.cal_perimeter());
        
        Perimeter p3 = new Perimeter (5);
        System.out.println("Perimeter =" + p3.cal_perimeter());
    }
    
}
