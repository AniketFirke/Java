///Perimeter.java

public class Perimeter {
    private int length;
    private int width;
    
    Perimeter (int l, int w) //Parameterized Contructor
    {
        length = l;
        width = w;
        System.out.println("Inside Parameterized Constructor \n Instance 						Variables initialized");    
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
        
        	Perimeter p1 = new Perimeter(10,5); //Parameterized constructor 					called 					
				System.out.println("Perimeter =" + p1.cal_perimeter());
        
        	Perimeter p2 = new Perimeter(0,0);//Parameterized constructor 						is called
        	p2.setData(20,10);
				System.out.println("Perimeter =" + p2.cal_perimeter());   
    }
}
