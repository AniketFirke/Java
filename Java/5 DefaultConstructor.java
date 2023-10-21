///Perimeter.java

public class Perimeter {
    private int length;
    private int width;
    
    Perimeter () //Default Contructor
    {
        length = 0;
        width = 0;
        System.out.println("Inside Default Constructor \n Instance 						Variables initialized");    

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



///PerimeterTest.java

public class PerimeterTest {

    public static void main(String[] args) {
        
        	Perimeter p1 = new Perimeter(); //Default constructor called 					length=0, width=0
        	p1.setData(10,20);
        	System.out.println("Perimeter =" + p1.cal_perimeter());
        
        	Perimeter p2 = new Perimeter();//Default constructor is called
        	p2.setData(20,5);
				System.out.println("Perimeter =" + p2.cal_perimeter());   
    }
    
}
